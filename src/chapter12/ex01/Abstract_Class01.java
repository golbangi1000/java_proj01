package chapter12.ex01;

abstract class Animal{
	String name;
	int age;
	
	//추상 메소드 : {} 실행 블락이 없고 선언만된 메소드 
	abstract void cry();
	abstract void run();
	
	
	//toString() 메소드 재정의 //상위 클래스에서 정의해 놓으면 자식 클래스에게 상속되어 내려감 
	//Object 클래스의 메소드: 객체를 출력했을떄 객체의 Heap의 참조주소를출력하지 않고 필드의 값을 출력
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	


	
	
	
}




class Cat extends Animal{
	//콘크리트 또는 추상클래스가 되야됨 
		//생성자를 사용해서 필드의 값 입력 
	@Override
	void cry() {
		System.out.println("야옹");
	}

	@Override
	void run() {
		System.out.println("고양이는 깡총하고 뜁니다");
	}

	public Cat(String name, int age) {
		super(name, age);
	} 
	
	
}


class Dog extends Animal{

	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	void cry() {
		System.out.println("멍멍");
	}

	@Override
	void run() {
		System.out.println("멍멍이가 뜁니다 ");
	}
	
}

public class Abstract_Class01 {
	public static void main(String[] args) {
		
		
		//객체 생성후 값 입력
		
		
		
		
		
		
		Animal a1 = new Cat("고양이", 15);
		Animal a2 = new Dog("멍멍이", 13);
		
		System.out.println(a1.age);
		
		//객체를 배열에 저장
		Animal[] arr = new Animal[] {a1,a2};
		
		
		for( int i = 0 ; i < arr.length; i++) {
			System.out.println(arr[i]);
			
			
			arr[i].cry();
			arr[i].run();
		}
		
		
		
		
		
		
		
		
		
	}
}
