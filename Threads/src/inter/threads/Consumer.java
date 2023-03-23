package inter.threads;

public class Consumer implements Runnable {

	private Kaynak kaynak;
	
	public Consumer (Kaynak kaynak) {
		this.kaynak=kaynak;
		Thread gorev2 = new Thread(this,"Consumer"); 
		gorev2.start();
	}
	
	@Override
	public void run() {
		int i =0;
		while(true) {
	   System.out.println(kaynak.getTuketimNo()+  "  Deger Tuketildi !!");		
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	
		
	}

}
