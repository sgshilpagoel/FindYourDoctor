package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.data.UserDB;
import com.model.Dashboard;
import com.model.User;

/**
 * Servlet implementation class LoginController
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginController() {
        // TODO Auto-generated constructor stub
    }



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("welcome to login method");
        String url;
        String toDo = request.getParameter("action");
                String email = request.getParameter("email");
                String password = request.getParameter("password");
                    User user = UserDB.getUser(email,password);
                   System.out.println("user is "+ user.getEmail()+user);
                    if(user != null){
                    HttpSession session = request.getSession();
                    session.setAttribute("user", user);
                    ArrayList<Dashboard> dashboardList = UserDB.getDashboardList(user.getUserId());
                    request.setAttribute("dashboardList",dashboardList );
                    url = "/userDashboard.jsp";
                } else {
                    String msg = "Invalid emailID & password";
                    request.setAttribute("msg", msg);
                    url = "/login.jsp";
                }
        request.getRequestDispatcher(url).forward(request, response);
	}
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        session.invalidate();
        response.sendRedirect(request.getContextPath() + "/login.jsp");
    }
}
