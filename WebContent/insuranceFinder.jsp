<%--
  Created by IntelliJ IDEA.
  User: vmaurya
  Date: 2019-11-20
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Find Your Doctor</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="styles.css">
</head>
<body>
<div class="fullHeight">
    <jsp:include page="header.jsp"></jsp:include>
    <jsp:include page="navigation.jsp"></jsp:include>
    <div class="row fullHeight" style="text-align:center;">
        <form action="insurance" method="post">
            Group ID:<br>
            <input type="text" name="groupNumber">
            <br><br>
            <input type="submit" value="Search">
        </form>
    </div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
