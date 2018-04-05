<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <c:set var="root" value="${pageContext.request.servletContext.contextPath}" /> --%>
<c:set var="root" value="${pageContext.request.contextPath}" />

	<header class="header">
		<h1>책 제목</h1>
		<nav class="main-menu">
			<h1 class="hidden">메인메뉴</h1>
			<ul>
				<li><a href=""><img src="${root}/resource/images/ic_menu_black_24dp_1x.png" alt="메뉴"></a></li>
				<li><a href="${root}/member/note/list">관리</a></li>
				<%-- <li><a href=""><img src="${root}/resource/images/ic_search_black_24dp_1x.png" alt="검색"></a></li> --%>
				<!-- <li></li> -->
			</ul>
		</nav>
	</header>