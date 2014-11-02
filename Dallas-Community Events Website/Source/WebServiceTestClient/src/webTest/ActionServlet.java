package webTest;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ActionServlet
 */
@WebServlet("/ActionServlet")
public class ActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hi");
		String country=request.getParameter("countryname");
		//String country="India";
		//System.out.println("Hi2");
		
		  /*Map<String, String> ind = new LinkedHashMap<String, String>();
		     ind.put("1", "New delhi");
		     ind.put("2", "Tamil Nadu");
		     ind.put("3", "Kerala");
		     ind.put("4", "Andhra Pradesh");
		     //System.out.println("Hi3");
		     Map<String, String> us = new LinkedHashMap<String, String>();
		     us.put("1", "Washington");
		     us.put("2", "California");
		     us.put("3", "Florida");
		     us.put("4", "New York");
		     String json = null ;
		     //System.out.println("Hi4");
		     if(country.equals("India")){
		      json= new Gson().toJson(ind);
		      //System.out.println("Hi4.1");
		     }
		     else if(country.equals("US")){
		      json=new Gson().toJson(us);
		      //System.out.println("Hi4.2");
		     }*/
			 String json = null ;
		     Map<String, String> cntry = new LinkedHashMap<String, String>();
		     CallServiceProxy c = new CallServiceProxy();
		     String[] str = c.ajaxCall(country);
		     
		     for(int i = 1; i < str.length;i++){
		    	cntry.put("" + i,str[i-1]);
		     }
		     json=new Gson().toJson(cntry);
		     response.setContentType("application/json");
		    // System.out.println("Hi4.3");
		     response.setCharacterEncoding("UTF-8");
		     //System.out.println("Hi5");
		     response.getWriter().write(json); 
		     //System.out.println("Hi6");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
