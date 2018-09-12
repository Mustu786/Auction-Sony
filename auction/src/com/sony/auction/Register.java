package com.sony.auction;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		final String INDIVIDUAL_TYPE = "Individual";
		String type = request.getParameter("custType");
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>Enter Details</title>"
				+ "</head><body><form action='EnterDetails' method='post'>");
		
		if(type.equalsIgnoreCase(INDIVIDUAL_TYPE)){
			out.println("<strong>Full Name <sup style='color:red'>*</sup>:</strong> &nbsp;&nbsp; <input type='text' name='name'"
					+ "placeholder='Enter name'>");
			//response.sendRedirect("enterDetails.html");
		} else {
			out.println("<strong>Organization Name <sup style='color:red'>*</sup>:</strong> &nbsp;&nbsp; <input type='text' name='name'"
					+ "placeholder='Enter organization name'>");
		}
		
		out.println("<br/><strong>Username<sup style='color:red'>*</sup> : "
				+ "<input type='text' name='username' autofocus required "
				+ "placeholder='Username'/> <br><br> Password<sup style='color:red'>*"
				+ "</sup> : <input type='password' name='password' required "
				+ "placeholder='Password'/><strong>(Password should contain "
				+ "atleast 8 to 16 character with one number,capital "
				+ "and special character)</strong><br/><br> Confirm Password<sup "
				+ "style='color:red'>*</sup> : <input type='password' name='password'"
				+ "required placeholder='Confirm Password'/><strong><br/><br>"
				+ "Are you a <sup style='color:red'>*</sup> :"
				+ "<input type='radio' name='type1' value='buyer'>Buyer"
				+ "<input type='radio' name='type1' value='seller'>Seller"
				+ "<input type='radio' name='type1' value='both'>Both<br><br/><br>"
				+ "Email ID <sup style='color:red'>*</sup> :"
				+ "<input type='email' required/><br><br>"
				+ "Address1: <sup style='color:red'>*</sup><input type='text' "
				+ "size='150' name='current_address' required "
				+ "placeholder='Current Address'/><br><br>State "
				+ "<sup style='color:red'>*</sup> :<input type='text' name='state' "
				+ "required placeholder='State'><br><br> City <sup style='color:red'>"
				+ "*</sup>:<input type='text' name='city' required placeholder='City'>"
				+ "<br><br>PinCode <sup style='color:red'>*</sup> :"
				+ "<input type='text' name='pincode' required placeholder='PinCode'>"
				+ "<br><br><br> Address2:<sup style='color:red'>*</sup> "
				+ "<input type='text' size='150' name='permanent_address' "
				+ "placeholder='Permanent Address'/><br><br> State <sup style='color:red'"
				+ ">*</sup>:<input type='text' name='state' required placeholder='State'"
				+ "><br><br>City <sup style='color:red'>*</sup>:<input type='text' "
				+ "name='city' required placeholder='City'><br><br>"
				+ "PinCode <sup style='color:red'>*</sup>:<input type='text' "
				+ "name='pincode' required placeholder='PinCode'><br><br></strong>");
		out.println("<br/><br/><a href='bank.html'>Next</a>");
		out.println("</form></body></html>");
	}

}
