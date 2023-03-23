package algoritma2;

import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {
		Scanner oku = new Scanner(System.in);
    int i,n,t=0;
    System.out.println("Bir sayi giriniz: ");
    n=oku.nextInt();
    System.out.print("Tam bolenler : ");
    for(i=1;i<=n-1;i++) {
    if(n%i==0) {
    	t=t+i;
    System.out.print(i + "+"); }
    	
    }
    System.out.println("toplam =" + t);
    if(t==n)  System.out.println(n + " mukemmel bir sayidir.");
    else   System.out.println( n + " mukemmel bir sayi degildir");
         
	}

}
