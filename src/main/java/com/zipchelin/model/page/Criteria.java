package com.zipchelin.model.page;

public class Criteria {
	// 현제 페이지
	private int pageNum;
	
	// 한페이지당 게시물 갯수
	private int amount;
	
	public Criteria() {
		this(1,8);
	}

	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Criteria [pageNum=" + pageNum + ", amount=" + amount + "]";
	}

	
	
	
}
