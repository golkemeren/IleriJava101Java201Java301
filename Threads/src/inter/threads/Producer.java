package inter.threads;

public class Producer implements Runnable {

	private Kaynak kaynak ;
	
	public Producer (Kaynak kaynak) {
		this.kaynak=kaynak;
		Thread gorev = new Thread(this,"Producer");
		gorev.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			kaynak.setTuketimNo(i++);
		
		
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
