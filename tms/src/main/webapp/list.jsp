<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 목록 페이지</title>
</head>
<body>

	<table>
		<tr>
			<th>학생이름</th>
         	<th>수학점수</th>
         	<th>영어점수</th>
         	<th>국어점수</th>
         	<th>총점</th>
         	<th>평균</th>
      	</tr>
   	</table>
   	<form action="write.student" method="post">
   		<button>학생 추가하기</button>
   	</form>
</body>
<script>
	const table = document.querySelector('table');
	const students = ${students};
	const button = document.querySelector("button");
	
	students.forEach(({id, studentName, studentMath, studentEng, studentKor, total, average}) => {
		table.innerHTML += (
	       	"<tr>" +   
	          	"<td><a href='read.student?id=" + id + "'>" + studentName + "</td>" +
	          	"<td>" + studentMath + "</td>" +
				"<td>" + studentEng + "</td>" +
				"<td>" + studentKor + "</td>" +
				"<td>" + total + "</td>" +
				"<td>" + average + "</td>" +
			"</tr>"               
		)
	})
	
</script>
</html>













