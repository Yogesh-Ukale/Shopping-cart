package Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import bean.*;

public class SingUpDao
{
	public String insert(SingUp obj)
	{
			//String str=obj.getAdd();
			//System.out.println(obj);
			
			String str1=null;
			try{  
				// DriverManager.registerDriver(new com.mysql.jdbc.Driver());
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/shoping","root","tiger");  
			  
				PreparedStatement stmt=con.prepareStatement("insert into SingUp values(?,?,?,?,?,?,?,?)");  
				//fname,MoNo,emailid,add,uname,upass,conpass
				stmt.setString(1,obj.getFname());
						stmt.setString(2,obj.getMoNo());
						stmt.setString(3,obj.getEmailid());
						stmt.setString(4,obj.getAdd());
						stmt.setString(5, obj.getPcode());
						stmt.setString(6,obj.getUname());
						stmt.setString(7,obj.getUpass());
						stmt.setString(8,obj.getConpass());
						
			
				
				int i=stmt.executeUpdate();  
				if(i==1)
				{
				str1 =new String( " records inserted");
				}
				
				con.close();
				}catch(Exception e){ System.out.print(e);}
			return str1;  
						
	}
}
