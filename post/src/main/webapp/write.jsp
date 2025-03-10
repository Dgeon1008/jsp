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
		<div>
			<label>
				<span>게시글 제목</span>
				<input type="text" name="postTitle" placeholder="게시물 제목"/>		
			</label>		
		</div>
		<div>
			<label>
				<span>게시글 내용</span>
				<input type="text" name="postContent" placeholder="게시물 내용"/>		
			</label>
		</div>
		<button>게시물 등록</button>		
	</form>

</body>
<script type="text/javascript">
	const inputs = document.querySelectorAll("input");
	
	document.querySelector("button").addEventListener("click", () => {})
	for(let input of inputs){
		if(!input.value){
			alert(`${input.name}의 값을 입력하세요.`)
			return;
		}
	}

</script>
</html>