package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.data.InsuranceDB;
import com.model.Insurance;

/**
 * Servlet implementation class InsuranceController
 */
@WebServlet(name = "insurance", urlPatterns = {"/insurance"})
public class InsuranceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public InsuranceController() {
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("welcome to Insurance Details");
        String url;
        //String toDo = request.getParameter("action");
        int groupNumber = Integer.parseInt(request.getParameter("groupNumber"));
                    ArrayList<Insurance> insList = InsuranceDB.getInsuranceList(groupNumber);
                   //System.out.println("insurance detail "+ ins.getGroupNumber()+ins);
                    if(insList != null){
                    HttpSession session = request.getSession();
                    //session.setAttribute("ins", ins);
                    request.setAttribute("ins", insList);
                    url = "/insuranceResult.jsp";
                } else {
                    String msg = "No provider found";
                    request.setAttribute("msg", msg);
                    url = "/insuranceFinder.jsp";
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
