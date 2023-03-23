package hafizaYonetimi_stack_VS_hesap;

import java.util.Stack;

//Stack - Yigin  

  class Meyve {
	
   private String isim;

public Meyve(String isim) {
	super();
	this.isim = isim;}
public String getIsim() {
	return isim;}
public void setIsim(String isim) {
	this.isim = isim;
}
@Override
	public void finalize() throws Throwable {  // Obje silindikten sonra devreye giren metodumuz.
		
	System.out.println( isim +  " Isimli meyve objesi RAM 'den silindi");} }

public class StartUp {

	public static void main(String[] args) {
	
		Stack<Integer> yigin = new Stack<>();
			yigin.add(10);
			yigin.add(20);
			yigin.add(30);
			
			System.out.println(yigin.peek()); 
			yigin.pop(); // en stackte en üstteki değeri silcek en üstte 30 vardı 30 silinir ekrana 20 gelir 
  		    System.out.println(yigin.peek());
            yigin.pop();
            System.out.println(yigin.peek());
            yigin.pop();
           // System.out.println(yigin.peek());
            
            // unreferenced object 
            Meyve m1 = new Meyve("Elma");
            System.out.println(m1.getIsim());
            //1. Bir objenin adresinin null yapılması 
            //durumunda unreferenced object meydana gelir.             m1 = null ;
             try {
				System.out.println(m1.getIsim());
			} catch (NullPointerException n) {
				
				System.out.println(n.getMessage());
			}
             
             //2. m2 me objesine eşitlendiğinde 
             // m2 objesinin önceki referans gösterdiği alanınadresi gösterilmiyor
             //Önceki m2 yerinin adresi bilinmez hale gelir.
            Meyve m2 = new Meyve("Armut");  // unreferenced object
            Meyve m3 = new Meyve("Kiraz");
            m2 = m3;
            
            System.out.println(m2.getIsim());
            System.out.println(m3.getIsim());         
            // 3.Anonim obje oluşturursak adresi bilinmez .
            // Oluşturulan objenin heap'teki adresi elimizde yok .
            
            // unreferenced object
            System.out.println(new Meyve("Karpuz").getIsim());
            // Gereksiz yer kaplayan alanlar ortadan kaldırılmalı !
            
            Meyve m4 = new Meyve("Kavun");
            m3=m4;  // artık kiraz bölgeside silinmiş oldu .
            m2=m4;
            // m1 null 
            // m2 m3 m4 kavun bölgesinin adresini tutuyor .
            m4=null;
            m3=null;
            m2=null;
            System.gc(); // adresi bilinmeyenleri ortadan kaldırır .
            
         	}
            }
