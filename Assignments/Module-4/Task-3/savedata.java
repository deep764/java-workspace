import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintStream;

public class savedata extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
   {
        
        String firstName = request.getParameter("fname");
        String lastName = request.getParameter("lname");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String gender = request.getParameter("gender");
        String password = request.getParameter("pass");
        

        
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Mobile: " + mobile);
        System.out.println("Gender: " + gender);
        System.out.println("Pass: " + password);
        
        

        response.setContentType("text/html");
        response.getWriter().println("<h1>Student Information Submitted Successfully!</h1>");
        
    }
}
