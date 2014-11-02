package webTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html"); 
		String user=request.getParameter("element_1_1");
	    String pwd=request.getParameter("element_1_2");
	    String address= request.getParameter("element_2_1") + " " + request.getParameter("element_2_2") + " " +
	    		request.getParameter("element_2_3") + " " + request.getParameter("element_2_4") + " " + request.getParameter("element_2_5") + request.getParameter("element_2_6");
	    String email=request.getParameter("element_3");
	    String contactNo=request.getParameter("element_4");
	    String[] eventName=request.getParameterValues("element_7_1");
	    String mm=request.getParameter("element_5_1");
	    String dd=request.getParameter("element_5_2");
	    String yy=request.getParameter("element_5_3");
	    String date= "2014-05-05";  //+ "-" + mm + "-"+ dd;
	    String note=request.getParameter("element_6");
	    System.out.println("User" + user);
	    System.out.println("Pwd" + pwd);
	    System.out.println("address" + address);
	    System.out.println("Email" +email);
	    System.out.println("Contactno" + contactNo);
	    System.out.println("EventName" + eventName);
	    System.out.println("mm dd yy" + mm + " " + dd + " " + yy);
	    System.out.println("note" + note);
	    HelloWorldProxy obj=new HelloWorldProxy();
	    obj.insertRegisterData(user, pwd, address, email, contactNo, eventName, date, note);
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();

	    String str="<h1> Registered successfully for the event" +
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
