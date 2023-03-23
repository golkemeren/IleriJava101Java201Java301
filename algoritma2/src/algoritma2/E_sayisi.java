package algoritma2;

import java.util.Scanner;

public class E_sayisi {
	public static void main(String[] args) {
		 Scanner oku = new Scanner(System.in);
		 
		 int i,f=1,us=1,x,n; // döngüsel çarpım işleminde kullanıcalakların ilk değerini 1 e eşitliyoruz.
		 double t = 1;
		 System.out.println("X:");
		 x=oku.nextInt();
		 System.out.println("N : ");
		 n= oku.nextInt();
		 
		 for(i=1;i<=n;i++) {
			 us=us*x;
			 f=f*i;
			 t= t+ (double)us/f;
			 
		 }
		 System.out.println("e^" + x + "=" +t);
		// System.out.printf("%.2f" ,t); // virgülden sonra 2 hane 
	     System.out.println((double) Math.round(t*100)/100);
	}

}
