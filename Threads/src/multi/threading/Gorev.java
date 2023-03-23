package multi.threading;

public class Gorev implements Runnable {  // bu sınıf bizim thread'imiz.
  Yazici yaziciRef;
  String dokumanIsmi;
  int kopyaSayisi;
  public Gorev (Yazici yaziciRef ,int kopyaSayisi, String dokumanIsmi) {
	  this.yaziciRef=yaziciRef;
	  this.kopyaSayisi=kopyaSayisi;
	  this.dokumanIsmi=dokumanIsmi;
  }
	
	
	@Override
	public void run() {
		synchronized (yaziciRef) {// synchronized dediğimiz zaman işlemleri sırası ile bitirerek senkronize bir şekilde çalışır.
			yaziciRef.dokumanlariYazdir(kopyaSayisi,dokumanIsmi);
			// biz burda yazıcıyı senkronize etmek istiyoruz. o sebeple  parantez içerisine yaziciRef verdik 
		}
		
	}

}
