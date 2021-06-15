<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
<meta charset="UTF-8">
<title>Insert title here</title>



</head>
<body>
	<div class ="container">
		<header>	
			<a href="/ex_model2/index.do">
				<img src="<%=request.getContextPath() %>/asset/images/daum.png" style="width : 200px;">
			</a>
		<p class="info">
			<c:if test ="${login==null }">
				<a href="ex_model2/loginPage.m">로그인</a>
				<a href="ex_model2/joinPage.m">회원가입</a>
			</c:if>
			<c:if test="${loginDTO != null}">
					${loginDTO.name}님 반갑습니다 ♥
					<a href="/ex_model2/logout.m">로그아웃</a>
					<a href="/ex_model2/myPage.m">마이페이지</a>
				</c:if>
			</p>
			<nav>
				<ul>
					<li><a href="/ex_model2/selectListBoardPage.b">게시판</a></li>
					<li><a href="#">메뉴2</a></li>
					<li><a href="#">메뉴3</a></li>
					<li><a href="#">메뉴4</a></li>
					<li><a href="#">메뉴5</a></li>
				</ul>
			</nav>
		</header>
	
		<section>