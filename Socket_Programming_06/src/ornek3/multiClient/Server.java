package ornek3.multiClient;

import java.io.IOException;
import java.net.*;
import java.util.ArrayList;
import java.util.concurrent.*;


public class Server {

	private static String[] isimler = {"Fatih","Aysel","Mehmet","Melek"};
	private static String [] meslekler= {"Bil.Muh","Doktor","Ogretmen","Asci"};
	
	private static final int PORT = 5003;
	 private static ArrayList<ClientHandler>clients = new ArrayList<>();
	//Thread'lerimizi yönetebilmek için bir havuz oluşturucaz 
	 private static ExecutorService pool = Executors.newFixedThreadPool(3); // üç tane servise cleintâ aynı anda hizmet vericez 
	 public static ArrayList<ClientHandler> getClients(){
		 return clients;
	 }
	 
	 
	 
	
	 public static void main(String[] args) throws IOException {
	  ServerSocket sunucu = new ServerSocket(PORT);
	  
	  while(true) {
	System.out.println("[SERVER]--> Bir istemcinin baglanmasi bekleniyor..");
       Socket client = sunucu.accept(); // amacımız birden fazla client'ı dinlemek olduğu için sonsuz bir döngü içine alıcaz 
	   System.out.println("[SERVER] --> Bir istemci baglandi ..");
	 //istemci threadi
	   
	   ClientHandler clientThread = new ClientHandler(client, clients);
	 
	   // clients içerisine client thread'i ekler
	   clients.add(clientThread);
	   // istemciiyi pool'da aktif edeceğiz.
	  pool.execute(clientThread);
	  
	  }
	  }
	 public static String rastgeleKisiSec() {
		 int no = (int) (Math.random()*isimler.length);
		 return isimler [no] + " " + meslekler[0];
	 }

}
