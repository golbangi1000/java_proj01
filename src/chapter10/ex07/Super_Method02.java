package chapter10.ex07;

class Aa{
	Aa(){
		System.out.println("Aa클래스의 생성자");
	}
	
}

class Bb extends Aa{
	Bb(){
		//super(); 생략돼있음 
		System.out.println("Bb의 생성자 ");
	}
}


class Cc extends Bb{
	Cc(){
		//super(); 생략돼있음
		System.out.println("Cc의 생성자");
	}
}


public class Super_Method02 {
	public static void main(String[] args) {
		
	}
}