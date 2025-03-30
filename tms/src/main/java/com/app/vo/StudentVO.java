package com.app.vo;

import java.util.Objects;

public class StudentVO {
	private Long id;
	private String studentName;
	private int studentEng;
	private int studentKor;
	private int studentMath;
	
	public StudentVO() {;}

	public StudentVO(Long id, String studentName, int studentEng, int studentKor, int studentMath) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studentEng = studentEng;
		this.studentKor = studentKor;
		this.studentMath = studentMath;
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

	@Override
	public String toString() {
		return "StudentVO [id=" + id + ", studentName=" + studentName + ", studentEng=" + studentEng + ", studentKor="
				+ studentKor + ", studentMath=" + studentMath + "]";
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
		StudentVO other = (StudentVO) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
