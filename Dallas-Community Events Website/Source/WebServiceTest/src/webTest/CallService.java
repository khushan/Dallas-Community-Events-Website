package webTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CallService {
	public String hello(String name){
		
		String str = "Hi "+ name + "!!";
		System.out.println(str);
		return str;
	}
	
	/// Signup function
	
	public boolean signUp(String firstName, String lastName, String userName, String password){
		String count="";
		int flag=0;
		
		try
		{
			//System.out.println("h1");
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("h2");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/dfwevents","root","dbuser");
			String u = "select count(*) as cnt from logindetails where userName = '"+ userName +"';";
			//System.out.println("h3");
			PreparedStatement ps= con.prepareStatement(u); 
			ResultSet rs = ps.executeQuery();
			//System.out.println("h4");
			while(rs.next())
			{
				count = rs.getString("cnt");
			}
			
			if(Integer.parseInt(count) > 0){
				//output = "User Already exists";
				//return false;
				flag = 0;
			}
			else {
				u = "insert into logindetails (firstName, lastName, userName, password) values ('"+ firstName +"','"+lastName+"','"+userName+"','"+password+"');";
				ps= con.prepareStatement(u); 
				ps.executeUpdate(u);
				//output = "Registration Successful!!!";
				flag = 1;
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e); 
		}
		
		if(flag ==0)
			return false;
		else
			return true;
	}
	
	public String[] ajaxCall(String country){
		String[] statelist = new String[100];
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/dfwevents","root","dbuser");
			String u = "select state from statelist where country = '"+ country +"';";
			PreparedStatement ps= con.prepareStatement(u); 
			ResultSet rs = ps.executeQuery();
			
			int n=0;
			while(rs.next())
			{
				statelist[n++] = rs.getString("state");
			}	
			
		}
		catch(Exception e)
		{
			System.out.println(e); 
		}
		
		return statelist;
	}
	
	public String addCartDetails(String id1, int q1, float subTot1, String id2, int q2, float subTot2,String id3, int q3, float subTot3, float total, String firstName, String lastName, String country, String state, String city, String address1, String address2, String cardType, String cardNo, int securityNo, int  expiryMonth, int expiryYear){
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
		Date date = new Date();
		String sDate= sdf.format(date);
		sDate= sDate+firstName+lastName;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/dfwevents","root","dbuser");
			ResultSet rs;
			PreparedStatement ps;
			
			if(subTot1 >0){
				String u = "insert into shoppingCart values( '"+sDate+"' , '"+ id1 + "', "+ q1 +","+ subTot1 +",'"+firstName+"','"+ lastName+"', '"+country+"', '"+state+"', '"+city+"', '"+address1+"', '"+address2+"', '"+cardType+"', '"+cardNo+"', "+securityNo+", "+expiryMonth+", "+expiryYear+");";
				ps= con.prepareStatement(u); 
				ps.executeUpdate();
				
			}
			
			if(subTot2 >0){
				String u = "insert into shoppingCart values( '"+sDate+"' , '"+ id2 + "', "+ q2 +","+ subTot2 +",'"+firstName+"','"+ lastName+"', '"+country+"', '"+state+"', '"+city+"', '"+address1+"', '"+address2+"', '"+cardType+"', "+cardNo+", "+securityNo+", "+expiryMonth+", "+expiryYear+");";
				ps= con.prepareStatement(u);
				ps.executeUpdate(u);
			}
			
			if(subTot3 >0){
				String u = "insert into shoppingCart values( '"+sDate+"' , '"+ id3 + "', "+ q3 +","+ subTot3 +",'"+firstName+"','"+ lastName+"', '"+country+"', '"+state+"', '"+city+"', '"+address1+"', '"+address2+"', '"+cardType+"', "+cardNo+", "+securityNo+", "+expiryMonth+", "+expiryYear+");";
				ps= con.prepareStatement(u); 
				ps.executeUpdate(u);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e); 
		}
		return sDate;
	}
	
	public boolean insertPickupDetails(String firstName, String lastName, String state, String city, String address1, String address2, String datetime, String contact, String message){
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/dfwevents","root","dbuser");
			ResultSet rs;
			PreparedStatement ps;
			String u = "insert into pickup_service values('"+firstName+"','"+lastName + "', '"+ address1 +"','"+address2 + "','"+city+"','"+state+"','"+datetime+"','"+contact+"','"+message+"');";
			ps= con.prepareStatement(u); 
			ps.executeUpdate();
			return true;	
			
		}
		catch(Exception e)
		{
			System.out.println(e); 
			return false;
		}
	}
	
	public String[] fetchPickupDetails(){
		int count=0;
		try{
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/dfwevents","root","dbuser");
			String u = "select count(*) as cnt from pickup_service;";
			PreparedStatement ps= con.prepareStatement(u); 
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				count=Integer.parseInt(rs.getString("cnt"));
			}
		}
		catch(Exception e)
		{
			System.out.println(e); 
		}
		
		String[] str = new String[count*9];
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3308/dfwevents","root","dbuser");
			/*u = "select count(*) as cnt from pickup_service;";
			ps= con.prepareStatement(u); 
			rs = ps.executeQuery();
			count=0;
			while(rs.next()){
				count=Integer.parseInt(rs.getString("cnt"));
			}*/
			String u = "select * from pickup_service;";
			PreparedStatement ps= conn.prepareStatement(u); 
			ResultSet rs = ps.executeQuery();
			
			int n=0;
			while(rs.next())
			{
				str[n++] = rs.getString("firstname");
				str[n++] = rs.getString("lastname");
				str[n++] = rs.getString("address1");
				str[n++] = rs.getString("address2");
				str[n++] = rs.getString("city");
				str[n++] = rs.getString("state");
				str[n++] = rs.getString("datetime");
				str[n++] = rs.getString("contact");
				str[n++] = rs.getString("message");
			}	
			
		}
		catch(Exception e)
		{
			System.out.println(e); 
		}
		System.out.println(str.length);
		return str;
	}
	
	public String addSubscriptionDetails(String userName, String id1, int
			q1, float subTot1, String id2, int q2, float subTot2, float total,
			String firstName, String lastName, String country, String state,
			String city, String address1, String address2, String cardType, String
			cardNo, int securityNo, int  expiryMonth, int expiryYear){
			SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
			Date date = new Date();
			String sDate= sdf.format(date);
			sDate= sDate+firstName+lastName;
			try
			{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
					DriverManager.getConnection("jdbc:mysql://localhost:3308/dfwevents","root","dbuser");
			//ResultSet rs;
			PreparedStatement ps;
			if(subTot1 >0){
			String u = "insert into subscription_details values('"+userName+"','"+sDate+"' , '"+ id1 + "', "+ q1 +","+ subTot1 +",'"+firstName+"','"+lastName+"', '"+country+"', '"+state+"', '"+city+"', '"+address1+"','"+address2+"', '"+cardType+"', '"+cardNo+"', "+securityNo+","+expiryMonth+", "+expiryYear+");";
			ps= con.prepareStatement(u);
			ps.executeUpdate();
			}
			if(subTot2 >0){
			String u = "insert into subscription_details values( '"+userName+"' ,'"+sDate+"' , '"+ id2 + "', "+ q2 +","+ subTot2 +",'"+firstName+"','"+	lastName+"', '"+country+"', '"+state+"', '"+city+"', '"+address1+"','"+address2+"', '"+cardType+"', "+cardNo+", "+securityNo+",	"+expiryMonth+", "+expiryYear+");";
			ps= con.prepareStatement(u);
			ps.executeUpdate(u);
			}
			}
			catch(Exception e)
			{
			System.out.println(e);
			}
		return sDate;
		}
	
	public static void main(String args[]){
		CallService c = new CallService();
		boolean result = c.signUp("khushan", "adatiya", "khush@gmail.com", "khushan123");
		System.out.println(result);
		
	}
	

}
