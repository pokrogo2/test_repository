<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>

</head>
<body>
<div class="board_list">
	
	<input type="button" value="게시글 작성하기" onclick="location.href='/ex_model2_test/insertBoardPage.b'">

	
	
	<table>
		<thead>
			<tr>
				<td>순번</td>
				<td>제목</td>
				<td>작성자</td>
				<td>조회수</td>
				<td>최종수정일</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="dto" items="${list}" varStatus="k">
			
				
					<tr>
						<td>${dto.no}</td>
						<td><a href="/ex_model2_test/selectOneBoard.b?no=${dto.no}">${dto.title}</a></td>
						<td>${dto.contents}</td>			
						<td>${dto.hit}</td>
						<td>${dto.date}</td>
					</tr>
				
			</c:forEach>
		</tbody>
	</table>
	
</div>

</body>
</html>