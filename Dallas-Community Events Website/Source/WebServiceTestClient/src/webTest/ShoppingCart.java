package webTest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShoppingCart
 */
@WebServlet("/ShoppingCart")
public class ShoppingCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingCart() {
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
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String address1 = request.getParameter("addressline1");
		String address2 = request.getParameter("addressline2");
		String country = request.getParameter("country");
		String state = request.getParameter("state");
		String city = request.getParameter("city");
		String cardType = request.getParameter("type");
		String cardNo = request.getParameter("cardno");
		String securityNo = request.getParameter("securityno");
		String expiryMonth = request.getParameter("expirymonth");
		String expiryYear = request.getParameter("expiryyear");
		CallServiceProxy c = new CallServiceProxy();
		String id1 = "1";//request.getParameter("id1");
		String id2 = "2";//request.getParameter("id2");
		String id3 = "3";//request.getParameter("id3");
		String q1 = request.getParameter("quantity1");
		String q2 = request.getParameter("quantity2");
		String q3 = request.getParameter("quantity3");
		String total = request.getParameter("total");
		String subTot1 = request.getParameter("sub1");
		String subTot2 = request.getParameter("sub2");
		String subTot3 = request.getParameter("sub3");
		
		/*Enumeration paramaterNames = request.getParameterNames();  
		while(paramaterNames.hasMoreElements() ) {  
		       System.out.println(paramaterNames.nextElement());  
		} 
		System.out.println("sub1 :"+subTot1);
		System.out.println("sub2 :"+subTot2);
		System.out.println("sub3 :"+subTot3);
		//System.out.println(id1+" "+ q1+" "+ Float.parseFloat(subTot1)+" "+ id2+" "+ q2+" "+ Float.parseFloat(subTot2)+" "+ id3+" "+ q3+" "+ Float.parseFloat(subTot3)+" "+ Float.parseFloat(total)+" "+ firstName+" "+ lastName+" "+ country+" "+ state+" "+ city+" "+ address1+" "+ address2+" "+ cardType+" "+ cardNo +" "+securityNo+" "+ expiryMonth+" "+ expiryYear);
		System.out.println(q1);
		System.out.println(subTot1);
		System.out.println(id2);
		System.out.println(q2);
		System.out.println(subTot2);
		System.out.println(id3);
		System.out.println(q3);
		System.out.println(subTot3);
		System.out.println(total);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(address1);
		System.out.println(address2);
		System.out.println(country);
		System.out.println(state);
		System.out.println(city);
		System.out.println(cardType);
		System.out.println(cardNo);
		System.out.println(securityNo);
		System.out.println(expiryMonth);
		System.out.println(expiryYear);*/
		
		String result = c.addCartDetails(id1, Integer.parseInt(q1), Float.parseFloat(subTot1), id2, Integer.parseInt(q2), Float.parseFloat(subTot2), id3, Integer.parseInt(q3), Float.parseFloat(subTot3), Float.parseFloat(total), firstName, lastName, country, state, city, address1, address2, cardType, cardNo, Integer.parseInt(securityNo), Integer.parseInt(expiryMonth), Integer.parseInt(expiryYear));
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		/*out.println("<head>"
				+ "<title> Payment Successful </title>"
				+ "</head>"
				+ "<body>"
				+ "<h1> Payment recieved. Your Transaction Number is : "+result +".</h1>"
				+ "</body>"
				);*/
		String str="<h1> Payment recieved. Your Transaction Number is : "+result +".</h1>";
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
				//+ "<div id='content'>"
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
				+ "	<div class='content_container'>"
				+ "		<h1>" + str + "</h1>"
				+ "	</div><!--close content_container-->"
				+ "<div id='content_blue'>"
				+ "	<div class='content_blue_container_box'>"
				+ "		<h4>Latest Blog Post</h4>"
				+ "		<p>Some articles from the top leaders of these communities! Get to know about their experience with their communities</p>"
				+ "		<div class='readmore'>"
				+ "			<a href='#'>Read more</a>"
				+ "		</div><!--close readmore-->"
				+ "	</div><!--close content_blue_container_box-->"
				+ "	<div class='content_blue_container_box'>"
				+ "	<h4>Latest News</h4>"
				+ "		<p>Scheduled events, parties and a lot more! Subscribe for a newsletter and dont miss a single thing! </p>"
				+ "		<div class='readmore'>"
				+ "			<a href='#'>Read more</a>"
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
				+ "</div><!--close site_content--> "
				+ "</div><!--close main-->"
				
				//+ "</div><!--close content_item-->"
				//+ "</div><!--close content--> "
				//+ "</div><!--close site_content-->"
				//+ "</div><!--close main-->"
//+ "<h1>" + str + "</h1>"
				+ "</body>"
				
				);
		
		//response.getWriter().write(result);
		
	}

}
