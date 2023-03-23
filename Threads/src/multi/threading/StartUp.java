package multi.threading;

public class StartUp {

	public static void main(String[] args) throws InterruptedException {
   Yazici yazici = new Yazici();
   //yazici.dokumanlariYazdir(10, "Vize1_Sinavi.pdf");
   //yazici.dokumanlariYazdir(10, "Vize2_Sinavi.pdf");
   //yazici.dokumanlariYazdir(10, "Final_Sinavi.pdf");

   Runnable r1 = new Gorev(yazici, 5, "Vize1_Sinavi");
   Runnable r2 = new Gorev(yazici, 5,"Vize2_Sinavi");
   Runnable r3 = new Gorev(yazici, 5, "Final_Sinavi");
   Thread gorev1 = new Thread(r1);
   Thread gorev2 = new Thread(r2);
   Thread gorev3 = new Thread(r3);
   gorev1.start();
   
   gorev1.join();  // yani gorev1 Thread'i ölene kadar bekle sonra diğer görevlere geç 
   
   gorev2.start();
   gorev2.join(); // gorev2 Thread'i ölene kadar bekle 
   
   gorev3.start();
   
	}

}
