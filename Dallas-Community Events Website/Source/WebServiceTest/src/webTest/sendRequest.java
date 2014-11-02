package webTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.tomcat.util.codec.binary.Base64;


public class sendRequest {
	 private static byte[] key = {
         0x74, 0x68, 0x69, 0x73, 0x49, 0x73, 0x41, 0x53, 0x65, 0x63, 0x72, 0x65, 0x74, 0x4b, 0x65, 0x79
 };
	
	public static String encrypt(String strToEncrypt)
    {
        try
        {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            final SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            final String encryptedString = Base64.encodeBase64String(cipher.doFinal(strToEncrypt.getBytes()));
            return encryptedString;
        }
        catch (Exception e)
        {
            System.out.println("Error while encrypting");
        }
        return null;

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
	
	
	
		public String acceptRequest(String name,String address, String contact,String email,String username,String password)
		{
			final String DB_URL = "jdbc:mysql://localhost:3308/dfwevents";
			
			final String USER = "root";
			final String PASS = "dbuser";
			   
			 
			   Connection conn = null;
			   Statement stmt = null;
			   Statement stmt1 =null;
			   try{
			      //STEP 2: Register JDBC driver
			      Class.forName("com.mysql.jdbc.Driver");

			      //STEP 3: Open a connection
			      System.out.println("Connecting to database...");
			      conn = DriverManager.getConnection(DB_URL,USER,PASS);

			      //STEP 4: Execute a query
			      System.out.println("Creating statement...");
			      stmt = conn.createStatement();
			      stmt1 = conn.createStatement();
			      String sql;
			      sql = "SELECT * FROM memberDetails where username = '"+username+"'";
			      ResultSet rs = stmt.executeQuery(sql);
			      String faultyUsername=null;
		    	  System.out.println("outside while");
		    	  String toencrypt=password;
		    	  String encrypted = encrypt(toencrypt);
		    	  System.out.println("Encrypted string : "+encrypted);
		    	  String decrypted = decrypt(encrypted);
		    	  System.out.println("Decrypted string : "+decrypted);

			      while(rs.next())
			      {
			    	  System.out.println("inside while");
			    	 faultyUsername = rs.getString("username");
			      }
			      
			      
		    	  System.out.println("outside while again");

			      if(faultyUsername==null||faultyUsername.equals(""))
			      {
			    	  stmt.executeUpdate("insert into memberDetails values('"+name+"','"+address+"','"+contact+"','"+email+"','"+username+"','"+encrypted+"')");
			    	  rs.close();
				      stmt.close();
				      conn.close();
			    	  return ("Registration successful! Welcome to the community");
			      }
			      else
			      {
			    	  rs.close();
				      stmt.close();
				      conn.close();
			    	  return ("This username already exists");
			      }
			      //STEP 6: Clean-up environment
			      
			      
			     
			     
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
			   }//end try
			   return null;
		}
	

}
