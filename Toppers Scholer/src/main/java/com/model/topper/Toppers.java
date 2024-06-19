package com.model.topper;

public class Toppers {
	private int id;
	private String name;
	private String education;
	private String course;
	private int course_fee;
	public Toppers(int id, String name, String education, String course, int course_fee) {
		super();
		this.id = id;
		this.name = name;
		this.education = education;
		this.course = course;
		this.course_fee = course_fee;
	}
	public Toppers() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getCourse_fee() {
		return course_fee;
	}
	public void setCourse_fee(int course_fee) {
		this.course_fee = course_fee;
	}
	@Override
	public String toString() {
		return "Toppers [id=" + id + ", name=" + name + ", education=" + education + ", course=" + course
				+ ", course_fee=" + course_fee + "]";
	}
	

}
