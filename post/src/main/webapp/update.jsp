<%@page import="com.app.vo.PostVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 수정 페이지</title>
</head>
<body>

	<%
		PostVO post = (PostVO)request.getAttribute("post");
	%>


	<form action="update-ok.post" method="post">
		<label>
			<input type="hidden" name="id" value="<%=post.getId()%>"/>		
		</label>
		<label>
			<input type="text" name="postTitle" placeholder="게시물 제목" value="<%=post.getPostTitle()%>"/>	
		</label>		
		<label>
			<input type="text" name="postContent" placeholder="게시물 내용" value="<%=post.getPostContent()%>"/>		
		</label>		

		<button>게시물 수정</button>		
	</form>

</body>
</html>