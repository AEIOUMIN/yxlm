package com.wdys.yxlm.repository.impl;

import org.springframework.stereotype.Repository;

import com.wdys.yxlm.core.repository.impl.GenericRepositoryImpl;
import com.wdys.yxlm.domain.Comment;
import com.wdys.yxlm.repository.CommentRepository;

@Repository
public class CommentRepositoryImpl
			extends GenericRepositoryImpl<Comment, Long>
			implements CommentRepository{

}
