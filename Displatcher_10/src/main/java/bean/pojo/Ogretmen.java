package bean.pojo;

public class Ogretmen {
private int no;
private String ad ;
private String soyad;
private String brans;

public Ogretmen() {
	
}

public Ogretmen(int no, String ad, String soyad, String brans) {

	this.no = no;
	this.ad = ad;
	this.soyad = soyad;
	this.brans = brans;
}

public int getNo() {
	return no;
}

public void setNo(int no) {
	this.no = no;
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

public String getBrans() {
	return brans;
}

public void setBrans(String brans) {
	this.brans = brans;
}

}
