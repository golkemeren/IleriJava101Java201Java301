

class JenerikSinif {
	 private Object x;
	 
	 public void setX( Object x) {
		 this.x=x;
		 
	 }
	 public Object getX() {
		 return x ;
	 }
     @Override
      public String toString () {
    	 return "Bu Jenerik sinif objesidir." ;
     }  
     public void xDegeriniSoyle() {
    	 System.out.println("X değeri :" +x);
 
     }
     public void xSinifiniSoyle() {
    	 System.out.println(x.getClass().getName());
    	 
     }
     
}
public class StartUp {
	public static void main(String[] args) {
	JenerikSinif g1 = new JenerikSinif();
	JenerikSinif g2 = new JenerikSinif();
	System.out.println(g1.toString());
	g1.setX(150);
	System.out.println(g1.getX() );
	
	g1.xDegeriniSoyle();
    g1.xSinifiniSoyle();
	}

}
