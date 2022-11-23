package chapter10.ex02;

class Human{
	String name;
	int age;
	
	
	
}


class Student extends Human{
	String stuName;
	static int stuNo; 
}

class Student2 extends Student{
	String stu2ID;
	void stu2Eat(){
		System.out.println("학생2는 음식을 맛나게 먹습니다");
	}
}




public class Ex01 {
	public static void main(String[] args) {
		/*
		 * 
		 * 업캐스팅 실습
		 * 1. Student 클래스를 생성해서 Human 타입 h1
		 * 2. Student 클래스를 생성하면서 Student 타입 s1
		 * 
		 * 3.Student2 객체를 생성하면서 Human 타입으로 지정 : h2
		 * 4.Student2 객체를 생성하면서 Student 타입으로 지정 : s2
		 * 5.Student2 객체를 생성하면서 Student2 타입으로 지정 : s3
		 */
		
		Human h1 = new Student();
		
		Student s1 = new Student();
		
		Human h2 = new Student2();
		
		Student s2 = new Student2();
		
		Student s3 = new Student2();
		
		
		((Student2) h2).stu2ID = "학생2ID입니다";
		
		System.out.println(((Student2) h2).stu2ID);
		
		
		
		Student2 ab;
		ab = (Student2) s2;
		ab.stu2ID = "ㄻㅈㄷ";
		ab.stu2Eat();
		
		Human ab2;
		ab2 = ab; //업캐스팅이니깐 자동
		
		
		
		
		
	}
}










