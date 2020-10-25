
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Dao.*;
import java.io.*;
import java.sql.*;
import bean.*;
/**
 * Servlet implementation class CreateAccount
 */
@WebServlet("/CreateAccount")
public class CreateAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		
		String fname,MoNo,emailid,add,p_code,uname,upass,conpass;
		fname=request.getParameter("t1");
		MoNo=request.getParameter("t2");
		emailid=request.getParameter("t3");
		add=request.getParameter("t4");
		p_code=request.getParameter("t5");
		uname=request.getParameter("t6");
		upass=request.getParameter("t7");
		conpass=request.getParameter("t8");
		
		SingUp obj=new SingUp();
		obj.setFname(fname);
		obj.setMoNo(MoNo);
		obj.setEmailid(emailid);
		obj.setAdd(add);
		obj.setPcode(p_code);
		obj.setUname(uname);
		obj.setUpass(upass);
		obj.setConpass(conpass);
		
		SingUpDao in =new SingUpDao();
		
		 in.insert(obj);
		
		
			}  

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
