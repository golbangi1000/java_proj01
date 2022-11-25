package chapter11.ex01;



class Aaa{
	int m;
	final int n;
	
	Aaa(){
		n = 10;
	}
	
	Aaa(int n ){
		this.n = n;
	}
	
	void run() {
		System.out.println("Aaa 클래스의 run() 입니다");
	}
	
}

final class Bbb extends Aaa{  //상속이 불가능한 클래스 
	
	
	
	
	
	
	Bbb(int n) {
		
		super(n);
		// TODO Auto-generated constructor stub
	}

}
//class Ccc extends Bbb{  Bbb는 final 클래스라 상속 못함
//	
//}





public class Final_Class {
	public static void main(String[] args) {

		
		
		
		
		
		
	}
}
