package ders4Generic_Type_Constructor;

class Araba <T> {
	private T marka;
	private T model;
	private T yil;
	
	public Araba(T marka , T model , T yil) {
		System.out.println(Helper.getType(marka));
		System.out.println(Helper.getType (model));
		System.out.println(Helper.getType(yil));
		this.marka=marka;
		this.model=model;
		this.yil=yil;
	}
public  void bilgiVer() {
	String bilgi = " Marka :" + marka + " Model : " + model + " Yil :" + yil;

 System.out.println(bilgi);
}
@Override
public String toString() {

	return " Marka : " + marka + " Model : " + model + " Yil : " + yil;
}}

class Helper {
	public static  void bilgiVer(String bilgi) {
		System.out.println(bilgi);}
		public static <T> String getType(T degisken) {
			
			String [] kelimeler =degisken.getClass().getName().split("\\.");
			String sinifIsmi= kelimeler[kelimeler.length-1];
			return sinifIsmi;
		}
	}
public class StartUp {
	public static void main(String[] args) {
		Araba a1 = new Araba ("TOYOTA","CORONA",2020);
		Araba a2 = new Araba ("Peugeot", 208, 2020);
	    Araba a3 = new Araba <String> ( "Mercedes" , "C20" , "2021" );
	    
		a1.bilgiVer();
		a2.bilgiVer();
		a3.bilgiVer();
		System.out.println(a1);
	    System.out.println(a2);
	    System.out.println(a3);
	
	}
}
