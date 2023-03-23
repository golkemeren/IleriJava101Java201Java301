package ders3_Generic_Type_Method;


import java.util.*;


  class Hayvan {
	private String isim;
	public Hayvan (String isim) {
	  setIsim(isim);
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim=isim;
	} 
@Override 
public String toString() {
return isim;   // yani bir hayvan oluşturulduğunda o hayvanın ismini söylesin.
}

 class Kedi extends Hayvan {

	public Kedi(String isim) {
		super(isim);	
	}
	@Override
	public String toString() {
		return super.toString() + " :Miyav..";
	}
}
 class Kopek extends Hayvan {

	public Kopek(String isim) {
		super(isim);
	}
	@Override
	public String toString() {

		return super.toString()+ ": Hav hav .. ";
	}
}

// Yardımcı sınıfımız 
  class Helper {
	public static String oldGetType(Object o) {
		return o.getClass().getName();
	}
	// Generic metot olduğunu burdan anlayabiliriz.
	public static <T> String getType(T degisken) {
		// split kullanırken "nokta işareti" özel bir karakterdir bizde noktaya göre kelimeleri sınfılandırdık
		// yani nokta gördükçe kelimleridizilerde tuttuk 
		// java.lang.String demek java lang ve String isimli 3 kelimeye sahip  olduğumuz anlamına geldi 
		// dizideki 0 . index java olur bu halde 
		
		String [] kelimeler =degisken.getClass().getName().split("\\.");
		String sinifIsmi= kelimeler[kelimeler.length-1];
		return sinifIsmi;
	}
	
	// bu metot sayesinde istediğimiz tipteki elemanları istediğimiz aynı listeye tipi farketmeksizin ekleyebilicez
	public static <T> void butunDegerleriEkle(List<T> liste , T[] array) {
		for (T eleman:array) { 
			liste.add(eleman);
		}
	}
		
		public static <T> void listeyiBas1 (List <T> liste) {
			for ( T eleman : liste) {
				System.out.print(eleman + " ");
			}
		System.out.println();
		// Liste int veya string farketmiyor her türlü listeyi ekrana basmamızı sağlayacak bir metot oluşturduk.
		} 
		
		public static void listeyiBas2 (List<?> liste) {
			for(Object eleman : liste ) {
				System.out.println(eleman + " ");
			}
			System.out.println();
		}
		 // bu metoto bizm sadece Hayvan sınıfından gelen parametreleri almamızı sağlar.
		public static void listeyiBas3 (List< ? extends Hayvan> liste) {
			for (Object hayvan: liste) {
				System.out.println(hayvan);
			}
		}
		} 

public static  class StartUp {

	public static void main(String[] args) {
		
	int sayi = 5;
	String isim = "Fatih Kaan";
	System.out.println(Helper.oldGetType(sayi));
	System.out.println(Helper.oldGetType(isim));
	
	
	System.out.println(Helper.getType(sayi));
	System.out.println(Helper.getType(isim));
	
	Integer [] sayilar1 = {5,4,8,9,45,55,95,-5,0};
	 List<Integer> sayilar2 = new ArrayList<>();
	 
	 List< String>isimler1 = new ArrayList<>(){
		 { add("Fatih");
		 add("Görkem");
		 add("Akif");
		 }
	};
	 
	Helper.butunDegerleriEkle(sayilar2, sayilar1);  
	 // sayilar1 değerini sayilar2 değerine ekle dedik .
  
/*	
	for (int i = 0; i < sayilar2.size(); i++) {
	 System.out.print(sayilar2.get(i) + " ");
}
	System.out.println();
	for (Integer s :sayilar2) {
		System.out.print(s+ " ");
	} */
	
	Helper.listeyiBas1(sayilar2);
	Helper.listeyiBas1(isimler1);
	
	Helper.listeyiBas2(sayilar2);
	Helper.listeyiBas2(isimler1);
	
   
	ArrayList<Kedi> kediler = new ArrayList<>() {{
		
			add(new Kedi("Boncuk"));
		    add(new Kedi("Tekir"));
		    add(new Kedi("Mirit"));
	};
	ArrayList<Kopek> kopekler = new ArrayList<>() {
		
		{
		
			add(new Kopek("Josi"));
			add(new Kopek("Mero"));
		}
	};
	System.out.println("----------------------");
	System.out.println(kediler.get(0));
	System.out.println(kediler.get(1));
	System.out.println(kediler.get(2));
	System.out.println(kopekler.get(0));
	System.out.println(kopekler.get(1));
	System.out.println("----------------------");
	Helper.listeyiBas3(kediler);
    Helper.listeyiBas3(kopekler);
    System.out.println("-------------------");
	
	}
	}




