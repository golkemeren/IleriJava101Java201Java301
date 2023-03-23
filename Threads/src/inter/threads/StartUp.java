package inter.threads;

public class StartUp {

	public static void main(String[] args) {
		Kaynak kaynak = new Kaynak();
		new Producer(kaynak);
		new Consumer(kaynak);

	}

}
