package com.wdys.yxlm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wdys.yxlm.core.service.impl.GenericServiceImpl;
import com.wdys.yxlm.domain.Area;
import com.wdys.yxlm.domain.Comment;
import com.wdys.yxlm.domain.CommentReplace;
import com.wdys.yxlm.domain.Firend;
import com.wdys.yxlm.domain.Video;
import com.wdys.yxlm.service.AreaService;
import com.wdys.yxlm.service.CommentReplaceService;
import com.wdys.yxlm.service.CommentService;
import com.wdys.yxlm.service.FirendService;
import com.wdys.yxlm.service.VideoService;

@Service
public class FirendServiceImpl extends GenericServiceImpl<Firend, Long> implements FirendService {
	@Autowired
	private CommentService commentService;
	@Autowired
	private VideoService videoService;
	@Autowired
	private CommentReplaceService commentReplaceService;
	@Autowired
	private AreaService areaService;
	//删除主表的话，先删除子表，再删除主表
	public void deleteId(Long id) {
		List<Comment> comments = commentService.findList(" where u.firend.id = ?", id);
		if (comments != null && comments.size() > 0) {
			for (Comment comment : comments) {
				commentService.delete(comment.getId());

			}
		}

		List<Video> videos = videoService.findList(" where u.firend.id = ?", id);
		if (videos != null && videos.size() > 0) {
			for (Video video : videos) {
				videoService.delete(video.getId());

			}
		}

		List<CommentReplace> commentReplaces = commentReplaceService.findList(" where u.firend.id = ?", id);
		if (commentReplaces != null && commentReplaces.size() > 0) {
			for (CommentReplace commentReplace : commentReplaces) {
				commentReplaceService.delete(commentReplace.getId());

			}
		}

		List<Area> areas = areaService.findList(" where u.firend.id = ?", id);
		if (areas != null && areas.size() > 0) {
			for (Area area : areas) {
				areaService.delete(area.getId());

			}

		}
		genericRepository.delete(id);
	}
	//删除多个
	public void deleteAll(Long[] ids){
		for(Long id:ids){
			deleteId(id);
		}
		
	}
}
