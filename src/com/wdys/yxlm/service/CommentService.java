package com.wdys.yxlm.service;

import com.wdys.yxlm.core.service.GenericService;
import com.wdys.yxlm.core.util.PagedList;
import com.wdys.yxlm.domain.Comment;

public interface CommentService extends GenericService<Comment, Long>{

	PagedList<Comment> findPageByFirendNewGamer(int pageIndex, int pageSize,Long id, Long firendId, Long newId,
			
			Long gamerecordId);

	PagedList<Comment> findByNewAndGameAndUser(int pageIndex, int pageSize, Long newId, Long firendId,Long gameId);

	void deleteByTopic(Long id);

}
