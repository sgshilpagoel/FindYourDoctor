<!DOCTYPE html>
<html lang="en">
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
         <div class="row fullHeight">
        <form class = "loginForm" action="login" method="post">
            <br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Email:<input type="email" name="email" required>
            <br><br>Password:<input type="password" name="password" required/><br><br>
            <input type="submit" value="Login"/> &nbsp;&nbsp;&nbsp;&nbsp; New User? <a href="register.jsp">Register</a><br><br>
        </form>
              </div>
            </div>
            <jsp:include page="footer.jsp"></jsp:include> 
    </body>
</html>