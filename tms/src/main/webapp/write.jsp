<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 추가</title>
</head>
<body>

	<form action="write-ok.student" method="post">
		<label>
			<input type="text" name="studentName" placeholder="학생 이름" />
		</label>		
		<label>
			<input type="number" name="studentMath" placeholder="수학 점수" />
		</label>		
		<label>
			<input type="number" name="studentEng" placeholder="영어 점수" />
		</label>		
		<label>
			<input type="number" name="studentKor" placeholder="국어 점수" />
		</label>
		<button>학생 등록</button>		
	</form>

</body>
</html>