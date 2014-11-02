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
 * Servlet implementation class HostEventServlet
 */
@WebServlet("/HostEventServlet")
public class HostEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PrintWriter out=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HostEventServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");

	     out = response.getWriter();
	     try{
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
				
					+"<h1><a>Host Event</a></h1>"
					+"<form id=\"form_830251\" class=\"appnitro\"  method=\"post\" action=\"HostEventServlet\">"
								+"<div class=\"form_description\">"
						
					+"</div>"						
						+"<ul >"
						
								+"<li id=\"li_1\" >"
					+"<label class=\"description\" for=\"element_1\">Event Name </label>"
					+"<div>"
					+"<input id=\"element_1\" name=\"element_1\" class=\"element text medium\" type=\"text\" maxlength=\"255\" value=\"\"/>" 
				+"</div>"
				+"<label class=\"description\" for=\"element_3\">Event Description </label>"
					+"<div>"
						+"<input id=\"element_3\" name=\"element_3\" class=\"element text medium\" type=\"text\" maxlength=\"255\" value=\"\"/>" 
					+"</div>"
					+"<label class=\"description\" for=\"element_4\">Event Venue </label>"
					+"<div>"
						+"<input id=\"element_4\" name=\"element_4\" class=\"element text medium\" type=\"text\" maxlength=\"255\" value=\"\"/>" 
					+"</div>"
					+"<label class=\"description\" for=\"element_5\">Event Date </label>"
					+"<div>"
						+"<input id=\"element_5\" name=\"element_5\" class=\"element text medium\" type=\"date\" maxlength=\"255\" value=\"\"/>" 
					+"</div>"
					+"<label class=\"description\" for=\"element_6\">Event Time </label>"
					+"<div>"
						+"<input id=\"element_6\" name=\"element_6\" class=\"element text medium\" type=\"time\" maxlength=\"255\" value=\"\"/>" 
					+"</div>"
					
				
							
					    +"<input type=\"hidden\" name=\"form_id\" value=\"830251\" />"
					    
						+"<input id=\"saveForm\" class=\"button_text\" type=\"submit\" name=\"submit\" value=\"Submit\" />"
				+"</li>"
					+"</ul>"
				+"</form>"	
				
			+"</div>"
			//+"<img id=\"bottom\" src=\"bottom.png\" alt=\"\">"
			+"</body>"
		+"</html>";
	//+"}";
		
		out.print(str);
       //System.out.println("events" + eventName.toString() );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String eventName= request.getParameter("element_1");
		String eventDesc=request.getParameter("element_3");
		String eventVenue=request.getParameter("element_4");
		String eventDate=request.getParameter("element_5");
		String eventTime= request.getParameter("element_6");
		System.out.println(eventName + " " + eventDesc + " " + eventVenue + " " + eventDate + " "+eventTime);
	    HelloWorldProxy helloObj=new HelloWorldProxy();
	    helloObj.insertHostEventData(eventName, eventDesc, eventVenue, eventDate, eventTime);
	    PrintWriter out1 = response.getWriter();

	    String str="<h1> Event Hosted Successfully" +
	    ".</h1>";
	    out1.println("<head>"
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
	    + " <li><a href='ShoppingPayment.html'>Online shop</a></li>"
	    + "<li><a href='index.html'>Log Out</a></li>"
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
