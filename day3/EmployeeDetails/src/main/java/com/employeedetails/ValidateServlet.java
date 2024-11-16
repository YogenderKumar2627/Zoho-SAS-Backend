package com.employeedetails;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.xdevapi.Expression;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/ValidateServlet")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int id=Integer.parseInt(request.getParameter("id"));
			String employeeName=request.getParameter("name");
			int Salary=Integer.parseInt(request.getParameter("salary"));
			response.sendRedirect("Succes.html");
		}
		catch (NumberFormatException e) {
			request.setAttribute("error", "Invalid number format for Employee ID or Salary.");
			request.getRequestDispatcher("Error.jsp").forward(request, response);
		} 
		catch (IllegalArgumentException e) {
			request.setAttribute("error", e.getMessage());
			request.getRequestDispatcher("Error.jsp").forward(request, response);
		} 
		catch (Exception e) {
			request.setAttribute("error", "An unexpected error occurred: " + e.getMessage());
			request.getRequestDispatcher("Error.jsp").forward(request, response);
		}
		
	}

}
