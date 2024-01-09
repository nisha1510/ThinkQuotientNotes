package com.containment;

public class Student {

	private int sid;
	private String sname;
	private Course course;
	
	public Student() {
	
	}
	public Student(int sid, String sname, Course course) {
		this.sid = sid;
		this.sname = sname;
		this.course = course;
	}
		public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setCourse(Course course) {
		this.course=course;
	}
	public Course getCourse() {
		return course;
	}
	public String toString() {
		return "Student : sid=" + sid + ", sname=" + sname + ", course=" + course;
	}
	

}
