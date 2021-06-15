<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	
</script>
</head>
<body>
		<script>
			
		</script>
		<div class="board_view">
			<div class="board_content">
				<p class="title">번호</p>
				${dto.no}<br><br>
				<p class="title">제목</p>
				${dto.title}<br><br>
				<p class="title">내용</p>
				<pre>${dto.contents}</pre><br><br>	
				<p class="title">조회수</p>
				${dto.hit}<br><br>
				<p class="title">작성일</p>
				${dto.date}<br><br>
			</div>
		</div>
		<div>
			<form action="/ex_model2_test/deleteBoard.b" method="post">
			<input type="hidden" name="no" value="${dto.no}">
			<button>삭제하기</button>
			
		
	</form>
			<input type="button" value="목록보기" id="btn" name="btn" onclick="location.href='/ex_model2_test/board.b'">
		</div>
		
		<%-- 댓글 입력창 --%>
		<div class="reply_form">
			<form action="/ex_model2_test/insertReply.b" method="post">
				<input type="hidden" name="boardIdx" value="${dto.no}"> 
				<input type="text" name="author"> 
				<textarea name="content" placeholder="댓글"></textarea>
				
					<button>작성하기</button>
				
			</form>
		</div>
		
		<%-- 댓글 목록창 --%>
		<div class="reply_list">

			<table>
				<tbody>
					<c:forEach var="replyDTO" items="${replyList}">
						<tr>
							<td>${replyDTO.content}</td>
							<td>${replyDTO.author}</td>
							<td>${replyDTO.postdate}</td>
							<td>
								
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>

</body>
</html>