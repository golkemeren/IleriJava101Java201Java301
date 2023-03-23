package ders6Generic_Type_Ozet;

class Elma <T,U,V,Y,Z> {
	
	public static <T,U,V > void bilgiVer(T a, U b , V c ) {
		// static metotlar sınıf metotları olduğu için genel metot tanımlamları  statik metoda etki etmez 
		// sınıfın parametreleri ile metotların parametreleri farklıdır.
		System.out.println(a.getClass().getName());
        System.out.println(b.getClass().getName());
        System.out.println(c.getClass().getName());
	 }
}
public class StartUp {
	public static void main(String[] args) {
   (new Elma<String,String,Integer,Float,Long>()).bilgiVer(1, 1.1, 1.1f);
	
	
	}

}
