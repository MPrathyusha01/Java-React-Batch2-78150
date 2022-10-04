package com.hexaware.streamsinjava8;

public class Student {
	private String stuId;
	private String  stuName;
	private String stumarks;
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStumarks() {
		return stumarks;
	}
	public void setStumarks(String stumarks) {
		this.stumarks = stumarks;
	}
	public Student() {
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stumarks=" + stumarks + "]";
	}
	
	
	
	
}
