package ornek3.multiClient;

import java.io.*;
import java.net.*;


public class Cleint {

	private static final String SERVER_IP = "127.0.0.1";
	
	private static final int SERVER_PORT = 5003;
public static void main(String[] args) throws UnknownHostException, IOException {
	Socket socket = new Socket(SERVER_IP,SERVER_PORT);
	
	ServerConnection sunucuBaglantisi= new ServerConnection(socket); 
	
	BufferedReader klavye = new BufferedReader(new InputStreamReader(System.in));
    // istemcinin mesajı iletmesini sağlayacak obje 
	PrintWriter output = new PrintWriter(socket.getOutputStream(),true);
	
	new Thread(sunucuBaglantisi).start(); // sunucu baglantisini baslattik
	
	while(true) {
		System.out.println("[CLIENT] --> ");
		String komut = klavye.readLine();
		output.println(komut);
		if (komut.equals("Bitti")) {
			break;
		}
	}
	socket.close();
	System.exit(0);

}
}
