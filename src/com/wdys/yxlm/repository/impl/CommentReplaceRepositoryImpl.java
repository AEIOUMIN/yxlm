package com.wdys.yxlm.repository.impl;

import org.springframework.stereotype.Repository;

import com.wdys.yxlm.core.repository.impl.GenericRepositoryImpl;
import com.wdys.yxlm.domain.CommentReplace;
import com.wdys.yxlm.repository.CommentReplaceRepository;

@Repository
public class CommentReplaceRepositoryImpl 
			extends GenericRepositoryImpl<CommentReplace, Long>
			implements CommentReplaceRepository{

}
