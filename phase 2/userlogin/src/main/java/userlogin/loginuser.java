package userlogin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginuser
 */
public class loginuser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginuser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("email");
		String pwd=request.getParameter("password");
		
		if(uname.equals("dhiraj0803@mail.com") && pwd.equals("dhiraj123"))
		{
			response.sendRedirect("dashboard.html");
		}
		else {
			response.sendRedirect("error page.html"); 
		}
	}

}
