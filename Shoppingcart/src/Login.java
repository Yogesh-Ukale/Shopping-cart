
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.*;
import java.io.*;
import java.sql.*;
import bean.*;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Login() {
        // TODO Auto-generated constructor stub
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		//PrintWriter out=response.getWriter();
		
		
		
		String uname,upass;
		uname=request.getParameter("t1");
		upass=request.getParameter("t2");
		
		//out.println(uname);
		//out.println(upass);
		
	//	 ob=new User();
	    SingUp ob=new SingUp();
		ob.setUpass(upass);
		ob.setUname(uname);
		
		UserDao ud=new UserDao();
		
		//out.print(ud.validate(ob));
		if(ud.validate(ob))
		{
			HttpSession session=request.getSession(false); 
			session.setAttribute("user",ob);
			//session.setAttribute("upass", upass);
			//buyProductDao bup=new buyProductDao();
					//bup.getdata(ob);
			response.sendRedirect("index.jsp");
		}
		else
		{
			
			response.sendRedirect("Login.html");
		}
	
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
			

	}

}
