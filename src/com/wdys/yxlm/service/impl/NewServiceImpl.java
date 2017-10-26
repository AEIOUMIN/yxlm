package com.wdys.yxlm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wdys.yxlm.core.service.impl.GenericServiceImpl;
import com.wdys.yxlm.core.util.PagedList;
import com.wdys.yxlm.domain.Comment;
import com.wdys.yxlm.domain.New;
import com.wdys.yxlm.service.CommentService;
import com.wdys.yxlm.service.NewService;

@Service
public class NewServiceImpl extends GenericServiceImpl<New, Long> implements NewService {
	@Autowired
	private CommentService commentService ;
	
	@Transactional
	@Override
	public void deleteByNewId(Long id) {
		New newOne = genericRepository.find(id);
		newOne.setTopic(null);
		List<Comment> comments	=commentService.findList(" where u.news.id=?0 ", id);
			if(comments!=null){
				for(Comment comment:comments){
					commentService.delete(comment.getId());
				}
			}
			
		genericRepository.delete(id);
	}
	@Transactional
	@Override
	public void deleteByNewIds(Long[] ids) {
		for (Long id : ids) {
			deleteByNewId(id);
		}

	}
	@Override
	public PagedList<New> findPage(int pageIndex, int pageSize, Long topicId) {
		if(topicId!=null){
			return findPage(pageIndex, pageSize, "  where u.topic.id =?0 ", topicId);
		}
		return findPage(pageIndex, pageSize, "  where u.topic.id =?0 ", 6L);
	}

}
