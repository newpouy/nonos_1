<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<h1 class="page-header">주문 입력</h1>	

<form method="post" action="/orderWrite">
<div class="input-group col-md-6"> 
	<span class="input-group-addon" >고객사</span>	
	<input class="form-control" type="text" id="companyName" name="companyName" value="">
</div>
<div class="input-group col-md-6">
	<span class="input-group-addon">주문자</span>	
	<input class="form-control" type="text" id="orderPerson" name="orderPerson" value="">
</div>
<div class="input-group col-md-6">
	<span class="input-group-addon">인쇄소</span>	
	<input class="form-control" type="text" id="factory" name="factory" value="">
</div>
<div class="input-group col-md-6">
	<span class="input-group-addon">매입가</span>	
	<input class="form-control" type="text" id="companyName" name="companyName" value="">
</div>
<div class="input-group col-md-6">
	<span class="input-group-addon">공급가</span>	
	<input class="form-control" type="text" id="supplyPrice" name="supplyPrice" value="">
</div>
<div class="input-group col-md-6">
	<span class="input-group-addon">상품</span>	
	<input class="form-control" type="text" id="item" name="item" value="">
</div>
<div class="input-group col-md-6">
	<span class="input-group-addon">매수</span>	
	<input class="form-control" type="text" id="amount" name="amount" value="">
</div>
<div class="input-group col-md-6">
	<span class="input-group-addon">메모</span>	
	<input class="form-control" type="text" id="companyName" name="companyName" value="">
</div>
<div class="input-group col-md-6">
	<span class="input-group-addon">담당자</span>	
	<input class="form-control" type="text" id="companyName" name="companyName" value="">
</div>


주문자	<input type="text" id="orderPerson" name="orderPerson" value=""></br>
인쇄소	<input type="text" id="factory" name="factory" value=""></br>
매입가	<input type="text" id="purchasePrice" name="purchasePrice" value=""></br>
공급가	<input type="text" id="supplyPrice" name="" value=""></br>
주문상픔 	<input type="text" id="item" name="item" value=""></br>
주문매수 	<input type="text" id="amount" name="amount" value=""></br>
메모	 	<textarea type="text" id="memo" name="memo" value=""></textarea></br>
담당자 	<input type="text" id="user" name="user" value=""></br>
	<input type="submit" value="쓰기">
	<a href="/orderList">목록</a>
</form>	
</div>	