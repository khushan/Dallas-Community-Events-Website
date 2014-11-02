package webTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class viewPickupRequest
 */
@WebServlet("/viewPickupRequest")
public class viewPickupRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewPickupRequest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
CallServiceProxy c = new CallServiceProxy();
		
		String output[]  = c.fetchPickupDetails();
		//System.out.println("hi1 " + output.length);
		String str="<table>";
		str = str + "<tr>";
		str = str + "<th>First Name</th>";
		str = str + "<th> Last Name</th>";
		str = str + "<th> Address Line 1</th>";
		str = str + "<th> Address Line 2 </th>";
		str = str + "<th> City </th>";
		str = str + "<th> State </th>";
		str = str + "<th> Date and Time</th>";
		str = str + "<th> Contact Details</th>";
		str = str + "<th> Message </th>";
		str = str + "</tr>";
		
		for(int i=0; i < output.length; i++){
			
		str=str+"<tr><td>"+output[i++]+"</td>";	
		str=str+"<td>"+output[i++]+"</td>";
		str=str+"<td>"+output[i++]+"</td>";
		str=str+"<td>"+output[i++]+"</td>";
		str=str+"<td>"+output[i++]+"</td>";
		str=str+"<td>"+output[i++]+"</td>";
		
		String date=output[i++];
		date=date.replace('T', ' ');
		
		//System.out.println(date);
		//String year= date.substring(0,4);
		//String month=date.substring(5,7);
		//String day=date.substring(8,10);;
		//String time=date.substring(11);
		//System.out.println(year);
		//System.out.println(month );
		//System.out.println(day);
		//System.out.println(time);
		str=str+"<td>"+date+"</td>";// string to display date
		str=str+"<td>"+output[i++]+"</td>";
		str=str+"<td>"+output[i]+"</td></tr>";
		}
		str=str+"</table>";
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
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
				+ "	<div id='menubar'>"
				+ "		<div id='welcome'>"
				+ "		<h1>Dallas Community Events</h1>"
				+ "	</div><!--close welcome-->"
				+ "<div id='menu_items'>"
				+ "		<ul id='menu'>"
				+ "			<li class='current'><a href='index.html'>Home</a></li>"
				+ "			<li><a href='eventRegistration.php'>Event Registration</a></li>"
				+ "			<li><a href='login.php'>Login</a></li>"
				+ " <li><a href='ShoppingPayment.html'>Online shop</a></li>"
			    + "<li><a href='index.html'>Log Out</a></li>"
				+ "			</ul>"
				+ "	</div><!--close menu-->"
				+ "</div><!--close menubar-->"
				+ "<div id='site_content'>"		
	  			+"<div id='banner_image'>"
				+ "	<div id='slider-wrapper'>"
				+ "		<div id='slider' class='nivoSlider'>"
				+ "			<img src='images/home_3.jpg' alt='' width='400' />"
				+ "			<img src='images/home_4.jpg' alt='' />"
				+ "		</div><!--close slider-->"
				+ "	</div><!--close slider_wrapper-->"
				+ "</div><!--close banner_image-->	"
				+ "<div class='sidebar_container'>"
				+ "	<div class='sidebar'>"
				+ "		<div class='sidebar_item'>"
				+ "			<h2>Dallas Communities</h2>"
				+ "			<p>Welcome to our new website. Get connected to your community in our Country! Have a look around!</p>"
				+ "		</div><!--close sidebar_item-->"
				+ "	</div><!--close sidebar-->"
				+ "<div class='sidebar'>"
				+ "	<div class='sidebar_item'>"
				+ "		<h2>Latest Update</h2>"
				+ "		<p></p>"
				+ "	</div><!--close sidebar_item--> "
				+ "</div><!--close sidebar-->"
				+ "<div class='sidebar'>"
				+ "	<div class='sidebar_item'>"
				+ "		<p></p>"
				+ "	</div><!--close sidebar_item--> "
				+ "</div><!--close sidebar-->  		"
				+ "</div><!--close sidebar_container-->"
				+ "<div id='content'>"
				+ "	<div class='content_containe'>"
				+str
				
				+ "	</div><!--close content_container-->"
				+ "</div><!--close content_item-->"
				+ "</div><!--close content--> "
				+ "</div><!--close site_content-->"
				+ "</div><!--close main-->"
				+ "<div id='content_blue'>"
				+ "	<div class='content_blue_container_box'>"
				+ "		<h4>Latest Blog Post</h4>"
				+ "		<p>Some articles from the top leaders of these communities! Get to know about their experience with their communities</p>"
				+ "		<div class='readmore'>"
				+ "			<a href='#''>Read more</a>"
				+ "		</div><!--close readmore-->"
				+ "	</div><!--close content_blue_container_box-->"
				+ "	<div class='content_blue_container_box'>"
				+ "		<h4>Latest News</h4>"
				+ "			<p>Scheduled events, parties and a lot more! Subscribe for a newsletter and dont miss a single thing! </p>"
				+ "		<div class='readmore'>"
				+ "			<a href='#''>Read more</a>"
				+ "		</div><!--close readmore-->"
				+ "	</div><!--close content_blue_container_box-->"
				+ "	<div class='content_blue_container_boxl'>"
				+ "		<h4>Offers and Coupons</h4>"
				+ "		<p>Get discounts on your community events and online shop. Be a member and enjoy the offers </p>"
				+ "		<div class='readmore'>"
				+ "			<a href='#'>Read more</a>"
				+ "		</div><!--close readmore-->"
				+ "	<br style='clear:both'/>"
				+ "</div><!--close content_blue-->"
				+ "</div><!--close site_content-->"
				+ "</div><!--close main-->"
				+ "</body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		CallServiceProxy c = new CallServiceProxy();
		
		String output[]  = c.fetchPickupDetails();
		System.out.println("hi1");
		String str="<table>";
		str = str + "<tr>";
		str = str + "<th>First Name</th>";
		str = str + "<th> Last Name</th>";
		str = str + "<th> Address Line 1</th>";
		str = str + "<th> Address Line 2 </th>";
		str = str + "<th> City </th>";
		str = str + "<th> State </th>";
		str = str + "<th> Date and Time</th>";
		str = str + "<th> Contact Details</th>";
		str = str + "<th> Message </th>";
		str = str + "</tr></table>";
		
		for(int i=0; i < output.length; i++){
			
			
			
		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
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
				+ "	<div id='menubar'>"
				+ "		<div id='welcome'>"
				+ "		<h1>Dallas Community Events</h1>"
				+ "	</div><!--close welcome-->"
				+ "<div id='menu_items'>"
				+ "		<ul id='menu'>"
				+ "			<li class='current'><a href='index.html'>Home</a></li>"
				+ "			<li><a href='eventRegistration.php'>Event Registration</a></li>"
				+ "			<li><a href='login.php'>Login</a></li>"
				+ "			<li><a href='#'>Online shop</a></li>"
				+ "			<li><a href='#'>Contact Us</a></li>"
				+ "			</ul>"
				+ "	</div><!--close menu-->"
				+ "</div><!--close menubar-->"
				+ "<div id='site_content'>"		
	  			+"<div id='banner_image'>"
				+ "	<div id='slider-wrapper'>"
				+ "		<div id='slider' class='nivoSlider'>"
				+ "			<img src='images/home_3.jpg' alt='' width='400' />"
				+ "			<img src='images/home_4.jpg' alt='' />"
				+ "		</div><!--close slider-->"
				+ "	</div><!--close slider_wrapper-->"
				+ "</div><!--close banner_image-->	"
				+ "<div class='sidebar_container'>"
				+ "	<div class='sidebar'>"
				+ "		<div class='sidebar_item'>"
				+ "			<h2>Dallas Communities</h2>"
				+ "			<p>Welcome to our new website. Get connected to your community in our Country! Have a look around!</p>"
				+ "		</div><!--close sidebar_item-->"
				+ "	</div><!--close sidebar-->"
				+ "<div class='sidebar'>"
				+ "	<div class='sidebar_item'>"
				+ "		<h2>Latest Update</h2>"
				+ "		<p></p>"
				+ "	</div><!--close sidebar_item--> "
				+ "</div><!--close sidebar-->"
				+ "<div class='sidebar'>"
				+ "	<div class='sidebar_item'>"
				+ "		<p></p>"
				+ "	</div><!--close sidebar_item--> "
				+ "</div><!--close sidebar-->  		"
				+ "</div><!--close sidebar_container-->"
				+ "<div id='content'>"
				/*+ "	<div class='content_item'>"
				+ "		<h1>Welcome!</h1> "
				+ "		<p>An easy way to stay near your cultures by staying far away from the country.Get connected to your communitiy people. Be up to date with your communities events.Book tickets, host events, Enjoy!!</p>	 "
				+ "		<div class='content_container'>"
				+ "			<p>GUJRATI SAMAAJ</p>"
				+ "			<div class='button_small'>"
				+ "				<a href='#'>Read more</a>"
				+ "			</div><!--close button_small-->"
				+ "		</div><!--close content_container-->"
				+ "	</div><!--close content_container-->"*/
				/*+ "	<div class='content_containe'>"
				+str
				//+ "		<h1>" + str + "</h1>"
				+ "	</div><!--close content_container-->"
				+ "</div><!--close content_item-->"
				+ "</div><!--close content--> "
				+ "</div><!--close site_content-->"
				+ "</div><!--close main-->"
				+ "</body>");
				*/
	}

}
