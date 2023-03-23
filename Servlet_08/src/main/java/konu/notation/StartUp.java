package konu.notation;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet(urlPatterns = { "/anasayfa" }) // aslında biz bu sınıfın briden fazla url'de hizmet vermesini
											// sağlayabiliyoruz.Dizi olduğu için süslü parantez
// anasayfa pattern'imiz olsun dedik artık bu sınıf anasayfa url'ine hizmet edicek .
public class StartUp extends HttpServlet {
	// post metodu bişeylerin gönderilmesini kayıt edilmesini sağlıyor .
	// put işlemi güncelleme için kullanılıyor.
	// delete işlemi silme için kullanılan istek requsttir.

	@Override // protected diyerek http servlet içerisindeki miras alınan sınıfı override
				// ediyoruz.

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException { // request gönderdiğimiz
																								// isteğimiz , response
																								// sunucunun cevabı
		// görüyoruz ki biz doğdurdna java'nın içerisinde sunucuya yazdırma işlemini
		// yaptırabiliyoruz.
		PrintWriter writer = resp.getWriter(); // cevaba yazacağımız objeyi bize geri döndür .
		resp.setCharacterEncoding("UTF-8"); // türkçe karakteri desteklesin dedik .
		resp.setHeader("content-type", "text/html;charset=UTF-8"); // yazı tipini ve html olduğunu belirttik
		writer.write("<h1> HOŞGELDİNİZ</h1>");

		ArrayList<String> takimlar = new ArrayList<>() {
			{
				add("Galatasaray");
				add("Fenerbahçe");
				add("Beşiktaş");
				add("Trabzon");
				add("BursaSpor");
			}
		};
          
		ArrayList<String> renkler = new ArrayList<>() {
			{
				add("red");
				add("blue");
				add("black");
				add ("purple");
				add("green");
			}
			
		};
		
		writer.write("<table>");
		writer.write("<tr>");
		writer.write("<th>");
		writer.write("Takımlar");
		writer.write("</th>");
		writer.write("</tr>");
  
		 String[] stilRenkleri = new String [renkler.size()];
		 stilRenkleri = renkler.toArray(stilRenkleri);
		 int index =0;
		
		for (String takim: takimlar) {
			writer.write("<tr>");
			writer.write("<td style= 'color:"+stilRenkleri[index++]+";'>");
			writer.write(takim);
			writer.write("</td>");
			writer.write("</tr>");

		}
// html kodlarını reponsa ekleyerek bu şekilde tarayıcıda yazdırıyoruz.
		writer.write("</table>");

	}
}
