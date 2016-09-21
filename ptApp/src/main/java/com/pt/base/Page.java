package com.pt.base;

/**
 * 
 * 分页对象类
 * 
 * @author dancy
 * @date 2016年07月01日
 * @version 1.0
 * @copyright XXXXXXXXX,Ltd.copyright 2016
 */
public class Page {

	/** 当前页数 **/
	private int currentPage;

	/** 每页显示的记录数 **/
	private int numPerPage = 10;

	/** 记录行数* */
	private int rowsCount;

	public Page() {
		this.numPerPage = 10;
		this.currentPage = 1;
		this.rowsCount = 0;
	}

	public Page(int _currentPage) {
		this.currentPage = _currentPage;
	}

	public Page(int _currentPage, int _numPerPage) {
		this.currentPage = _currentPage;
		this.numPerPage = _numPerPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getNumPerPage() {
		return numPerPage;
	}

	public void setNumPerPage(int numPerPage) {
		this.numPerPage = numPerPage;
	}

	public int getRowsCount() {
		return rowsCount;
	}

	public void setRowsCount(int rowsCount) {
		this.rowsCount = rowsCount;
	}
	
	
}