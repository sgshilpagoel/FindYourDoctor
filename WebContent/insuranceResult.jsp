<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" import="java.util.*" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Find Your Doctor</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="styles.css">
 <link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
</head>
<body>
<div class=" fullHeight">
    <jsp:include page="header.jsp"></jsp:include>
    <jsp:include page="navigation.jsp"></jsp:include>

                  <div class="searchform" style="margin-left: 25%; width: 40%;">
				<h2 style=""align="center">Insurance Results</h2>
				<table border="1" class="table table-hover">
					<thead class="table-secondary">
						<tr>
							<th>Group Number</th>
							<th>Hospital Name</th>
							<th>HealthCare Provider</th>
							<th>Address</th>
						</tr>
					</thead>
					<c:forEach var="item" items="${ins}">
						<tr>
							<td><c:out value="${item.getGroupNumber()}" /></td>
							<td><c:out value="${item.getHospitalName()}" /></td>
							<td><c:out value="${item.getHealthcare_provider()}"/></td>
							<td><c:out value="${item.getAddress()}" /></td>
						</tr>
					</c:forEach>
				</table>
			</div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>