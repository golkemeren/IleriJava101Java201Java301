package inter.threads;

public class Kaynak {
	private int tuketimNo;
	private boolean uretimMi = true;

	// Consumer
	public synchronized int getTuketimNo() {
		while(uretimMi) {
			try {
				// Consumer' i bekletecek
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		uretimMi = true;
		
		notify();  // Consumer  uyandırılıyor.Thread objelerinin uyandırılmasını sağlar.
		// Consumer Uynadıırılıyor..
		// uyandırma bildirme işlemi
		// notify boject bir metottur Thread metot değildir.
		return tuketimNo;
	}
      // Producer
	public synchronized void setTuketimNo(int tuketimNo) {
		
		while(!uretimMi) {
			try {
				
				// Producer'i bekletecek 
					wait();// Producer üretim yapmadan Consumer tüketmeyecek o yüzden bekle dedik wait()
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
		}
		System.out.println(tuketimNo + " degeri uretildi !!");
		
		this.tuketimNo = tuketimNo;
		uretimMi = false;
		// Producer Uynadıırılıyor..
		// uyandırma bildirme işlemi
		// notify boject bir metottur Thread metot değildir. 
		notify(); 
	}

}
