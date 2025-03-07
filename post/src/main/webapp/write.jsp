<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 추가 페이지</title>
</head>
<body>

	<form action="write-ok.post" method="post">
		<label>
			<input type="text" name="postTitle" placeholder="게시물 제목"/>		
		</label>		
		<label>
			<input type="text" name="postContent" placeholder="게시물 내용"/>		
		</label>		
		<button>게시물 등록</button>		
	</form>


</body>
</html>