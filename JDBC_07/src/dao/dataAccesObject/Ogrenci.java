package dao.dataAccesObject;

public class Ogrenci {
	private String no;
	private String kullaniciAdi;
	private String ad;
	private String soyad; // amacımız veti tabanındaki veiryi alıp bu öğrenciyle eşleştirmek
// öğrenci modelimiz hazır artık dataaccesObjeckt sınıfını yağpabilriz bu veri tabanındaki verilere erişip işlem yapmamızı sağayacak
	private int ID;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public void bilgiVer() { // ID hariç bütün bilgileri veren bir metot olsun

		String bilgi = "Ogrenci No:" + no + ", Ad Soyad:" + ad + soyad + ", Kullanıcı adı: " + kullaniciAdi;
		System.out.println(bilgi);
	}

}
