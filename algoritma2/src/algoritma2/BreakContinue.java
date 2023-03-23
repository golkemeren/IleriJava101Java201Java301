package algoritma2;

import java.util.Iterator;

public class BreakContinue {

	public static void main(String[] args) {
		int i ;
		
		//-----------------------------
		System.out.println("1. dongu :");
		for(i=1; i<=20;i++){ 
			if(i==11)
				break;
			System.out.print(i + ",");
		}
		//----------------------------------
		System.out.print("\n\n2.dongu : ");
    for (i=1; i<=20;i++) {
    	if(i%4==0) 
    		continue;
    	System.out.print(i +" ,");
    	
    	// break if == 11 olduğunda tamamlandı
    	// continue i ^nin 4 e tam bolunduğu durumları ele aldık 
    }
	}

}
