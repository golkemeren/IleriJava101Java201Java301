package algoritma2;

import java.util.Scanner;

public class ForOrnek14Kombinasyon3 {

	public static void main(String[] args) {
		Scanner oku = new Scanner(System.in);
		int i,n,r,c=1;
		System.out.println("N : ");
		n= oku.nextInt();
		System.out.println("R :");
		r = oku.nextInt();
		for (i=1;i<=n-r;i++) {
			
			System.out.println("i= "+i);
			System.out.println("c=" +c+"*("+r+"+"+i+")/"+i);
			
			c=c *(r+i)/i;
			
            System.out.println("c="+c);
            System.out.println("----------------------");
		}
		
		System.out.println("C(" +n+ ";"+ r+")="+c);
	}

}
