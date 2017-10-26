package com.wdys.yxlm.core.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wdys.yxlm.core.repository.GenericRepository;
import com.wdys.yxlm.core.service.GenericService;
import com.wdys.yxlm.core.util.PagedList;


public abstract class GenericServiceImpl<T ,PK extends Serializable> implements GenericService<T, PK>{
	@Autowired
	protected GenericRepository<T, PK>  genericRepository;
	@Transactional
	@Override
	public void add(T t) {
		genericRepository.add(t);
		
	}
	@Transactional
	@Override
	public void update(T t) {
		genericRepository.update(t);
		
	}
	@Transactional
	@Override
	public void delete(PK id) {
		genericRepository.delete(id);
		
	}
	@Transactional
	@Override
	public void delete(PK[] ids) {
		genericRepository.delete(ids);
		
	}
	@Transactional(readOnly=true)
	@Override
	public T find(PK id) {
		return genericRepository.find(id);
		
	}
	@Transactional(readOnly=true)
	@Override
	public T find(String where, Object... params) {
		
		return genericRepository.find(where, params);
	}
	@Transactional(readOnly=true)
	@Override
	public Long totalCount(String where, Object... params) {
		
		return genericRepository.totalCount(where, params);
	}
	@Transactional(readOnly=true)
	@Override
	public List<T> finaAll() {
		
		return genericRepository.finaAll();
	}
	@Transactional(readOnly=true)
	@Override
	public List<T> findList(String where, Object... params) {
		
		return genericRepository.findList(where, params);
	}
	@Transactional(readOnly=true)
	@Override
	public PagedList<T> findPage(int pageIndex, int pageSize, String where, Object... params) {
		long totalCount = totalCount(where, params);
		List<T> rows =genericRepository.findPage(pageIndex, pageSize, where, params);
		return new PagedList<>(pageIndex, totalCount, rows, pageSize);
	}
	@Transactional(readOnly=true)
	@Override
	public PagedList<T> findPage(int pageIndex,int pageSize){
		
		return findPage(pageIndex, pageSize, "");
		
	}

}
