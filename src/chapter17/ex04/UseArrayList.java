package chapter17.ex04;

import java.util.ArrayList;

class Student{
	String name;
	int stuID;
	
	
	//생성자를 사용해서 값을 인풋받아 메모리에 할당
	Student(String name, int stuID){
		this.name = name;
		this.stuID = stuID;
	}

	//toString() 재정의 : 메모리값 출력 
	@Override
	public String toString() {
		return "Student [name=" + name + ", stuID=" + stuID + "]";
	}
	
	
	
	
	
	
	
	
}


public class UseArrayList {
		public static void main(String[] args) {
			
			
			//ArrayList에 저장될 객체는 Student객체가 저장됨
			ArrayList<Student> a1 = new ArrayList<>();
			
			//Student 객체를 생성
			Student s1 = new Student("홍길동", 1111);
			Student s2 = new Student("이순신", 1234);
			Student s3 = new Student("강감찬", 5677);
			
			
			
			a1.add(s1);
			a1.add(s2);
			a1.add(s3);
			
			
			for(int i = 0 ; i < a1.size();i++) {
				Student ss1 = a1.get(i);
				System.out.println(ss1);
			}
			
			System.out.println("====================================================");
			//enhanced for 
			
			for( Student k : a1) {
				System.out.println(k);
			}
			
			
			System.out.println(a1);
			System.out.println(a1.toString());
			
			
			
			
			
			
			
			
			
			
			
			
		}
}
