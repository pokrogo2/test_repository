<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>


<div class="join_form">
	<form action="join.m" id="f" method="post">
		<%-- 아이디 --%>
		<span class="title">아이디</span><br>
		<input type="text" name="id" id="id" autofocus><br>
		<span class="message" id="id_message"></span><br>
		<%-- 비밀번호 --%>
		<span class="title">비밀번호</span><br>
		<input type="password" name="pw" id="pw"><br>
		<span class="message" id="pw_message"></span><br>
		<%-- 비밀번호 확인 --%>
		<span class="title">비밀번호 확인</span><br>
		<input type="password" id="pw2"><br>
		<span class="message" id="pw2_message"></span><br>
		<%-- 이름 --%>
		<span class="title">이름</span><br>
		<input type="text" id="name" name="name"><br><br>
		<%-- 이메일 --%>
		<span class="title">이메일</span><br>
		<input type="text" id="email" name="email"><br>
		<span class="message" id="email_message"></span><br><br>
		<%-- 인증(캡차, SMS, 이메일) --%>
		<%-- 약관 동의 --%>
		<button>회원가입</button>
	</form>
</div>

<%@ include file="../layout/footer.jsp" %>
</body>
</html>