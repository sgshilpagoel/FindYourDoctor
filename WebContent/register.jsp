<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Find Your Doctor</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="styles.css">

<style>
.title_text {
	float: right}

</style>    
    </head>
    <body>
        
        <div class="fullHeight">
        <jsp:include page="header.jsp"></jsp:include>
        <jsp:include page="navigation.jsp"></jsp:include>
         <div class="row fullHeight">
			<h3 style = "margin-left:40px">Register User</h3>
                <form style = "margin-left:40px" action="register" method="post">
                    <div class="formBox">
                        <div class=""><label >First Name: </label></div>
                <input type="text" name="firstName" class="inputBox"/><br>
                    </div>
                    <div class="formBox">
                        <div class=""><label >Last Name: </label></div>
                <input type="text" name="lastName" class="inputBox"/><br>
                    </div>
                    <div class="formBox">
                        <div class=""><label >Email: </label></div>
                <input type="text" name="email" class="inputBox"/><br>
                    </div>
                    <div class="formBox">
                        <div class=""><label >Password: </label></div>
                <input type="text" name="password" class="inputBox"/><br>
                    </div>
                    <div class="formBox">
                        <div class=""><label >Contact: </label></div>
                <input type="text" name="contact" class="inputBox"/><br>
                    </div>
                    <div class = "formBox"><input type="submit" value="Submit"/>  </div>   
                </form>
              </div>
            </div>
            <jsp:include page="footer.jsp"></jsp:include> 
    </body>
</html>