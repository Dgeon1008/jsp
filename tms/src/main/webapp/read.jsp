<%@page import="com.app.dto.StudentDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 정보 페이지</title>
</head>
<body>
	
	<%
		/* request.getAttribute()는 Object으로 리턴, 형변환 */
		StudentDTO student = (StudentDTO)request.getAttribute("student");			
	%>
	
	<table>
		<tr>
			<th>이름</th>
			<th>수학</th>
			<th>영어</th>
			<th>국어</th>
			<th>총점</th>
			<th>평균</th>
		</tr>
		<tr>
			<td><%=student.getStudentName() %></td>
			<td><%=student.getStudentMath() %></td>
			<td><%=student.getStudentEng() %></td>
			<td><%=student.getStudentKor() %></td>
			<td><%=student.getTotal() %></td>
			<td><%=student.getAverage() %></td>
		</tr>
	</table>
	
	<div>
		<a href="list.student">목록으로</a>
		<a href="edit.student?id=<%=student.getId() %>">수정</a>
		<a href="remove.student?id=<%=student.getId() %>">삭제</a>
	</div>
	
	
</body>
</html>