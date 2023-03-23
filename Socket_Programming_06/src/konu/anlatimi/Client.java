 package konu.anlatimi;

import java.io.*; // input ve putputStreamlerin her ikiside inport edilsin dedik

import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
// Socket, input, output
	// öncelikle bir socket oluşturucaz
	
	private Socket socket = null;
	private DataInputStream input = null;
	private DataOutputStream output = null;
	// IP adresi ve bağlanacağımız port numarasına ihtiyacımız var 
	
	@SuppressWarnings("deprecation")
	public Client (String address, int port ) throws UnknownHostException, IOException {
	// bağlantı kurmak 
		socket= new Socket(address,port);
		System.out.println("-Client- Sunucuya Baglandi !!");
	    input = new DataInputStream(System.in); // terminal üzerinden veri aktarımını girdi olarak alacağız
	    output = new DataOutputStream(socket.getOutputStream()); // soketten gelen veriyi çıktı olarak alıcaz
	     
	    // İstemci ile iletişim
	    String metin = "";
	    while(!metin.equals("Bitti")) {
	    	try {
	    		metin=input.readLine();
		    	output.writeUTF(metin); // metni UTF formatında çıktısını al dedik .
	    		// sokete yazdırıyoruz
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
	        }
		// Bağlantıyı kapatma
	    input.close();
	    output.close();
	    socket.close();
	    
	    
	}
	
	public static void main(String[] args) throws UnknownHostException, IOException {
	  
		Client client = new Client("127.0.0.1",5000);  // internet ip adresi sık kullanılan 127.0.0.1 ve port 5000

	}

}
