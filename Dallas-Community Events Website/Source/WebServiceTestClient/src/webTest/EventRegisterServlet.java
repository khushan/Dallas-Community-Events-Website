package webTest;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.RemoteException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EventRegisterServlet
 */
@WebServlet("/EventRegisterServlet")
public class EventRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EventRegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");

	     PrintWriter out = response.getWriter();
	     String str1="";
	     String str = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">"
			+ "<html xmlns=\"http://www.w3.org/1999/xhtml\">"
			 + "<head>" 
			+ "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">"
			+ "<title>Untitled Form</title>"
			+"<link rel=\"stylesheet\" type=\"text/css\" href=\"view.css\" media=\"all\">"
			+"<script type=\"text/javascript\" src=\"view.js\"></script>"
			+"<script type=\"text/javascript\" src=\"calendar.js\"></script>"
			+"</head>"
			+"<body id=\"main_body\" >"
				
				+"<img id=\"top\" src=\"top.png\" alt=\"\">"
				+"<div id=\"form_container\">"
				
					+"<h1><a>Event Registration</a></h1>"
					+"<form id=\"form_830251\" class=\"appnitro\"  method=\"post\" action=\"Registration\">"
								+"<div class=\"form_description\">"
						+"<h2>Register Online!</h2>"
						
					+"</div>"						
						+"<ul >"
						
								+"<li id=\"li_1\" >"
					+"<label class=\"description\" for=\"element_1\">Full Name </label>"
					+"<span>"
						+"<input id=\"element_1_1\" name= \"element_1_1\" class=\"element text\" maxlength=\"255\" size=\"8\" value=\"\"/>"
						+"<label>UserName</label>"
					+"</span>"
					+"<span>"
						+"<input id=\"element_1_2\" name= \"element_1_2\" class=\"element text\" maxlength=\"255\" size=\"14\" value=\"\"/>"
						+"<label>Password</label>"
					+"</span>" 
					+"</li>		<li id=\"li_2\" >"
					+"<label class=\"description\" for=\"element_2\">Address </label>"
					
					+"<div>"
						+"<input id=\"element_2_1\" name=\"element_2_1\" class=\"element text large\" value=\"\" type=\"text\">"
						+"<label for=\"element_2_1\">Street Address</label>"
					+"</div>"
				
					+"<div>"
						+"<input id=\"element_2_2\" name=\"element_2_2\" class=\"element text large\" value=\"\" type=\"text\">"
						+"<label for=\"element_2_2\">Address Line 2</label>"
					+"</div>"
				
					+"<div class=\"left\">"
						+"<input id=\"element_2_3\" name=\"element_2_3\" class=\"element text medium\" value=\"\" type=\"text\">"
						+"<label for=\"element_2_3\">City</label>"
					+"</div>"
				
					+"<div class=\"right\">"
						+"<input id=\"element_2_4\" name=\"element_2_4\" class=\"element text medium\" value=\"\" type=\"text\">"
						+"<label for=\"element_2_4\">State / Province / Region</label>"
					+"</div>"
				
					+"<div class=\"left\">"
						+"<input id=\"element_2_5\" name=\"element_2_5\" class=\"element text medium\" maxlength=\"15\" value=\"\" type=\"text\">"
						+"<label for=\"element_2_5\">Postal / Zip Code</label>"
					+"</div>"
				
					+"<div class=\"right\">"
						+"<select class=\"element select medium\" id=\"element_2_6\" name=\"element_2_6\">" 
						+"<option value=\"\" selected=\"selected\"></option>"
			+"<option value=\"Afghanistan\" >Afghanistan</option>"
			
						+"</select>"
					+"<label for=\"element_2_6\">Country</label>"
				+"</div>" 
					+"</li>		<li id=\"li_3\" >"
					+"<label class=\"description\" for=\"element_3\">Email </label>"
					+"<div>"
						+"<input id=\"element_3\" name=\"element_3\" class=\"element text medium\" type=\"text\" maxlength=\"255\" value=\"\"/>" 
					+"</div>" 
					+"</li>		<li id=\"li_4\" >"
					+"<label class=\"description\" for=\"element_4\">Contact Number </label>"
					+"<div>"
						+"<input id=\"element_4\" name=\"element_4\" class=\"element text medium\" type=\"text\" maxlength=\"255\" value=\"\"/>" 
					+"</div>" 
					+"</li>		<li id=\"li_7\" >"
					+"<label class=\"description\" for=\"element_7\">Checkboxes </label>"
					+"<span>";
		HelloWorldProxy obj=new HelloWorldProxy();
        try {
         String[] evBean=obj.getEventsData();
        System.out.println("Length" + evBean.length);
		for(int i=0;i<evBean.length;i++){
			//if(evBean[i] == null)
			//System.out.println("Events" + evBean[i]);
			 out.println("Name : " + evBean[i]);
		        str1=str1+"<input id=\"element_7_1\" name=\"element_7_1\" class=\"element checkbox\" type=\"checkbox\" value="+evBean[i]+ "/>"
				+"<label class=\"choice\" for=\"element_7_1\">"+evBean[i]+"</label>";
		}
		
		String str2 = "</span>" 
				+"</li>		<li id=\"li_5\" >"
				+"<label class=\"description\" for=\"element_5\">Date (Select the date of event) </label>"
				+"<span>"
					+"<input id=\"element_5_1\" name=\"element_5_1\" class=\"element text\" size=\"2\" maxlength=\"2\" value=\"\" type=\"text\"> /"
					+"<label for=\"element_5_1\">MM</label>"
				+"</span>"
				+"<span>"
					+"<input id=\"element_5_2\" name=\"element_5_2\" class=\"element text\" size=\"2\" maxlength=\"2\" value=\"\" type=\"text\"> /"
					+"<label for=\"element_5_2\">DD</label>"
				+"</span>"
				+"<span>"
			 		+"<input id=\"element_5_3\" name=\"element_5_3\" class=\"element text\" size=\"4\" maxlength=\"4\" value=\"\" type=\"text\">"
					+"<label for=\"element_5_3\">YYYY</label>"
				+"</span>"
			
				+"<span id=\"calendar_5\">"
					+"<img id=\"cal_img_5\" class=\"datepicker\" src=\"calendar.gif\" alt=\"Pick a date.\">"	
				+"</span>"
				+"<script type=\"text/javascript\">"
					+"Calendar.setup({"
					+"inputField	 : \"element_5_3'\","
					+"baseField    : \"element_5\","
					+"displayArea  : \"calendar_5\","
					+"button		 : \"cal_img_5\","
					+"ifFormat	 : \"%B %e, %Y\","
					+"onSelect	 : selectDate"
					+"});"
				+"</script>"
				 
				+"</li>		<li id=\"li_6\" >"
				+"<label class=\"description\" for=\"element_6\">Add personal remarks : (Food preferance, transportation assistance etc) </label>"
				+"<div>"
					+"<textarea id=\"element_6\" name=\"element_6\" class=\"element textarea medium\"></textarea>" 
				+"</div>" 
				+"</li>"
					
							+"<li class=\"buttons\">"
							
					    +"<input type=\"hidden\" name=\"form_id\" value=\"830251\" />"
					    
						+"<input id=\"saveForm\" class=\"button_text\" type=\"submit\" name=\"submit\" value=\"Submit\" />"
				+"</li>"
					+"</ul>"
				+"</form>"	
				
			+"</div>"
			+"<img id=\"bottom\" src=\"bottom.png\" alt=\"\">"
			+"</body>"
		+"</html>"
	+"}";
		
		out.print(str+str1+str2);
        //System.out.println("events" + eventName.toString() );
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
