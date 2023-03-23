package ornek1.singleInteraction;

import java.io.*;
import java.net.*;
import java.util.Date;


public class Server {
private static final int PORT=5001;  // Client'daki aynı port'u kullanıcaz 
	public static void main(String[] args) throws IOException {
    
ServerSocket sunucu = new ServerSocket(PORT); // Böylelikler server'ımız bu port üzerinden hizmet vermeye başlıyor .
	
    System.out.println("[SUNUCU] Bir istemcinin baglanmasi bekleniyor...");
    Socket client = sunucu.accept(); // client'ı yakaladık sunucuya kabul ettik 
    System.out.println("[SERVER] Bir istemci bağlandi !!");
    while(true) {
    	 PrintWriter output = new PrintWriter(client.getOutputStream(),true); // client'in output stream'ine bu yazdırma işlemini gerçekleştiriyoruz
         output.println((new Date()).toString()); // Tarih bilgisinin String' e çevrilmiş halini output'a yazdırıyoruz.
         
         client = sunucu.accept();
    
    }
    
    
   
     
    // System.out.println("[SUNUCU] Tarih bilgisi gonderildi.Baglanti kapatiliyor...");
   //sunucu.close();
   //client.close();
   
   
	}

}
