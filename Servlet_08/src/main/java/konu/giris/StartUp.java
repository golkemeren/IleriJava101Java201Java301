package konu.giris;
// 1. Servlet kaynak kodunu oluştur. // bu şuanki StartUp sınıfı 
// 2. web.xml içerisine  servlet'imizi mapliyoruz.Hangi path'e bağlı olarak çalışan bir dosya bunun bilgisini veriyoruz.
// 3. Apache Tomcat sunucusunu başlatıyoruz.
// 4. Web tarayıcısını açıp servlet'imize istekte bulunucaz.yani request atıcaz .
// backend tarafında bir web sayfası talep ediyoruz o sayfa düzenlendikten sonra da sunucu aracılığıyla o sayfa bize gelecek ve biz onu tarayıcıda göstericez .
// yani servlet'imize istekte bulunucaz servlet sunucu aracılığıyla bize isteğimizi iletcek .

import java.io.*;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StartUp extends HttpServlet {
	// şuan amacımız biz tarayıcı server'imize talepte bulunduğu zaman bir tane cevap döndürmek olucak 
	// doGet metodunu Override edicez .
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	     resp.setCharacterEncoding("UTF-8"); // Türkçe karakteri desteklesin dedik
	     resp.setHeader("content-type", "text/html;charset=UTF-8"); // içeriğimizin bilgisini biz charset olarak verdik ve içeriğimizin bilgisinin html olduğunu charset özelliğine sahip olduğunu söyledik .
		PrintWriter printWriter = resp.getWriter();
		String mesaj = "Merhabalar , Hoş geldiniz !!";
		printWriter.write(mesaj);
		// servlet'i tanıtmamız için xml dosyasında bazı düzenlemlere gitmemiz gerek .
		
		
		
		
		
		// request aslında bu sunuya atılan isteklerin bilgisimi taşıyan bir obje
		// response bizim sunucunun cleint'a yollayacağı cevabın içeriğini taşıyan bir objedir. 
	}
	
	

}
