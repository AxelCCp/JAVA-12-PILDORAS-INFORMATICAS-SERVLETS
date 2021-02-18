package servletPruebas;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class A2_248_ControladorServlet
 */
@WebServlet("/A2_248_ControladorServlet")
public class A2_248_ControladorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A2_248_ControladorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//CREAR ALMACEN DONDE GUARDAR LA INFORMACIÓN PROPORCIONADA POR LA BBDD
		//imaginemos que la bbdd nos devuelve los tipos de contenidos descritos en el array
		String[]productos = {"Destornillador","Serrucho", "Tornillo", "Taladro"};
		
		//ADJUNTAMOS LA INFORMACIÓN OBTENIDA DE LA BBDD, AL OBJ REQUEST
		//CREAMOS EL atributo REQUEST
		request.setAttribute("lista_productos", productos);
		
		//CREAMOS EL OBJ DE TIPO REQUESDISPATCHER PARA COMUNICAR CON EL ARCHIVO JSP
		RequestDispatcher miDispatcher = request.getRequestDispatcher("/A1_248_VistaJSP.jsp");
		
		//ENVIAMOS LA INFORMACIÓN AL ARCHIVO VistaJSP.jsp
		miDispatcher.forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
