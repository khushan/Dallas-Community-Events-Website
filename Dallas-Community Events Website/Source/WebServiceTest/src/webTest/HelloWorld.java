package webTest;

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;




import org.apache.tomcat.util.codec.binary.Base64;

import sun.security.util.Length;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.sun.org.apache.bcel.internal.generic.RETURN;



public class HelloWorld {
	 private static byte[] key = {
         0x74, 0x68, 0x69, 0x73, 0x49, 0x73, 0x41, 0x53, 0x65, 0x63, 0x72, 0x65, 0x74, 0x4b, 0x65, 0x79
 };
	public String sayHello(String name){
		String s = "Hello " + name;
		return s;
	}
	
	public boolean insertLoginData(String user,String pwd){
		boolean status=false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3308/dfwevents","root","dbuser");
			String sql1 = "select * from memberDetails where username='"+user+"'";
			java.sql.PreparedStatement stmt1=conn.prepareStatement(sql1);
			ResultSet rs1 = stmt1.executeQuery();
			String passwordFromDB=null;
			while(rs1.next())
			{
				passwordFromDB = rs1.getString("password");
			}
			if(passwordFromDB==null)
			{
				return false;
			}
			else
			{
			
			
			
			String decString=decrypt(passwordFromDB);
			//String sql="select * from users where user_name = '" +user + "'and password = '" +  decString + "';";
			//System.out.println("Sql" + sql);
			//java.sql.PreparedStatement stmt=conn.prepareStatement(sql);
			//stmt.setString(1, user);
			//stmt.setString(2, pwd);
			System.out.println("User" + user + "Pwd" + pwd);
		    //ResultSet rs= stmt.executeQuery();
		    if(pwd.equals(decString)){
			//if(rs!=null){
			//while(rs.next()){
				//System.out.println("Set status as true");
				status=true;
			//}
			}
			//stmt.executeQuery();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	return status;
	}
	
	 public static String decrypt(String strToDecrypt)
	    {
	        try
	        {
	            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
	            final SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
	            cipher.init(Cipher.DECRYPT_MODE, secretKey);
	            final String decryptedString = new String(cipher.doFinal(Base64.decodeBase64(strToDecrypt)));
	            return decryptedString;
	        }
	        catch (Exception e)
	        {
	            System.out.println("Error while decrypting");

	        }
	        return null;
	    }
	
	public String[] getEventsData(){
		  Statement stmt=null;
		  Connection conn=null;
		 String[] eventList=new String[100];
		  String eventId,eventName="",date,time;
		try{
		         // Register JDBC driver
		         Class.forName("com.mysql.jdbc.Driver");

		         // Open a connection
		          conn=DriverManager.getConnection("jdbc:mysql://localhost:3308/dfwevents","root","dbuser");

		         // Execute SQL query
		        stmt = conn.createStatement();
		         String sql;
		         sql = "SELECT * FROM events";
		         ResultSet rs = stmt.executeQuery(sql);

		         // Extract data from result set
		         int i=0;
		         while(rs.next()){
		            //Retrieve by column name
		           eventId  = rs.getString("event_id");
		           eventName = rs.getString("event_name");
		           date=rs.getDate("event_date").toString();
		           time=rs.getString("event_time").toString();
		           eventList[i]=eventName;
		           i++;
		           eventList[i]=date;
		           i++;
		           eventList[i]=time;
		           i++;
		         }
		         
		         

		         // Clean-up environment
		         rs.close();
		         stmt.close();
		         conn.close();
		      }catch(SQLException se){
		         //Handle errors for JDBC
		         se.printStackTrace();
		      }catch(Exception e){
		         //Handle errors for Class.forName
		         e.printStackTrace();
		      }finally{
		         //finally block used to close resources
		         try{
		            if(stmt!=null)
		               stmt.close();
		         }catch(SQLException se2){
		         }// nothing we can do
		         try{
		            if(conn!=null)
		            conn.close();
		         }catch(SQLException se){
		            se.printStackTrace();
		         }//end finally try
		      } //end try
	return eventList;
	}
	
	public void insertRegisterData(String user,String pwd, String address,String email,String contact,String[] eventName,String date,String note){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3308/dfwevents","root","dbuser");
			if(eventName!=null){
				for(String s:eventName){
					int len=s.length();
					String str=s.substring(0,len-1);
			String sql="insert into registration values  ('" +user + "','" +  pwd + "','"  + email + "','" + contact + "','"+ str + "','" + date + "','" + address + "','" + note + "');";
			java.sql.PreparedStatement stmt=conn.prepareStatement(sql);
			//stmt.setString(1, user);
			//stmt.setString(2, pwd);
			//ResultSet rs= stmt.executeQuery();
			//status=true;
			stmt.executeUpdate();
			
		
			}
				String newString="";
				for(String s:eventName)
				{
					int len=s.length();
					String str=s.substring(0,len-1);
					newString = newString+str+",";
				}
				sendEmail(email,newString);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void sendEmail(String email, String eventName) {
		// TODO Auto-generated method stub
		//package awsProject;
		        final String username = " projectawsproject@gmail.com";
		        final String password = "123Werock";

		        Properties props = new Properties();
		        props.put("mail.smtp.starttls.enable", "true");
		        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		        props.put("mail.smtp.auth", "true");
		        props.put("mail.smtp.host", "smtp.gmail.com");
		        props.put("mail.smtp.port", "587");

		        Session session = Session.getInstance(props,
		          new javax.mail.Authenticator() {
		            protected PasswordAuthentication getPasswordAuthentication() {
		                return new PasswordAuthentication(username, password);
		            }
		          });

		        try {

		            Message message = new MimeMessage(session);
		            message.setFrom(new InternetAddress("projectawsproject@gmail.com"));
		            message.setRecipients(Message.RecipientType.TO,
		                InternetAddress.parse(email));
		            message.setSubject("Event Registration Confirmation");
		            message.setText("Dear Member,"
		                + "\n\n You have been registered for event : "+eventName);

		            Transport.send(message);

		            System.out.println("Done");

		        } catch (MessagingException e) {
		            throw new RuntimeException(e);
		        }
		    }
		
		
	

	public static void insertHostEventData(String eventName,String eventDesc,String eventVenue,String eventDate,String eventTime){
		 int eventId=0;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3308/dfwevents","root","dbuser");
		java.sql.PreparedStatement pstmt=conn.prepareStatement("select max(event_id) as id from events");
		 ResultSet rs = pstmt.executeQuery();

        // Extract data from result set
        while(rs.next()){
           //Retrieve by column name
          eventId = rs.getInt("id");
        }
        int neweventId=++eventId;
		java.sql.PreparedStatement stmt=conn.prepareStatement("insert into events values(?,?,?,?,?,?,?)");
		stmt.setInt(1, neweventId);
		stmt.setString(2, eventName);
		stmt.setString(3, eventDesc);
		stmt.setString(4, eventVenue);
		stmt.setString(5, eventDate);
		stmt.setString(6, eventTime);
		stmt.setString(7,"N");
		stmt.executeUpdate();
		
		System.out.println("Record inserted");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public void updateRegistrationData(String[] eventName){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3308/dfwevents","root","dbuser");
			String yes="Y";
			if(eventName!=null){
				for(String s:eventName){
					int len=s.length();
					String str=s.substring(0,len-1);
					System.out.println("String" + str);
			String sql=" update events set Approved=" + "'" + yes + "'" + " where event_name= " + "'" + str  + "'" + ";";
			System.out.println(sql);
			java.sql.PreparedStatement stmt=conn.prepareStatement(sql);
			//stmt.setString(1, user);
			//stmt.setString(2, pwd);
			//ResultSet rs= stmt.executeQuery();
			//status=true;
			stmt.executeUpdate();
			
		
			}
				/*String newString="";
				for(String s:eventName)
				{
					newString = newString+s+",";
				}
				sendEmail(email,newString);*/
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
