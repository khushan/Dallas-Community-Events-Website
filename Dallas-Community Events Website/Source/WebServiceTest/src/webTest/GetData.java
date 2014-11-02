package webTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;


public class GetData {
	public String[] getEventsData(){
		  Statement stmt=null;
		  Connection conn=null;
		  //ArrayList<String> eventList=new ArrayList<String>(); 
		  String[] eventList=new String[100];
		  EventDataBean evBean=new EventDataBean();
		  String eventId,eventName="",date;
		try{
		         // Register JDBC driver
		         Class.forName("com.mysql.jdbc.Driver");

		         // Open a connection
		          conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dfwevents","root","dbuser");

		         // Execute SQL query
		        stmt = conn.createStatement();
		         String sql;
		         sql = "SELECT * FROM events";
		         ResultSet rs = stmt.executeQuery(sql);
                 int i=0;
		         // Extract data from result set
		         while(rs.next()){
		            //Retrieve by column name
		           eventId  = rs.getString("event_id");
		           eventName = rs.getString("event_name");
		           date=rs.getDate("event_date").toString();
		           eventList[i]= eventName;
		           i++;
		           //evBean.setEventList(eventList);
		        /*  out.println(
		        		  eventTable.
		          );*/
		            
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
}
