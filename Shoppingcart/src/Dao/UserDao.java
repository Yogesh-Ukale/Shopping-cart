package Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.SingUp;

public class UserDao {

	public boolean validate(SingUp obj) {
		
		//boolena str1=null;
		
		
		try{  
			// DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/shoping","root","tiger");  
		  
			PreparedStatement stmt=con.prepareStatement("select uname, upass from SingUp where uname=? and upass=? ");  
			stmt.setString(1,obj.getUname());
			stmt.setString(2,obj.getUpass());
			ResultSet rs=stmt.executeQuery();  
			if(rs.next())
			{  
				//out.println(rs.getString(2));
				//obj.setRole(rs.);
				//str1 =new String( "login sucess...");
				String str1=obj.getUname();
				String str2=obj.getUpass();
				obj.setUname(str1);
				obj.setUpass(str2);
				return true;
			}
			else		
			{
				//str1=new String("Enter valid User and pass......");
				return false;
			}
	
			}catch(Exception e){ System.out.print(e);
				return false;
			}  
			
}

	
}
