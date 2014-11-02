package webTest;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class registerNewMember
 */
@WebServlet("/registerNewMember")
public class registerNewMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerNewMember() {
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
		PrintWriter out = response.getWriter();
		String str = 
		"<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">"
		+"<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\">"

		+"<head>"
		  +"<title>ARaynorDesign Template</title>"
		 +" <meta name=\"description\" content=\"free website template\" />"
		 +"<meta name=\"keywords\" content=\"enter your keywords here\" />"
		 +" <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />"
		 +" <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />"
		 +"<script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>"
		 +" <script type=\"text/javascript\" src=\"js/jquery.easing.min.js\"></script>"
		 +"<script type=\"text/javascript\" src=\"js/jquery.nivo.slider.pack.js\"></script>"
		 +" <script type=\"text/javascript\">"
		   +"$(window).load(function() {"
		      +"  $('#slider').nivoSlider();"
		   +"});"
		  +"</script>" 
		+"</head>"

		+"<body>"
		  +"<div id=\"main\">"
			
			+"<div id=\"menubar\">"
			 +" <div id=\"welcome\">"
			    +"<h1><a href=\"#\">Dallas Community Events</a></h1>"
			  +"</div><!--close welcome-->"
		      +"<div id=\"menu_items\">"
			    +"<ul id=\"menu\">"
		           +"<li><a href=\"index.html\">Home</a></li>"
		          +"<li><a href=\"ShoppingPayment.html\">Online shop</a></li>"
		          + "<li><a href='index.html'>Log Out</a></li>"
		        +"</ul>"
		      +"</div><!--close menu-->"
		    +"</div><!--close menubar-->"	
		    
			+"<div id=\"site_content\">"	

			 +" <div id=\"banner_image\">"
			   +"<div id=\"slider-wrapper\">"        
		          +"<div id=\"slider\" class=\"nivoSlider\">"
		            +"<img src=\"images/home_6.jpg\" alt=\"\" />"
		            +"<img src=\"images/home_2.jpg\" alt=\"\" />"
				  +"</div><!--close slider-->"
				+"</div><!--close slider_wrapper-->"
			  +"</div><!--close banner_image-->"	

			  +"<div class=\"sidebar_container\">"       
				+"<div class=\"sidebar\">"
		          +"<div class=\"sidebar_item\">"
		            +"<h2>Dallas Communities</h2>"
		            +"<p>Welcome to our new website. Get connected to your community in our Country! Have a look around!</p>"
		          +"</div><!--close sidebar_item-->" 
		        +"</div><!--close sidebar-->"     		
				+"<div class=\"sidebar\">"
		          +"<div class=\"sidebar_item\">"
		             +"<h2>Latest Update</h2>"
		            
		            +"<p></p>"          
				  +"</div><!--close sidebar_item-->" 
		        +"</div><!--close sidebar-->"
				+"<div class=\"sidebar\">"
		          +"<div class=\"sidebar_item\">"
		                    
				  +"</div><!--close sidebar_item-->" 
		        +"</div><!--close sidebar-->"  		
		      +"</div><!--close sidebar_container-->"		    
		        
			  +"<div id=\"content\">"
		        +"<div class=\"content_item\">"
		          +"<h2>New member Registration</h2>"
					+"<p>Get yourself registered and have fun!</p>"
					 +"<h2>Enter your details : </h2>"
				  +"<p id=\"p1\">";
					String name = request.getParameter("name");
					String address = request.getParameter("address");
					String contact = request.getParameter("contact");
					String email = request.getParameter("email");
					String uname = request.getParameter("username");
					String password = request.getParameter("password");
					SendRequestProxy pr = new SendRequestProxy();
					String str2 = pr.acceptRequest(name,address,contact,email,uname,password);
					
					
					
					/*"<form action=\"registerNewMember\" method=\"post\">"
							+"Name: <input type="text" name="name"  required  pattern="[A-Za-z-0-9]+\s[A-Za-z-'0-9]+"><br><br>
							Address: <input type="text" name="address" ><br><br>
							Contact Number: <input type="number" name="contact"><br><br>
							Email Id: <input type="email" id="email" name="email" value="" required aria-required="true">
							Username: <input type="text" name="username"><br><br>
							Password: <input type="password" name="password"><br><br>
							<input type="submit">
					</form>*/
					
				String str1 =   "</p>"
				+"</div><!--close content_item-->"
		      +"</div><!--close content-->"   
			  
			 +"<div id=\"content_blue\">"
			    +"<div class=\"content_blue_container_box\">"
				  +"<h4>Latest Blog Post</h4>"
			      +"<p>Some articles from the top leaders of these communities! Get to know about their experience with their communities</p>"
				  +"<div class=\"readmore\">"
				    +"<a href=\"#\">Read more</a>"
				  +"</div><!--close readmore-->"
			    +"</div><!--close content_blue_container_box-->"
		        +"<div class=\"content_blue_container_box\">"
		         +"<h4>Latest News</h4>"
			      +"<p>Scheduled events, parties and a lot more! Subscribe for a newsletter and dont miss a single thing! </p>"
			      +"<div class=\"readmore\">"
				    +"<a href=\"#\">Read more</a>"
				  +"</div><!--close readmore-->"
			    +"</div><!--close content_blue_container_box-->"
		        +"<div class=\"content_blue_container_boxl\">"
				  +"<h4>Offers and Coupons</h4>"
			      +"<p>Get discounts on your community events and online shop. Be a member and enjoy the offers </p>"
			      +"<div class=\"readmore\">"
				    +"<a href=\"#\">Read more</a>"
				  +"</div><!--close readmore-->"	  
			   +"<!-- </div><!--close content_blue_container_box1-->"      
			    +"<br style=\"clear:both\"/>"
		      +"</div><!--close content_blue-->" 		
			+"</div><!--close site_content-->" 
		 
		  +"</div><!--close main-->"
		  
		  +"<div id=\"footer\">"
			  +"<a href=\"http://validator.w3.org/check?uri=referer\">Valid XHTML</a> | <a href=\"http://fotogrph.com/\">Images</a> | <a href=\"http://www.heartinternet.co.uk/web-hosting/\">Web Hosting</a> | website template by <a href=\"http://www.araynordesign.co.uk\">ARaynorDesign</a>"
		  +"</div><!--close footer-->"  
		  
		  +"</body>"
		+"</html>";
		out.print(str+str2+str1);
	}

}
