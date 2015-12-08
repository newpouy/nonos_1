<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<h2>게시판 목록1111</h2>
<table style="border:1px solid #ccc">
<%--     <colgroup>
        <col width="10%"/>
        <col width=""/>
        <col width="15%"/>
        <col width="20%"/>
    </colgroup> --%>
    <thead>
        <tr>
            <th scope="col">오더아이</th>
            <th scope="col">회</th>
            <th scope="col">주문자</th>
			 <th scope="col">인쇄소</th>
        </tr>
    </thead>
    <tbody>
        <c:choose><c:when test="${fn:length(orderList) > 0}"><c:forEach items="${orderList}" var="row">
                    <tr>
                        <td>${row.orderId }</td>
                        <td>${row.company }</td>
                        <td><a href="<c:url value="/board/${row.boardId}"/>">${row.orderPerson }</a></td>
							<td>${row.factory }</td>
                    </tr>
                </c:forEach></c:when><c:otherwise>
                <tr>
                    <td colspan="4">조회된 결과가 없습니다.</td>
                </tr></c:otherwise></c:choose> 
         
    </tbody>
</table>
<a href="<c:url value="/boardWriteView"/>">글쓰기</a>
