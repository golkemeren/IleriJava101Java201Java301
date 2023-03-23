package bean.pojo;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet (urlPatterns = {"/ogrenciEkle"})
public class OgrenciEkle extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		RequestDispatcher dispatcher = req.getRequestDispatcher("jspUseBean/OgrenciEkle.jsp");
		dispatcher.forward(req, resp);
		// şuan get motdu doğrudan OgrenciEkle.jsp i çağırıyor.

	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
		Ogrenci ogrenci = new DershaneOgrenci() {
			{
			   setNo(req.getParameter("no"));
			   setAd(req.getParameter("ad"));
			   setSoyad(req.getParameter("soyad"));
			   setSinif(Integer.parseInt(req.getParameter("sinif")));
			   setSube(req.getParameter("sube").charAt(0));
			}
		};
		req.setAttribute("eklenenOgrenci", ogrenci);  // öğrenci eklendikten sonra tekrardan öğrenci ekle sınıfına gitmesini sağladık .
		RequestDispatcher dispatcher = req.getRequestDispatcher("jspUseBean/OgrenciEkle.jsp");
		dispatcher.forward(req, resp);
		
	}
}
