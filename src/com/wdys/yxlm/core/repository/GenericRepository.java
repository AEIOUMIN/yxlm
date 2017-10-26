package com.wdys.yxlm.core.repository;

import java.util.List;

import com.wdys.yxlm.core.util.PagedList;

public interface GenericRepository<T,PK> {
		//新增
		public void add(T t);
		//更新
		public void update(T t);
		//根据id删除
		public void delete(PK id);
		//批量删除
		public void delete(PK[] ids);
		
		//根据id查找
		public T find(PK id);
		//根据条件查找
		public T find(String where,Object...params);
		
		//查找记录数
		public Long totalCount(String where,Object...params);
		//查询所有
		public List<T> finaAll();
		//根据条件查询
		public List<T> findList(String where,Object...params);
		//查询一页数据
		public List<T> findPage(int pageIndex,int pageSize,String where,Object...params);
		
}
