package com.app.dto;

import java.util.Objects;

public class StudentDTO {
	private Long id;
	private String studentName;
	private int studentEng;
	private int studentKor;
	private int studentMath;
	private int total;
	private double average;
	
	
	public StudentDTO() {;}


	public StudentDTO(Long id, String studentName, int studentEng, int studentKor, int studentMath, int total,
			double average) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studentEng = studentEng;
		this.studentKor = studentKor;
		this.studentMath = studentMath;
		this.total = total;
		this.average = average;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public int getStudentEng() {
		return studentEng;
	}


	public void setStudentEng(int studentEng) {
		this.studentEng = studentEng;
	}


	public int getStudentKor() {
		return studentKor;
	}


	public void setStudentKor(int studentKor) {
		this.studentKor = studentKor;
	}


	public int getStudentMath() {
		return studentMath;
	}


	public void setStudentMath(int studentMath) {
		this.studentMath = studentMath;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public double getAverage() {
		return average;
	}


	public void setAverage(double average) {
		this.average = average;
	}


	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", studentName=" + studentName + ", studentEng=" + studentEng + ", studentKor="
				+ studentKor + ", studentMath=" + studentMath + ", total=" + total + ", average=" + average + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentDTO other = (StudentDTO) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
