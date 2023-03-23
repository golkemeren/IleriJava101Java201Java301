

package konu.anlatimi;

import java.net.*;
import java.io.*;

public class Server {
   // Soket bağlantısı kurma 
	private Socket socket =null;
	private ServerSocket server = null;
	private DataInputStream input = null;
	
	public Server (int port ) throws IOException {
		server = new ServerSocket(port);
		System.out.println("Sunucu baslatildi ...");
		System.out.println("Bir client (istemci) bekleniyor ..");
	    socket= server.accept(); // şuan sadece bir tane istemci kabul ediliyor o yüzden tane client çalıştırılamaz
	    System.out.println("Client (istemci) kabul edildi ...");
	    // İstemcinin soketinden girdi alınıyor ...
	    input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
	    
	    String metin = "";
	    //while(!metin.equals("Bitti")) {
	    while(true) {
	    metin = input.readUTF();
	    System.out.println(metin);  // konsola yazdırıyoruz
	    }
	
	//}
	   // System.out.println("Baglanti sonlandiriliyor ..");
	   // input.close();
	   //socket.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		Server server = new Server(5000);
	
	}

}
