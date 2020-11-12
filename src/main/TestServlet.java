package main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TestServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//
//		StringBuilder responseBuilder = new StringBuilder();
//		response.getWriter().append("<p>");
//		for (int i = 0; i < 30000000; i++) {
//			int l = i%200;
//			responseBuilder.append((char) l);
//			if (l == 0) {
//				responseBuilder.append("</p> <p>");
//			}
//			
//		}
//		
//		response.getWriter().append(responseBuilder.toString());
		
		response.sendRedirect("first_page.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doPost called");
		doGet(request, response);
	}	
	

}
