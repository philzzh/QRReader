package com.finance.mywork.entity;

import java.util.Date;

public class Bill {

	private String id;
	private String reimburser;
	private Date rdate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getReimburser() {
		return reimburser;
	}
	public void setReimburser(String reimburser) {
		this.reimburser = reimburser;
	}
	public Date getRdate() {
		return rdate;
	}
	public void setRdate(Date rdate) {
		this.rdate = rdate;
	}
	@Override
	public String toString() {
		return "Bill [id=" + id + ", reimburser=" + reimburser + ", rdate=" + rdate + "]";
	}
	public Bill(String id, String reimburser, Date rdate) {
		super();
		this.id = id;
		this.reimburser = reimburser;
		this.rdate = rdate;
	}
}
