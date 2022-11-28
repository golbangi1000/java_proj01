package chapter12.ex03;


interface Animal1{
	void cry();
	
}
interface Animal2{
	void run();
	
}

interface Animal3{
	void eat();
}

class Aa{
	void abc() {
		System.out.println("Aa의 abd()");
	}
}

class Bb {
	void bcd() {
		System.out.println("Bb의 bcd()");
	}
}
//하나의 부모만 되고 여러개의 인터페이스
// 순서가 바뀌면 안됨 
class Cc extends Aa implements Animal1,Animal2,Animal3{
	@Override
	public void cry() {
		
	}
	@Override
	public void eat() {
		
	}
	@Override
	public void run() {
		
	}
	
}

//interface extends interface
// 앞의 타입과 뒤의 타입이 동일할때는 extends 
interface K extends Animal1, Animal2,Animal3{
	
}

class G implements K {
	@Override
	public void cry() {
		
	}
	@Override
	public void eat() {
		
	}
	@Override
	public void run() {
		
	}
}

public class Interface_Test2 {
	public static void main(String[] args) {
		
	}
}
