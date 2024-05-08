import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readonly")
public class Readonly extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		String time = request.getParameter("time");
		String user_id = request.getParameter("user_id");
		
		request.setAttribute("time", time);
		request.setAttribute("user_id", user_id);
				
		RequestDispatcher dispatch = request.getRequestDispatcher("/readonly.jsp");
			dispatch.forward(request, response);
	}

}
