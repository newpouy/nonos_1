<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<script "text/javascript">
	function maapingAction(val) {
		if (val == "modify") {
			location.href="/orderModifyView/${order.orderId}";
		} else if (val == "delete") {
			location.href="/orderDelete/${order.orderId}";
		} else {
			return false;
		}
	}
</script>

주문번호:   ${order.orderId}<br/>
고객사:     ${order.companyName}<br/>
주문자:     ${order.orderPerson}<br/>
인쇄소:     ${order.factory}<br/>
매입가:     ${order.purchasePrice}<br/>
공급가:     ${order.supplyPrice}<br/>
주문상품:    ${order.item}<br/>
주문매수:    ${order.amount}<br/>
메모:       ${order.memo}<br/>
담당자:     ${order.user}<br/>

<%-- <input type="button" value="수정" onclick='location.href="<c:url value="/orderModifyView/${order.orderId}"/>"'><br/>
 --%>
<input type="button" id="modifyBtn" value="수정" onclick="maapingAction('modify')">
<input type="button" id="deleteBtn" value="삭제" onclick="maapingAction('delete')">
<a href="<c:url value="/orderList"/>">목록보기</a>