package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.SingUp;

public class buyProductDao {

	//public static void main(String args[])
	public String getdata()
	{
	 SingUp obj=new SingUp();
	 String str1=null;
	 
	try{  
		// DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/shoping","root","tiger");  
	  
		PreparedStatement stmt=con.prepareStatement("select fname,MoNo,addr from SingUp where uname=? and upass=? ");  
		//stmt.setString(1,obj.getUname());
		//stmt.setString(2,obj.getUpass());
		System.out.println(obj.getUname());
		stmt.setString(1, "yogesh");
		stmt.setString(2, "shree");
		ResultSet rs=stmt.executeQuery();  
		if(rs.next())
		{  
			obj.setFname(rs.getString(1));
			obj.setMoNo(rs.getString(2));
			obj.setAdd(rs.getString(3));
			System.out.println("exicuted...");
			
			//System.out.println(rs.getString(1));
			//System.out.println(rs.getString(2));
			//System.out.println(rs.getString(3));
			 str1=rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3);
		}
	

		}catch(Exception e){ System.out.print(e);
		
		}  
		return str1;
	}
}