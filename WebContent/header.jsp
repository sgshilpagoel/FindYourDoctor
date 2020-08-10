<%-- 
    Document   : header
    Created on : Oct 10, 2019, 7:07:29 PM
    Author     : shilpa
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
            <div class="header">
        <span class="signInPlaceholder">                   
                 <a href="newConnection.jsp">Start a New Connection</a>
                <c:choose>
                    <c:when test="${user == null}"><a href="login.jsp">Login</a></c:when>
                    <c:otherwise><a href="/FindYourDoctor/login?action=logout">Logout</a></c:otherwise>
                </c:choose>
                <a href="register.jsp">Sign Up</a>
        </span>
            <h1>
           <span class = "logo"><a href="index.jsp"><img id="image1" src="./images/logo.jpg" alt="brand image placeholder" /></a></span>
            FIND YOUR DOCTOR
            </h1>
            </div>