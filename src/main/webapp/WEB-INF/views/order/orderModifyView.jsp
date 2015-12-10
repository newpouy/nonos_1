<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<form method="post" action="/orderModify/${order.orderId}">
	<input type="text" id="companyName" name="companyName" value="${order.companyName}"></br>
	<input type="text" id="orderPerson" name="orderPerson" value="${order.orderPerson}"></br>
	<input type="text" id="factory" name="factory" value="${order.factory}"></br>
	<input type="text" id="purchasePrice" name="purchasePrice" value="${order.purchasePrice}"></br>
	<input type="text" id="supplyPrice" name="" value="${order.supplyPrice}"></br>
	<input type="text" id="item" name="item" value="${order.item}"></br>
	<input type="text" id="amount" name="amount" value="${order.amount}"></br>
	<textarea type="text" id="memo" name="memo" value="${order.memo}"></textarea></br>
	<input type="text" id="user" name="user" value="${order.user}"></br>
	<input type="submit" id="modifyBtn" value="수정">
	<a href="<c:url value="/orderList"/>">목록보기</a>
</form>	
	
