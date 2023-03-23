package bean.servlet;

import java.io.IOException;

import bean.pojo.DershaneOgrenci;
import bean.pojo.Ogrenci;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet (urlPatterns = {"/ogrenciler"})
public class StartUp extends HttpServlet {
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	// String bilgi = "ogrenciler servletinden geldim";
     //req.setAttribute("info", bilgi );
     
	 Ogrenci ogrenci = new DershaneOgrenci("1748","Gölkem","EREN",12,'A',null);
	 req.setAttribute("ogrenci", ogrenci);
	 
	 RequestDispatcher dispatcher = req.getRequestDispatcher("jspUseBean/ogrenciler.jsp");
    dispatcher.forward(req, resp);

 }
	
}
