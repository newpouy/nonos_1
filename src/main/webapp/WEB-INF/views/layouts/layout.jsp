<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<title>NONOS</title>
</head>
<body>
<tiles:insertAttribute name="header" />
<tiles:insertAttribute name="nav" />
<div class="container-fluid">
	<div class="row">
		<tiles:insertAttribute name="sidebar" />
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
		<tiles:insertAttribute name="content" />
		</div>
	</div>
</div>	
<tiles:insertAttribute name="footer" />
</body>
</html>
</body>
</html>