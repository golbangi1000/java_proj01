package chapter10.ex05;

class Aaa{
	static void print() {
		System.out.println("Aaa메소드");
	}
}

class Bbb extends Aaa{
	static void print() {
		System.out.println("Bbb메소드");
	}
}








public class Override_Static_Method {
	public static void main(String[] args) {
	
		
		Aaa.print();
		Bbb.print();
		System.out.println("===================");
		
		
		
		Aaa a = new Aaa();
		Bbb b = new Bbb();
		Aaa ab = new Bbb();
		
		a.print();
		b.print();
		ab.print();
	}
}














