import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Config extends HttpServlet
{
	String email,driver;
	ServletConfig config;
	
	public void init(ServletConfig config) throws ServletException 
	{
		this.config = config;
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		email = config.getInitParameter("email");
		System.out.println(email);
		
		
		
		
	}
}