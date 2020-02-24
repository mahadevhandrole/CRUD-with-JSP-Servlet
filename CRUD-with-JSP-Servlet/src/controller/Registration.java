package controller;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import module.RegistrationJDBC;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sl_no=request.getParameter("sl_no1");
		String name=request.getParameter("name1");
		String password=request.getParameter("password1");
		String address=request.getParameter("address1");
		String city=request.getParameter("city1");
		String email=request.getParameter("email1");
		String gender=request.getParameter("gender1");
		String mobno1=request.getParameter("mobno3");
		String mobno2=request.getParameter("mobno4");
	String[] language1=new String[0];
		 language1=request.getParameterValues("lang1");
		String language=Arrays.deepToString(language1);

		RegistrationJDBC object_Registration=new RegistrationJDBC();
		int status=object_Registration.Reg(sl_no, name, password, address, city, email, gender, mobno1, mobno2, language);
		
		//int status=RegistrationJDBC.Reg(sl_no, name, password, address, city, email, gender, mobno1, mobno2, language);
		
		if(status>0)
		{
			RequestDispatcher rd=request.getRequestDispatcher("view/Home.jsp");
			rd.forward(request, response);
		
		}
		System.out.println("executed");
		doGet(request, response);
	}

}
