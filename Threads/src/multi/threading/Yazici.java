package multi.threading;

public class Yazici {

	 void dokumanlariYazdir(int kopyaSayisi, String dokumanIsmi) {
		for (int i = 1; i <=kopyaSayisi; i++) {
			// synchronized dediğimiz zaman işlemleri sırası ile bitirerek senkronize bir şekilde çalışır.
	
		 
			System.out.println(dokumanIsmi + " isimli dosyanin " + i + ". kopyasi yazdirildi.");
			
		}
	}
}
