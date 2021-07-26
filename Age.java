package com.techleads.app;

public class Age {
	
	private Integer day;
	private Integer month;
	private Integer year;
	public Integer getDay() {
		return day;
	}
	public void setDay(Integer day) {
		this.day = day;
	}
	public Integer getMonth() {
		return month;
	}
	public void setMonth(Integer month) {
		this.month = month;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Age [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	

}
