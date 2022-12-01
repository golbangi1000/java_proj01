package chapter16;

//각각의 상품을 저장하는 클래스가 별도로 존재함 


//1. Apple 클래스와 Apple 클래스를 담을수있는 클래스

class Apple{
	
}
class Pencil{
	
}
class Goods1{
	//private 이니깐 getter setter 필요	
	private Apple apple = new Apple();
	
	public Apple getApple() {
		return apple;
	}

	public void setApple(Apple apple) {
		this.apple = apple;
	}
	
	
	
	
}
class Goods2{
	private Pencil pencil = new Pencil();

	public Pencil getPencil() {
		return pencil;
	}

	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
	
}

public class ProblemsBeforeGeneric {
	public static void main(String[] args) {
		
		//1. Goods1을 통해서 Apple 객체를 추가하고 나오기
		Goods1 goods1 = new Goods1();
		goods1.setApple(new Apple()); //setter를 사용해서 Apple객체를 추가함 
		
		
		Apple apple = goods1.getApple();
		
		//2. Goods2를 사용해서 Pencil 객체를 추가하고 가져오기
		
		Goods2 goods2 = new Goods2();
		Pencil pencil = goods2.getPencil();//getter를 사용해서 pencil 객체를 가져옴
		goods2.setPencil(new Pencil());//setter를 사용해서 pencil 객체를 주입 
		
		
		Pencil pencil2 = goods2.getPencil();
		Pencil pencil3 = goods2.getPencil();
		System.out.println(pencil.hashCode());
		System.out.println(pencil2.hashCode());
		System.out.println(pencil3.hashCode());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
