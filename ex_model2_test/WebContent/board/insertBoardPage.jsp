<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>

<script>
	$(document).ready(function(){
		
		const f = $('#f');
		const title = $('#title');
		const insert_btn = $('#insert_btn');
		insert_btn.click(function(){
			if (title.val() == '') {
				alert('제목은 필수입니다.');
				title.focus();
				return;
			}
			f.attr('action', '/ex_model2_test/insertBoard.b');
			f.submit();
		})
		
		const list_btn = $('#list_btn');
		list_btn.click(function(){
			location.href = '/ex_model2_test/selectListBoardPage.b';
		})
		
	})
</script>
</head>

<body>
<div class="insert_form">
	
	<form id="f" method="post">
		<p>제목</p>
		<input type="text" id="title"  name="title" autofocus><br><br>
		
		<p>내용</p>
		<textarea id="contents" name="contents"></textarea><br><br>
	
		<div>
			<input type="button" value="저장하기" class="btn" id="insert_btn">
			<input type="reset" value="작성초기화" class="btn" id="reset_btn">
			<input type="button" value="목록보기" class="btn" id="list_btn">
		</div>
	</form>
	
</div>
</body>
</html>