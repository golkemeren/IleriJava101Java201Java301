package ornek1.singleInteraction;
import javax.swing.JOptionPane;
import java.io.*;
import java.net.*; // bu şekilde bütün network package'ını dahil etmiş olduk
public class Client {
	 // oluştuurlan Client'ların server IP'sini doğrudan burda final anahtar kelimesini kullanarak consulant yapıcaz. 
    private static final String SERVER_IP = "127.0.0.1"; // sabitledik
    private static final int SERVER_PORT = 5001; // port'u sabitledik
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		 Socket socket = new Socket(SERVER_IP,SERVER_PORT); // socket'i açtık 
		 // Okuma işlemi için 
		 BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));  // InputReader' da io paketinin içinde 
		 
         String sunucuCevap = input.readLine();
         
         JOptionPane.showMessageDialog(null, sunucuCevap);// burda null diyerek herhangi bir objeye bağlı olmadığını gsöteriyoruz // sunucu cevap bizim serverden gelen tarih ve saat olmuş olucak 
	    socket.close(); // socketi kapattık
	    System.exit(0); // sistemden çıktık 
	}

}
