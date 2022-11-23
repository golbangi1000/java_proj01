package chapter10.ex01;

class Human{ //부모클래스 (super class) : 자식 클래스의 공통된 특징을 저장 
	
	//필드 (속성)
	String name;
	int age;
	
	
	void eat() {
		System.out.println("모든 사람은 먹는다");
	}
	
	void sleep() {
		System.out.println("모든사람은 잠을 잡니다 ");
	}
	
	
}

//자식 클래스 : 부모 클래스의 모든 필드와 메소드를 물려 받는다 

class Student extends Human{
	
	//1. 부모클래스의 모든 필드와 메소드를 그대로 자식 클래스 내부에 들어와 있따 
	//2. 자식 클래스에서만 적용되는 필드와 메소드를 추가적으로 등록해서 사용 
	
	int studentID;
	
	void goToSchool() {
		System.out.println("학생은 학교를 간다");
	}
	

	
	
}
class Worker extends Human{
	int workerID;
	
	void goToWork() {
		System.out.println("노동자는 일을한다");
	}
	
}



class Student2 extends Student{
	//Human이랑 Student의 필드와메소드를 가져옴
	//Student2 --> Student --> Human
	
	
}
	





public class Inheritance01 {
	public static void main(String[] args) {
		/*
		 * 상속 부모 클래스의 필드 와 메소드 를 자식클래스에게 물려 받아서
		 * 중복된 코드를 줄여줄수있따
		 * 다형성 : 부모클래스를 상속받아서 다양한 형태로 출력 
		 * 배열이나 컬렉션에 부모클래스 이름으로 (업캐스팅)
		 */
		Student s1 = new Student();
		s1.age = 1;
		System.out.println(s1.age);
		s1.eat();
		System.out.println(s1.studentID);
		s1.goToSchool();
		//부모의 필드와 메소드 
		
		System.out.println("=================================");
		
		Worker w1 = new Worker();
		System.out.println(w1.age);
		w1.eat();
		w1.name = "이순신";
		
		System.out.println(w1.name);
		//자신의 클래스의 필드와 메소드도 됨 
		
		Student2 s2 = new Student2();
		
		s2.age = 10;
		
		
		
	}
}









