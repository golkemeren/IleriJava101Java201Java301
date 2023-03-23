package dao.dataAccesObject;

import java.sql.*;

public class OgrenciDAO {

	// Veri tabanı işlemleri yapacağımız için bir connection bağlantı gerçekleştiricez .
	
	private Connection conn = null;
	
	public OgrenciDAO() {
		veriTabaninaBaglan();
	}
	@Override
	protected void finalize() throws Throwable {
	System.out.println("Veri tabani baglantisi kapatildi ");
		conn.close();  // işimiz bittiğinde uygulama kapansın çöpe gitsin 
	}
	private void veriTabaninaBaglan() {
		String url = "jdbc:mysql://localhost:3306/okul";
		String username = "root";
		String password = "Ge34521905";
		
		try {
			 conn =DriverManager.getConnection(url, username, password);
			 System.out.println("BAGLANTI BASARILI");
		} catch (SQLException e) {
		e.printStackTrace();
		System.out.println("!!HATAA!!");
		}
		
	   }
	public void veriTabaniBaglantisiniSonlandir() throws SQLException {
		conn.close();
	}

	// READ - Veri tabanından öğrenciyi okumamaızı sağlayan metodu yazıcaz
	   public Ogrenci getOgrenci(String ogrenciNo)throws SQLException{
		  // veriTabaninaBaglan();
		   
		   Ogrenci o = new Ogrenci();
		   
		   
		    String query = "select * from ogrenciler where ogrenciNo = " + ogrenciNo;
		    Statement st = conn.createStatement();
		    ResultSet rs = st.executeQuery(query);
		    
		    if (rs.next()) {
		    	o.setID(rs.getInt("ID"));
		    	o.setNo(ogrenciNo);
		        o.setKullaniciAdi(rs.getString("username"));
		        o.setAd(rs.getString("adi"));
		        o.setSoyad(rs.getString("soyadi"));
		    }
		    else {
		    	o=null; //yani yoksa objemizi çöpe attık 
		    	
		    }
		    return o;
	   
		
	}
		
	// CREATE Veri tabanına ogrenci ekleme
	   public void ogrenciEkle(Ogrenci o) throws SQLException {
    //	veriTabaninaBaglan(); // once veritabanına baglanıyoruz
    	
    	String query = "INSERT INTO ogrenciler (ogrenciNo,userName,adi,soyadi)VALUES(?,?,?,?)";
    	PreparedStatement st = conn.prepareStatement(query);
    	
    	st.setString(1, o.getNo());
    	st.setString(2, o.getKullaniciAdi());
    	st.setString(3, o.getAd());
    	st.setString(4, o.getSoyad());
    
    	int count = st.executeUpdate(); // veri tabanına eklemiş olduk .
    	System.out.println("Ogrenci basariyla eklendi !");
    	
    	
      }
     
	
	// DELETE ogrenciyi silme işlemi 
	   public void ogrenciSil(Ogrenci o) throws SQLException {
		//   veriTabaninaBaglan();
		   String query = "delete from ogrenciler where ogrenciNo = " +o.getNo();
		   Statement st = conn.createStatement();
		   int count = st.executeUpdate(query);
		   
		   if (count == 1) {
			   System.out.println("Ogrenci basariyla silindi!!.");
		   }else {
			   System.out.println("Ogrenci bulunamadi !! ");
		   }
		 
		   
		   
	   }

	   
	 // UPDATE - Ogrenci guncelleme 
	   public void ogrenciGuncelle(Ogrenci o,String ogrenciNo) throws SQLException {
		 //  veriTabaninaBaglan();
		   //ogrenciNo
		   //username
		   //adi
		   //soyadi
		   
		   String query = "update ogrenciler set ogrenciNo='" + o.getNo()+
				   "', username= '" + o.getKullaniciAdi() + "', adi='"+ o.getAd()+
				   "', soyadi= '" +o.getSoyad() + "'where ogrenciNo= '" + ogrenciNo + "'";
		   System.out.println(" SORGU TEST: " +query);
		   Statement st = conn.createStatement();
		    int count = st.executeUpdate(query);
		    
		    if (count ==1) { // satır sayısı 1 ise 
		    	System.out.println("Ogreni basariyla guncellendi!!");
				
			} else {
                System.out.println("Ogrenci bulunamadıgı icin guncelleme yapilamadi !!");
			}
		    
		   
	   }
}
