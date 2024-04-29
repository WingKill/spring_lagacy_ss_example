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

<table>
	<thead>
		<tr>
			<th>사원번호</th>
			<th>사원명</th>
			<th>직업</th>
			<th>월급</th>
		</tr>
	</thead>
	<tfoot>
		<tr>
			<th>사원번호</th>
			<th>사원명</th>
			<th>직업</th>
			<th>월급</th>
		</tr>
	</tfoot>
	<tbody>
		<c:forEach var="emp" items="${emps}">
			<tr>
				<td>${emp.empno}</td>
				<td>${emp.ename}</td>
				<td>${emp.job}</td>
				<td>${emp.sal}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>
