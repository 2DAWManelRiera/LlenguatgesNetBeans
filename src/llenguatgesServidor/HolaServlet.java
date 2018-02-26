/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llenguatgesServidor;

/**
 *
 * @author manelriera
 */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HolaServlet extends HttpServlet {
	@Override
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// Set the response message's MIME type
		response.setContentType("text/html;charset=UTF-8");
		// Allocate a output writer to write the response missage into the network socket
		PrintWriter out = response.getWriter();
		
		// Write the response message, in an HTM page
		try {
			out.println("<!DOCTYPE html");
			out.println("<html><head>");
			out.println("<neta http-equiv='Content-Type' content='text/html; charset=UTF-8' />");
			out.println("<title>Hola!</title></head>");
			out.println("<body>");
			out.println("<h3>Hola, NetBeans!</h3>"); // Escriu "Hola, Ramis!"
			out.println("</body>");
			out.println("</html>");
		} finally {
			out.close(); // Always close the output writer
		}
	}
}

