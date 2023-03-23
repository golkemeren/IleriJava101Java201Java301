package threads;


class UstGorev {
	
}


class Gorev extends UstGorev implements Runnable {
	@Override
	public void run() {
		
		Thread.currentThread().setName("-Gorev Sinifi Thread -");  // yeni thread ismimiz.
		for (int i=1; i<=20; i++) {
			System.out.println("- " +Thread.currentThread().getName() +  "Numara:" +i );
		}
		System.out.println("Mevcut thread bilgisi: " + Thread.currentThread().getName());
		
		System.out.println(Thread.currentThread().getName()+ "isimli" + "threading calisma anindaki aktif thread sayisi :" + Thread.activeCount());
	
	}  
	// main thread' den sonra threadler thread-0 thread-1 diye isimlendiriliyor.
}



class DigerGorev extends UstGorev implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName()+ "isimli" + "threading calisma anindaki aktif thread sayisi :" + Thread.activeCount());
	
		for (int i = 1; i <=30; i++) {
			System.out.println("- " +Thread.currentThread().getName() +  "Numara:" +i );
			
		}
		
	}
	
} 

public class StartUp {

	// main metot main thread'i temsil eder.
	
	public static void main(String[] args) {

		System.out.println("Aktif thread sayisi : " + Thread.activeCount());  // bize aktif çalılan thread sayısını döndürür
		// int sayi = 5/0;
		 //System.out.println(sayi);
		
		
		// JOB 1 
		System.out.println("PROGRAM BASLADI !");
		Thread.currentThread().setName("-main Thread -");
		System.out.println("main thread priority :" + Thread.currentThread().getPriority());
        for (int i = 1; i <= 100; i++) {
			System.out.println("-" + Thread.currentThread().getName() + " -"+"Numara:" + i);
		}
		
		 //JOB 2 
		/*Gorev gorev = new Gorev();
		gorev.start();*/ // otomatikmen run metodunu çalıştırır.
		
		Runnable g1 = new Gorev();
		Thread gorev1 = new Thread (g1, "-Gorev Sinifi Thread 1 -");
		gorev1.setPriority(1);  // görevin önceliğini belirler.
		gorev1.start();
		
		System.out.println("Aktif thread sayisi :" + Thread.activeCount());
		System.out.println("Mevcut thread bilgisi" + Thread.currentThread().getName());
		
		
		
		//JOB 3 
		Runnable g2 = new DigerGorev();
		Thread gorev2 = new Thread(g2,"-Diger Gorev Thread 1 -");
		gorev2.setPriority(10); // threadlerin görev öncelik sıralarını belirlememizi sağlar . yüksek değerli olan görev önce yapılır .
		gorev2.start();
		
		
		
		//JOB 4 
        new Thread(new DigerGorev(), "Diger Gorev Thread 2 -").start();	
		System.out.println("PROGRAM BITTI ! ");	
		System.out.println("Main - Aktif thread sayisi : " + Thread.activeCount());
		
		if(gorev1.isAlive()) {  // metodun yaşayıp yaşamadığını kontrol eder .
			System.out.println(gorev1.getName() + "YASIYOR !!");
			
		}else {
			System.out.println(gorev1.getName() + "OLDU !! ");
		}
		if(gorev2.isAlive()) {
			System.out.println(gorev2.getName() +"YASIYOR !!");
			
		}else {
			System.out.println(gorev2.getName()+"OLDU !! ");
		
		
		}
		
		
		System.out.println("Mevcut thread bilgisi: " + Thread.currentThread().getName());
		
		
	}

}
