package com.app.dto;

import java.util.Objects;

public class StudentTaskDTO {
	private Long id;
	private String StudentTaskStudentName;
	private int StdentTaskEng;
	private int StdentTaskKor;
	private int StdentTaskMath;
	
	public StudentTaskDTO() {;}

	public StudentTaskDTO(Long id, String studentTaskStudentName, int stdentTaskEng, int stdentTaskKor,
			int stdentTaskMath) {
		super();
		this.id = id;
		StudentTaskStudentName = studentTaskStudentName;
		StdentTaskEng = stdentTaskEng;
		StdentTaskKor = stdentTaskKor;
		StdentTaskMath = stdentTaskMath;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudentTaskStudentName() {
		return StudentTaskStudentName;
	}

	public void setStudentTaskStudentName(String studentTaskStudentName) {
		StudentTaskStudentName = studentTaskStudentName;
	}

	public int getStdentTaskEng() {
		return StdentTaskEng;
	}

	public void setStdentTaskEng(int stdentTaskEng) {
		StdentTaskEng = stdentTaskEng;
	}

	public int getStdentTaskKor() {
		return StdentTaskKor;
	}

	public void setStdentTaskKor(int stdentTaskKor) {
		StdentTaskKor = stdentTaskKor;
	}

	public int getStdentTaskMath() {
		return StdentTaskMath;
	}

	public void setStdentTaskMath(int stdentTaskMath) {
		StdentTaskMath = stdentTaskMath;
	}

	@Override
	public String toString() {
		return "StudentTaskDTO [id=" + id + ", StudentTaskStudentName=" + StudentTaskStudentName + ", StdentTaskEng="
				+ StdentTaskEng + ", StdentTaskKor=" + StdentTaskKor + ", StdentTaskMath=" + StdentTaskMath + "]";
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
		StudentTaskDTO other = (StudentTaskDTO) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
