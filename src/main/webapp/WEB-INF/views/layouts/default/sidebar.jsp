<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

<p>sidebar</p>

<div class="col-sm-3 col-md-2 sidebar">
	<ul class="nav nav-sidebar">
          
<sec:authorize access="isAnonymous()">
로그인하세요 <input type="button" value="로그인" onclick='location.href="<c:url value="/login"/>"'/> 
</sec:authorize>

<sec:authorize access="hasRole('ROLE_LEADER')">
 <c:out value="${sessionScope.SPRING_SECURITY_CONTEXT.authentication.principal.username }" />팀장님 로그인 중입니다.
</sec:authorize> 

<sec:authorize access="hasRole('ROLE_USER')">
 <c:out value="${sessionScope.SPRING_SECURITY_CONTEXT.authentication.principal.username }" />님 로그인 중입니다.
</sec:authorize> 

<sec:authorize access="hasRole('ROLE_ADMIN')">
 <c:out value="${sessionScope.SPRING_SECURITY_CONTEXT.authentication.principal.username }" />관리님 로그인 중입니다.
</sec:authorize> 

<sec:authorize access="hasRole('ROLE_USER')"> 
</sec:authorize>

<sec:authorize access="isAuthenticated()">
<input type="button" value="로그아웃" onclick='location.href="<c:url value="/login"/>"'/> 
</sec:authorize>

	</ul>
</div>