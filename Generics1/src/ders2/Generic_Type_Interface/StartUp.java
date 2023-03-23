package ders2.Generic_Type_Interface;


interface Donusum <T1,T2> {
	T1 cevir(T2  x);
	T2 tersCevir(T1 x);
}

class Helper implements Donusum <String,Integer>{

	@Override
	public String cevir(Integer x) {
	
		return x.toString(); // integer'i Stringe çevirir.
	}

	@Override
	public Integer tersCevir(String x) {
	
		return Integer.parseInt(x); // String ifadeyi ınteger iafedeye çevirir
	}
	
}

public class StartUp {
	public static void main(String[] args) {
	Helper h1 = new Helper();
	String string1 = "546";
	int sayi1=478;
	
	System.out.println(h1.cevir(sayi1));
	System.out.println(h1.tersCevir(string1));
	

	}

}
