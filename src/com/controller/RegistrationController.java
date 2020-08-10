package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.data.UserDB;
import com.model.User;
/**
 * Servlet implementation class RegistrationController
 */
@WebServlet(name = "register", urlPatterns = {"/register"})
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("this is post method");
		String url;
        //String toDo = request.getParameter("action");
                    User user = new User();
                    user.setEmail(request.getParameter("email"));
                    user.setFirstName(request.getParameter("firstName"));
                    user.setLastName(request.getParameter("lastName"));
                    user.setContact(request.getParameter("contact"));
                    user.setPassword(request.getParameter("password"));
                    String result = UserDB.registerUser(user);
                   //System.out.println("user is "+ user.getEmail());
                    if(result != null){
                    	request.setAttribute("msg", "User is registered successfully.Please login with your email and password.");
                    url = "/login.jsp";
                } else {
                    String msg = "Some error Occurred.Please Try again!!";
                    request.setAttribute("msg", msg);
                    url = "/register.jsp";
                }
        request.getRequestDispatcher(url).forward(request, response);

	}


}
