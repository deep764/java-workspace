

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Context extends HttpServlet
{
	String driver;
	ServletContext context;
	
	
	public void init(ServletConfig config) throws ServletException 
	{
		
		this.context=config.getServletContext();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		
		
		driver = context.getInitParameter("driver");
		System.out.println(driver);
		
		
		
	}
}