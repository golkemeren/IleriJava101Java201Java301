package ornek2.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.text.AbstractDocument.Content;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet (urlPatterns = {"/login","/girisYap"})
public class Login extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
	 res.setCharacterEncoding("UTF-8");
	 res.setContentType("text/html;charset=UTF-8");
	 
	 res.sendRedirect("login.html");
	 
	}
	public void doPost (HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");
	
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		PrintWriter output = res.getWriter();
		// username=admin
		// Şifre = admin123
		
		
		if(username.equals("admin") && password.equals("admin123")) {
			
        output.println("<h1> GİRİŞ BAŞARILI </h1>");
		}
		else if (username.equals("admin")){
			output.println("<h1> ŞİFREYİ YANLIŞ GİRDİNİZ !! </h1>");
		}else {
			output.println("<h1> KULLANICI ADINI YANLIŞ GİRDİNİZ </h1>");
		}
		
	}

}
