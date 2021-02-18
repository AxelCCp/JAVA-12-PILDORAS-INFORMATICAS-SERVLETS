package servletPruebas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class A1_247_RegistroUsuarios
 */
@WebServlet("/A1_247_RegistroUsuarios")
public class A1_247_RegistroUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A1_247_RegistroUsuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//CREAMOS OBJ PRINTWRITER
		PrintWriter salida = response.getWriter();
		
		salida.println("<html><body>");
		//PONEMOS "NOMBRE" PARA RESCATAR LA INFO DEL CAMPO "NOMBRE" EN EL HTML A0_247
		salida.println("Nombre introducido " + request.getParameter("nombre"));
		
		salida.println("<br><br>");
		
		salida.println("Apellido introducido " + request.getParameter("apellido"));
		
		salida.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		//INDICAMOS QUE EL CONTENIDO DE LA RESPUESTA ES HTML
		response.setContentType("text/html");
		
		//salida.println("<html><body>");
		//salida.println("Nombre introducido " + request.getParameter("nombre"));
		//salida.println("<br><br>");
		//salida.println("Apellido introducido " + request.getParameter("apellido"));
		//salida.println("</body></html>")
	}

}
