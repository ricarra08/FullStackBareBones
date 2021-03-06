package bs.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHelper {
	
	public static void process(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		String  s = request.getRequestURI();
		
		switch(s) {
		
		case "/Project1/api/login":
			AuthenticateController.login(request,response);
			break;
			
		case "/Project1/api/home":
			HomeController.getHomePage(request, response);
			break;
		case "/Project1/api/logout":
			AuthenticateController.logout(request,response);
			break;
		case "/Project1/api/EMPTrms":
			HomeController.getTrmsForm(request, response);
		}
	}
}
