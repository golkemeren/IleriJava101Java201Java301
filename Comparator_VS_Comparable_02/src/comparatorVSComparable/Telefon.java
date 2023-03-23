package comparatorVSComparable;

import java.util.List;

public class Telefon implements Comparable <Telefon> {
 // değerlerin birbiri arasında karşılaştırılabilir olmasını istiyorum bunun için comparable sınıfını implements etmeliyiz.
	// Gneric type olduğu için comparable hangi objelerin karşılaştırılıcağının bilgisinini vermemiz gerekiyor.
	private String marka;
	private String model;
	private int ram ;
	private int hafiza;
	private int cikisYili;
	
	public Telefon(String marka, String model, int ram, int hafiza, int cikisYili) {
		this.marka = marka;
		this.model = model;
		this.ram = ram;
		this.hafiza = hafiza;
		this.cikisYili = cikisYili;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getHafiza() {
		return hafiza;
	}
	public void setHafiza(int hafiza) {
		this.hafiza = hafiza;
	}
	public int getCikisYili() {
		return cikisYili;
	}
	public void setCikisYili(int cikisYili) {
		this.cikisYili = cikisYili;
	}
	@Override
	public String toString() {
		String bilgi = "Telefon [marka=" + marka + ", model=" + model + ", ram=" + ram + ", hafiza=" + hafiza + ", cikisYili="
				+ cikisYili + "]";
		return bilgi;
	}
	
	@Override
	public int compareTo(Telefon o) {   // yıllar arasında objelerin karşılaştırılabilmesini sağlayacak .
		if (cikisYili>o.cikisYili) {
			return 1; 
		}else {
			return -1;
		}
	}
		
		public static void butunTelefonlariYazdir(List<Telefon> telefonlar) {
			
			for(Telefon telefon : telefonlar) {
				System.out.println(telefon);
		
		}
		
	
	}
}
