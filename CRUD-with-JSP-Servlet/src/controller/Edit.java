package controller;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.User_Bean;


import module.EditJDBC;

/**
 * Servlet implementation class Edit
 */
@WebServlet("/Edit")
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Edit() {
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
		
		
		String sl_no=request.getParameter("sl_no1");
		String name=request.getParameter("name1");
		String password=request.getParameter("pwd1");
		String address=request.getParameter("address1");
		String city=request.getParameter("city1");
		String email=request.getParameter("email1");
		String gender=request.getParameter("gender1");
		String mobno1=request.getParameter("mobno3");
		String mobno2=request.getParameter("mobno4");
		//String language=request.getParameter("language");
		
		//String language1[]=request.getParameterValues("language");
		String[] lang2=new String[0];	
		lang2=request.getParameterValues("lang1");
			//System.out.println(request.getParameterValues("language1"));
	         String language=Arrays.deepToString(lang2);
			
		
		//common.User_Bean bject_User_Bean=new common.User_Bean();
     User_Bean object_User_bean=new User_Bean();


		//User_Bean Object_User_Bean=new User_Bean();

        object_User_bean.setSl_no(sl_no);
		object_User_bean.setName(name);
		object_User_bean.setPassword(password);
		object_User_bean.setAddress(address);
		object_User_bean.setCity(city);
		object_User_bean.setEmail(email);
		object_User_bean.setGender(gender);
		object_User_bean.setMobno1(mobno1);
		object_User_bean.setMobno2(mobno2);
		//for(String language:language1)
		//{
		object_User_bean.setLanguage(language);
		//}
		

		EditJDBC object_edit=new EditJDBC();

		object_edit.Edit_User(object_User_bean);
		
		
		doGet(request, response);
		
		response.sendRedirect("view/Home.jsp");
		
	}

}
