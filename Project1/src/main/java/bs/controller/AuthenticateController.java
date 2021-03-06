package bs.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.dao.IdDaoImpl;
import com.revature.util.ConnFactory;

public class AuthenticateController {
	public static ConnFactory cf= ConnFactory.getInstance();
	
	
	public static void login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		IdDaoImpl idi = new IdDaoImpl();
		String s = request.getParameter("email");
		try {
			idi.insertId(s);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println(request.getParameter("email"));
		
		response.sendRedirect("http://localhost:8080/Project1/api/home");//will cause url to change
		
//		RequestDispatcher rd = request.getRequestDispatcher("/api/home");//url will stay the same 
//		rd.forward(request, response);
	}

	public static void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.sendRedirect("http://localhost:8080/Project1/LoginEMP.html");
		
	}
}
