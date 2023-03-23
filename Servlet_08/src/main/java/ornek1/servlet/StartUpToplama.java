package ornek1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet (urlPatterns = {"/toplama","/addition"})
public class StartUpToplama extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		res.setCharacterEncoding("UTF-8");
		res.setHeader("content-type","text/html;charset=UTF-8");
	    res.sendRedirect("./index.html");
	}
	@Override 
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setCharacterEncoding("UTF-8");
		res.setHeader("content-type", "text/html;charset=UTF-8 ");
		PrintWriter output = res.getWriter();
		
		int sayi1 = Integer.parseInt(req.getParameter("sayi1"));
		int sayi2 = Integer.parseInt(req.getParameter("sayi2"));
		int topla = sayi1+sayi2;
		
		output.println(	"<p>Sonuc: "+(sayi1+sayi2) + "</p>");
		
	}
}
