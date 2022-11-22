package chapter8.ex01;
import chapter8.ex02.Car;
import chapter8.ex02.Student;



public class Package {
	
	public static void main(String[] args) {
		/*
		 * 클래스 내부 구성요소:
		 * 
		 * 1.필드 2. 생성자 3 메소드 4 이너클래스
		 * 
		 * 클래스 외부 구성요소 
		 * 
		 * 1. 패키지 2. 임포트 3. 외부 클래스
		 * 
		 * 
		 * 1. 패키지 : 클래스를 조직화해서 관리하는 폴더
		 * 	한 패키지내에 동일한 이름의 클래스는 올수없다 
		 * 
		 * 2.임포트 다른 패키지의 클래스 사용할때
		 * 
		 * 
		 */
		
		Student stu0 = new Student("홍길동","12345",1294,"서울");
		stu0.print();
		Student stu1 = new Student();
		stu1.print();
		
		Car c = new Car();
		c.print();
		
		
		
		
	}
}
