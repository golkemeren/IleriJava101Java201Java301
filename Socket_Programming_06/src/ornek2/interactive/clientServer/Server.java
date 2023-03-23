package ornek2.interactive.clientServer;

import java.io.*;
import java.net.*;

public class Server {
  private static String [] isimler = {"Fatih" , "Aysel","Mehet","Melek"};
  private static String [] meslekler = {"Bilg.Muh" , "Doktor", "Ogretmen","Asci"};
	private static final int PORT = 5001;

	 
  public static void main(String[] args) throws IOException {
	// Math.random => [0,1) sıfır dahil 1 hariç demek 
	  // [0-0.25)*4 = [0,1) =>0
	  // [0.25,0.5)*4=>[1,2)=>1
      // [0.5,0.75)*4=>[2,3)=>2
	  // [0.75,1]*4=>[3,4)=3
	  
	  ServerSocket sunucu  = new ServerSocket(PORT);
	  System.out.println("[SERVER] --> Bir istemcinin baglanmasi bekleniyor...");
	 
	  
	  Socket client = sunucu.accept();
	  System.out.println("[SERVER] --> Bir istemci baglandi !");
      
	  PrintWriter output = new PrintWriter(client.getOutputStream(),true);
	  // okuma işlemini streadmReader^dan alıcaz cleint'ı okuyucaz, input gelmiş olucak  
	  BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
	  
	  while(true) {
		  String clientRequest  = input.readLine();
		  if(clientRequest.contains("bir kisi soyle")) { // client bir kisi söylediği zaman sunucuda ona cevap vericek
			  output.println(rastgeleKisiSec());
		  }
		  else if (clientRequest.equals("Bitti")) { // output karşı tarafa iletiliyor yani client'a
			  output.println("Hoscakal,yine bekleriz...");// sunucunun kendisine iletiliyor
		  System.out.println("SUNUCU KAPATILDI");
		  break;
		  }
		  // kullanıcı bize bir kişi söylemezse ya da bitti demezse vereceğimiz mesaj
		  
		  else {
			  output.println("Rastgele bir kisi bilgisi almak icin \"bir kisi soyle \"yazizniz"); // client'a iletilicek
		  } 
	  }
	  output.close();
	  input.close();
  }
	  public static String rastgeleKisiSec() {
		  int no =(int)(Math.random()*isimler.length);
		  return isimler[no] + " " + meslekler[no];

	  
	}

}
