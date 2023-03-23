package ders5Generic_Type_Class_Ornekler;

 class Insan <T,U> {
	private String isim;
	private T boy ;
	private T kilo;
public Insan(String isim, T boy, T kilo) {
		this.isim = isim;
		this.boy = boy;
		this.kilo = kilo;
	}
 
 public void bilgiVer() {
	 System.out.println("Deger : " + isim + " Tip :" + isim.getClass().getName());
	 System.out.println("Deger : " + boy + "Tip : " + boy.getClass().getName());
	 System.out.println("Deger : " + kilo + "Tip : " + kilo.getClass().getName());
	} }
 
 
  class Ogrenci<T,U,V> {
	  private T okulNo;
	  private U isim;
	  private V girisYili;
	public Ogrenci(T okulNo, U isim, V girisYili) {
		super();
		this.okulNo = okulNo;
		this.isim = isim;
		this.girisYili = girisYili;
	}
	public void bilgiVer() {
		 System.out.println("Deger : " + okulNo + " Tip :" + okulNo.getClass().getName());
		 System.out.println("Deger : " + isim + "Tip : " + isim.getClass().getName());
		 System.out.println("Deger : " + girisYili + "Tip : " + girisYili.getClass().getName());
		} }
  
 
 
 
public class StartUp {
public static void main(String[] args) {
Insan i1 = new Insan("Ahmet ", 178.0f, 85.6);
Insan i2 = new Insan ("Aysecik " , 164, 59);
i1.bilgiVer();
i2.bilgiVer();


Ogrenci o1 = new Ogrenci(" 26516511 "," Ahmet Masa ", " 2017 ");
Ogrenci o2 = new Ogrenci <Long,String,Integer> (32265311L," Fatih Karaman " , 2020);

o1.bilgiVer();
o2.bilgiVer();
}
}
