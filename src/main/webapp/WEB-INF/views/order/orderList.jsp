<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<h1 class="page-header">NOS 외 주문목록</h1>	
          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>번호</th>
                  <th>고객사</th>
                  <th>주문자</th>
                  <th>주문상품</th>
                  <th>담당자</th>
                </tr>
              </thead>
              <tbody>
              <c:choose><c:when test="${fn:length(orderList) > 0}"><c:forEach items="${orderList}" var="row">
                    
					<tr style="cursor:pointer;" onclick='location.href="order/${row.orderId}"'>
                        <td>${row.orderId }</td>
                        <td>${row.companyName }</td>
                        <td>${row.orderPerson }</td>
						<td>${row.item }</td>
						<td>${row.user }</td>
                    </tr>
					
                </c:forEach></c:when><c:otherwise>
                <tr>
                    <td colspan="4">조회된 결과가 없습니다.</td>
                </tr></c:otherwise></c:choose> 
         
    		  </tbody>
			</table>
			
			<a href="<c:url value="/orderWriteView"/>">별도주문 작성</a>
			