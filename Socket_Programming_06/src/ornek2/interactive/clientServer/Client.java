package ornek2.interactive.clientServer;

import java.io.*;
import java.net.*;


public class Client {
  private static final String SERVER_IP = "127.0.0.1";
  private static final int SERVER_PORT =5001;
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket socket = new Socket(SERVER_IP,SERVER_PORT);
		// Burda socket üzerinden veri geliyor 
      BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	  // Burda terminal üzerinden veri geliyor .Kullanıcıdan klavyeden veri alacağız.
      BufferedReader klavye = new BufferedReader(new InputStreamReader(System.in));
	
      PrintWriter output = new PrintWriter(socket.getOutputStream(),true); // soketten çıkan veriyi yazdır
	
      while(true) {
    	  System.out.println("CLIENT --->");
    	  String komut = klavye.readLine(); // burda veri alacağız.
    	 
    	  output.println(komut); // sunucu Tarafına komutumuzu ilettik 
    	  String sunucuCevap = input.readLine();
    	  System.out.println("[SUNUCU] -- > " + sunucuCevap);
    	  
    	  if(komut.equals("Bitti")) {  // klavyeden girilen komut Bitti şeklindeyse break yani işlemi bitir.
    		  break;
    	  }
      }
      //Çıkış Yaptık 
      socket.close();
      System.exit(0);
      
      
	}

}
