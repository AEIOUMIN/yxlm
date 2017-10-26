package com.wdys.yxlm.core.util;

import java.util.List;

public class PagedList<T> {
	//当前页
	private int index;
	//总页数
	private int pages;
	//总记录      
	private long total;
	//一页数据
	private List<T> rows;
	//当前页记录数
	private int pageSize;
	
	public PagedList() {
	}

	public PagedList(int pageIndex, long totalCount, List<T> rows, int pageSize) {
		this.index = pageIndex;
		this.pages = (int)((totalCount-1)/pageSize+1);
		this.total = totalCount;
		this.rows = rows;
		this.pageSize = pageSize;
		
		this.index=Math.min(this.index, this.pages);
		this.index=Math.max(this.index, 1);
	}

	public int getIndex() {
		return index;
	}

	public int getPages() {
		return pages;
	}

	public long getTotal() {
		return total;
	}

	public List<T> getRows() {
		return rows;
	}

	public int getPageSize() {
		return pageSize;
	}
	public int getFirst(){
		return 1;
		
	}
	public int getPrev(){
		return Math.max(this.index-1, 1);
		
	}
	public int getNext(){
		return Math.min(this.index+1, pages);
	}
	public int getLast(){
		return pages;
	}
	
}
