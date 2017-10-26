package com.wdys.yxlm.service.impl;

import org.springframework.stereotype.Service;

import com.wdys.yxlm.core.service.impl.GenericServiceImpl;
import com.wdys.yxlm.core.util.PagedList;
import com.wdys.yxlm.domain.Comment;
import com.wdys.yxlm.service.CommentService;

@Service
public class CommentServiceImpl extends GenericServiceImpl<Comment, Long> implements CommentService {

	@SuppressWarnings("unchecked")
	@Override
	public PagedList<Comment> findPageByFirendNewGamer(int pageIndex, int pageSize, Long id, Long firendId, Long newId,
			Long gamerecordId) {
		return (PagedList<Comment>) genericRepository.findPage(pageIndex, pageSize,
				" where u.id=?0 and u.firend.id=?1 and u.news.id=?2 and u.gamerecord =?3 ", id, firendId, newId,
				gamerecordId);
	}

	@Override
	public PagedList<Comment> findByNewAndGameAndUser(int pageIndex, int pageSize, Long newId,
			Long firendId,Long gameId) {

		return findPage(pageIndex, pageSize, " where u.news.id =?0  and u.firend.id=?1 and u.gamerecord =?2", newId,
				 firendId,gameId);
	}

	@Override
	public void deleteByTopic(Long id) {
		
	
		
	}

}
