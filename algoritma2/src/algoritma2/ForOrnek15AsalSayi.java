package algoritma2;

import java.util.Scanner;

public class ForOrnek15AsalSayi {

	public static void main(String[] args) {
     Scanner oku = new Scanner(System.in);
     
     int n,i,sayac=0;
     
     System.out.print("Bir sayi giriniz :");
    
     n=oku.nextInt();
     System.out.print(" ");
     
     for(i=1; i<=n-1;i++) 
    	 if(n%i==0)
    		 sayac++;
    	 
    	 if(sayac==1)
    		 System.out.println( n +"Bir Asal Sayidir.");
    	 else {
    		 System.out.println(n + "Bir asal sayi degildir");
    	 }
     }
     

	}


