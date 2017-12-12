package com.yunzhs.crm.bean;

import java.util.List;

/**
 * 作用：封装分页的五个基本参数
 * @author Administrator
 *
 */
public class PageBean<T> {
	private List<T> list;//分页的bean更加灵活
	private  int pageSize=3;//每页显示的数据条数
	private int currentPage;//当前页 ，从页面传递过来的
	private  int totalCount;//总记录数，从数据库查询出来
	private  int totalPage;//总记录数和每页显示的条数计算出来
	
	public int getTotalPage() {
		int pages = totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1;
		int totalPage = pages;
		return totalPage;
	}
	
	
	
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	
	

}
