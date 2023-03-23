package bean.pojo;

import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.jakartaee.commons.lang3.ArrayUtils;

public class DershaneOgrenci  extends Ogrenci{
	
	private List<String> dersler ; 
	
	public DershaneOgrenci () {
		
		this.dersler= new ArrayList<>();
				
	}

	public DershaneOgrenci(String no, String ad, String soyad, int sinif, char sube, List<String> dersler) {
		super(no, ad, soyad, sinif, sube);
		
		if(dersler == null) {
			this.dersler=new ArrayList<>();
		}else {
			this.dersler = dersler;
		}
		
		
	}

}
