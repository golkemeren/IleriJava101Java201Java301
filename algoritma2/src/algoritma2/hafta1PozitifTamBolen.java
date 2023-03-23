package algoritma2;

import java.util.Scanner;

public class hafta1PozitifTamBolen {

	public static void main(String[] args) {
		Scanner oku = new Scanner(System.in);
		int n,i,sayac=0;
		System.out.println("Lutfen bir sayi giriniz");
		n= oku.nextInt();
		for (i= 1;  i<=n; i++) {
			if(n%i==0) {       //ctrl+shift+c ile seçtiğimiz satırları yorum satırı haline getirebiliirz
			sayac++;
				System.out.println(sayac + ".tam Bolen = " +i);
			}  		
		}
		
	
		
		}
	}
