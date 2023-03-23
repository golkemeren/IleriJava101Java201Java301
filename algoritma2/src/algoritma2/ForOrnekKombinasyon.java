package algoritma2;

import java.util.Scanner;

public class ForOrnekKombinasyon {

	public static void main(String[] args) {
	
		Scanner oku = new Scanner(System.in);
		int i,n,r,nf,rf,nrf,c;
		nf=1;  rf=1;  nrf=1;
		System.out.println("N : ");
		 n= oku.nextInt();
		 System.out.println("R: ");
		 r= oku.nextInt();
		 for (i=1; i<=n; i++)  nf=nf*i;
		 for (i=1; i<=r;i++)   rf=rf*i;
		 for (i=1; i<=n-r;i++) nrf=nrf*i;
		  c=nf/(rf*nrf);
		  System.out.println("C( " + n + ";" +r+ ")=" +c);
		 
		 
		

	}

}
