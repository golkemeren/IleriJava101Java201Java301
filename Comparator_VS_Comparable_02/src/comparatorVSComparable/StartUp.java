package comparatorVSComparable;
import java.util.*;


public class StartUp {
	public static void main(String[] args) {
		ArrayList<Telefon> telefonlar = new ArrayList<>() {
			{
				add(new Telefon("Iphone" , "13" , 16,256,2021));
			    add(new Telefon ("Samsung" , "NOTE 5" , 4,32,2013 ));
			    add(new Telefon("Xiaomi" , "Redmi Note 11",4,128,2022));
			    add(new Telefon ("Huawei" , "Nova Y90",6,128,2020));   
			}	
			};
			/*for (Telefon telefon : telefonlar ) {
				System.out.println(telefon);
			}*/
			
			Telefon.butunTelefonlariYazdir(telefonlar);
			System.out.println("--------------------------");
			Collections.sort(telefonlar);  // Collections.sort  telefonları yıla göre sıraladık
			Telefon.butunTelefonlariYazdir(telefonlar);
			System.out.println("--------------------------");
			Collections.reverse(telefonlar);  // Varsayılan sıralamayı tersine çevirir.
			Telefon.butunTelefonlariYazdir(telefonlar);
			
			System.out.println("--------------------------");
				System.out.println("Hafizaya gore kucukten buyuge siralanisi:");	
			
			Comparator <Telefon> dahaKucukHafiza = new Comparator<Telefon>() {

				@Override
				public int compare(Telefon o1, Telefon o2) {  //Kendi Compare'mızı oluşturuyoruz.
	              if ( o1.getHafiza()> o2.getHafiza())  {
	            	  return 1;
	              }else {
	            	  return -1;
	              }
				}
			};
				
			Collections.sort(telefonlar,dahaKucukHafiza);
		     Telefon.butunTelefonlariYazdir(telefonlar);
				
			
	
			System.out.println("--------------------------");
			
			 System.out.println("Hafiza buyukten kucuge siralanisi");
			 
			 Collections.reverse (telefonlar);
			 Telefon.butunTelefonlariYazdir(telefonlar);
			 
			 
		    System.out.println("--------------------------");
		    System.out.println("RAM' e gore kucukten buyuge siralanisi:");
		    Collections.sort(telefonlar, (tel1,tel2)-> { if (((Telefon)tel1).getRam() > tel2.getRam()) {return 1; } else return  -1;});
			Telefon.butunTelefonlariYazdir(telefonlar);
		    
		    System.out.println("--------------------------");
		    System.out.println("RAM' e gore buyukten kucuge siralanisi:");
		    Collections.reverse(telefonlar);
            Telefon.butunTelefonlariYazdir(telefonlar);
	 }
	
}
