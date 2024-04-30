<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Index</title>
</head>
<body>
<h1>
	인덱스 페이지입니다. 
</h1>

<table border="1">
	<thead>
		<tr>
			<th>부서번호</th>
			<th>부서명</th>
			<th>지역</th>
		</tr>
	</thead>
	<tfoot>
		<tr>
			<th>부서번호</th>
			<th>부서명</th>
			<th>지역</th>
		</tr>
	</tfoot>
	<tbody>
		<c:forEach var="dept" items="${depts}">
			<tr>
				<td>${dept.deptno}</td>
				<td>${dept.dname}</td>
				<td>${dept.loc}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>
