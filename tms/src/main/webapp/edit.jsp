<%@page import="com.app.dto.StudentDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 정보 수정</title>
</head>
<body>
	
	<%
		StudentDTO student = (StudentDTO)request.getAttribute("student");
	%>	
	
	<form action="edit-ok.student" method="post">
		<label>
			<input type="hidden" name="id" value="<%=student.getId()%>"/>	
		</label>
		<label>
			<input type="text" name="studentName" placeholder="학생이름" value="<%=student.getStudentName()%>"/>	
		</label>		
		<label>
			<input type="number" name="studentMath" placeholder="수학점수" value="<%=student.getStudentMath()%>"/>	
		</label>		
		<label>
			<input type="number" name="studentEng" placeholder="영어점수" value="<%=student.getStudentEng()%>"/>	
		</label>		
		<label>
			<input type="number" name="studentKor" placeholder="국어점수" value="<%=student.getStudentKor()%>"/>	
		</label>
		<button>학생 정보 수정</button>		
	</form>
		
</body>
</html>