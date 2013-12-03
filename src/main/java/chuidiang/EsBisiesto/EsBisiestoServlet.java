package chuidiang.EsBisiesto;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	@SuppressWarnings("serial")
	public class EsBisiestoServlet extends HttpServlet {
		
		@Override
		protected void service(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
		
		response.setContentType("text/html");
		java.io.PrintWriter out = response.getWriter();
		String fechaIngresada= request.getParameter("fecha");
		out.println("<center><h1>"+fechaIngresada+"</h1></center>");
		}
	}
