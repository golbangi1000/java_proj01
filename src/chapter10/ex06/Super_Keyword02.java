package chapter10.ex06;

class Aa{
	void abc() {
		System.out.println(" Aa 클래스의 abc()");
	}
	
	void ab() {
		System.out.println("Aa 클래스의 ab()");
	}
}


class Bb extends Aa{
	
	@Override
	void abc() {
		System.out.println("B클래스의 abc()");
	}
	void bcd() {
		abc(); //this.abc()
	}
	
	
	void cde() {
		super.abc();
	}
	
	void def() {
		super.ab();
	}
	
	
	
	
	
	
}


public class Super_Keyword02 {
	public static void main(String[] args) {
		
		
		Bb bb = new Bb();
		
		
		bb.bcd();
		bb.cde();
		bb.def();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
