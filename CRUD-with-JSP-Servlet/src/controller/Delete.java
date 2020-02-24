package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import module.DeleteJDBC;

/**
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String sl_no=request.getParameter("sl_no");
			//System.out.println(sl_no);
			
			DeleteJDBC object_DeleteJDBC= new DeleteJDBC();
			int status=object_DeleteJDBC.DeleteData(sl_no);
			//int status=DeleteJDBC.DeleteData(sl_no);
			//response.sendRedirect("Home.jsp");
			if(status>0)
			{
				RequestDispatcher rd=request.getRequestDispatcher("view/Home.jsp");
				rd.include(request, response);
			}
			
			System.out.println("executed");
			
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
      
		doGet(request, response);
		
	}

}
