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
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
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
	     String str1="",str2="",str3="";
	     String str = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">"
			+ "<html xmlns=\"http://www.w3.org/1999/xhtml\">"
			 + "<head>" 
			+ "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">"
			+ "<title>Untitled Form</title>"
			+"<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" media=\"all\">"
			+"<script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>"
			+"<script type=\"text/javascript\" src=\"js/jquery.easing.min.js\"></script>"
			+"<script type=\"text/javascript\" src=\"js/jquery.nivo.slider.pack.js\"></script>"
			+"</head>"
			+"<body id=\"main_body\" >"
				
				+"<img id=\"top\" src=\"images/events_1.jpg\" alt=\"\">"
				+"<div id=\"form_container\">"
				
					+"<h1><a>Event Registration Approvals</a></h1>"
					+"<form id=\"form_830251\" class=\"appnitro\"  method=\"post\" action=\"AdminServlet\">"
								+"<div class=\"form_description\">"
						+"<h2>Register Online!</h2>"
						
					+"</div>"						
						+"<ul >"
						
								/*+"<li id=\"li_1\" >"
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
					+"</div>" */
					+"</li>		<li id=\"li_7\" >"
					+"<label class=\"description\" for=\"element_7\">Checkboxes </label>"
					+"<span>";
		HelloWorldProxy obj=new HelloWorldProxy();
        try {
         String[] evBean=obj.getEventsData();
        System.out.println("Length" + evBean.length);
		for(int i=0;i<evBean.length;i++){
			if(evBean[i] != null){
		        str1=str1+"<input id=\"element_7_1\" name=\"element_7_1\" class=\"element checkbox\" type=\"checkbox\" value="+evBean[i]+ "/>"
				+"<label class=\"choice\" for=\"element_7_1\">"+evBean[i]+ " " + evBean[i+1] +"</label>";
		        i=i+2;
		        /*str2="</span>" 
						+"</li>		<li id=\"li_5\" >"
						+"<label class=\"description\" for=\"element_5\">Date (Select the date of event) </label>"
						+"<span>"
							+"<input id=\"element_5_1\" name=\"element_5_1\" class=\"element text\" size=\"2\" maxlength=\"2\" value="+evBean[i]+" type=\"text\"> /"
							+"<label for=\"element_5_1\">YYYY-MM-DD</label>"
						+"</span>";*/
		}
		}
		
		/*String str2 = "</span>" 
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
					"<input id=\"element_5_3\" name=\"element_5_3\" class=\"element text\" size=\"4\" maxlength=\"4\" value=\"\" type=\"text\">"
					+"<label for=\"element_5_3\">YYYY</label>"
				+"</span>"
*/			
		str3 = /*"<span id=\"calendar_5\">"
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
				+"</li>"*/
					
							"<li class=\"buttons\">"
							
					    +"<input type=\"hidden\" name=\"form_id\" value=\"830251\" />"
					    
						+"<input id=\"saveForm\" class=\"button_text\" type=\"submit\" name=\"submit\" value=\"Approve\" />"
				+"</li>"
					+"</ul>"
				+"</form>"	
				
			+"</div>"
			//+"<img id=\"bottom\" src=\"bottom.png\" alt=\"\">"
			+"</body>"
		+"</html>";
	//+"}";
		
		out.print(str+str1+str2+str3);
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
		
	    String[] eventName=request.getParameterValues("element_7_1");
	    /*String mm=request.getParameter("element_5_1");
	    String dd=request.getParameter("element_5_2");
	    String yy=request.getParameter("element_5_3");
	    String date= "2014-05-05";  //+ "-" + mm + "-"+ dd;
	    String note=request.getParameter("element_6");*/
	    System.out.println("Inside doPost of AdminServlet");
	    HelloWorldProxy obj=new HelloWorldProxy();
	    obj.updateRegistrationData(eventName);
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();

	    String str="<h1> The event/s were approved successfully" +
	    ".</h1>";
	    out.println("<head>"
	    + "<link rel='stylesheet' type='text/css' href='css/style.css' />"
	    + "<script type='text/javascript' src='js/jquery.min.js'></script>"
	    + "<script type='text/javascript' src='js/jquery.easing.min.js'></script>"
	    + "<script type='text/javascript' src='js/jquery.nivo.slider.pack.js'></script>"
	    + "<script type='text/javascript'>"
	    + " $(window).load(function() {"
	    + "$('#slider').nivoSlider();"
	    + " });"
	    + "</script>"
	    + "<title> submit </title>"
	    + "</head>"
	    + "<body>"
	    + "<div id='main'>"
	    + " <div id='menubar'>"
	    + " <div id='welcome'>"
	    + " <h1>Dallas Community Events</h1>"
	    + " </div><!--close welcome-->"
	    + "<div id='menu_items'>"
	    + " <ul id='menu'>"
	    + " <li class='current'><a href='index.html'>Home</a></li>"
	    + " <li><a href='LoginServlet'>Event Registration</a></li>"
	    + " <li><a href='Login.html'>Login</a></li>"
	    + " <li><a href='#'>Online shop</a></li>"
	    + " <li><a href='#'>Contact Us</a></li>"
	    + " </ul>"
	    + " </div><!--close menu-->"
	    + "</div><!--close menubar-->"
	    + "<div id='site_content'>"
	      +"<div id='banner_image'>"
	    + " <div id='slider-wrapper'>"
	    + " <div id='slider' class='nivoSlider'>"
	    + " <img src='images/home_3.jpg' alt='' width='400' />"
	    + " <img src='images/home_4.jpg' alt='' />"
	    + " </div><!--close slider-->"
	    + " </div><!--close slider_wrapper-->"
	    + "</div><!--close banner_image--> "
	    + "<div class='sidebar_container'>"
	    + " <div class='sidebar'>"
	    + " <div class='sidebar_item'>"
	    + " <h2>Dallas Communities</h2>"
	    + " <p>Welcome to our new website. Get connected to your community in"
	    + "our Country! Have a look around!</p>"
	    + " </div><!--close sidebar_item-->"
	    + " </div><!--close sidebar-->"
	    + "<div class='sidebar'>"
	    + " <div class='sidebar_item'>"
	    + " <h2>Latest Update</h2>"
	    + " <p></p>"
	    + " </div><!--close sidebar_item--> "
	    + "</div><!--close sidebar-->"
	    + "<div class='sidebar'>"
	    + " <div class='sidebar_item'>"
	    + " <p></p>"
	    + " </div><!--close sidebar_item--> "
	    + "</div><!--close sidebar-->   "
	    + "</div><!--close sidebar_container-->"
	    //+ "<div id='content'>"
	    /*+ " <div class='content_item'>"
	    + " <h1>Welcome!</h1> "
	    + " <p>An easy way to stay near your cultures by staying far away from
	    the country.Get connected to your communitiy people. Be up to date
	    with your communities events.Book tickets, host events, Enjoy!!</p> "
	    + " <div class='content_container'>"
	    + " <p>GUJRATI SAMAAJ</p>"
	    + " <div class='button_small'>"
	    + " <a href='#'>Read more</a>"
	    + " </div><!--close button_small-->"
	    + " </div><!--close content_container-->"
	    + " </div><!--close content_container-->"*/
	    + " <div class='content_container'>"
	    + " <h1>" + str + "</h1>"
	    + " </div><!--close content_container-->"
	    + "<div id='content_blue'>"
	    + " <div class='content_blue_container_box'>"
	    + " <h4>Latest Blog Post</h4>"
	    + " <p>Some articles from the top leaders of these communities! Get to" +
	   " know about their experience with their communities</p>"
	    + " <div class='readmore'>"
	    + " <a href='#'>Read more</a>"
	    + " </div><!--close readmore-->"
	    + " </div><!--close content_blue_container_box-->"
	    + " <div class='content_blue_container_box'>"
	    + " <h4>Latest News</h4>"
	    + " <p>Scheduled events, parties and a lot more! Subscribe for a "+
	   " newsletter and dont miss a single thing! </p>"
	    + " <div class='readmore'>"
	    + " <a href='#'>Read more</a>"
	    + " </div><!--close readmore-->"
	    + " </div><!--close content_blue_container_box-->"
	    + " <div class='content_blue_container_boxl'>"
	    + " <h4>Offers and Coupons</h4>"
	    + " <p>Get discounts on your community events and online shop. Be a" +
	  "  member and enjoy the offers </p>"
	    + " <div class='readmore'>"
	    + " <a href='#'>Read more</a>"
	    + " </div><!--close readmore-->"
	    + " <br style='clear:both'/>"
	    + "</div><!--close content_blue-->"
	    + "</div><!--close site_content--> "
	    + "</div><!--close main-->"
	    //+ "</div><!--close content_item-->"
	    //+ "</div><!--close content--> "
	    //+ "</div><!--close site_content-->"
	    //+ "</div><!--close main-->"
	    //+ "<h1>" + str + "</h1>"
	    + "</body>"
	    );
	}

}
