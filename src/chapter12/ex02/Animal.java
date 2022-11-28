package chapter12.ex02;


public interface Animal {
	
	void cry();
	void run();
	
	
	//void eat() {}; //인터페이스 내부에 구현부가 있는 메소드를 넣으면 오류 발생 
}


//Animal의 메소드를 구현한 클래스

//public class Cat implements Animal{
//	@Override
//	public void cry() {
//		System.out.println("야옹");
//	}
//	@Override
//	public void run() {
//		System.out.println("고양이가 달립니다");
//	}
//	
//}
