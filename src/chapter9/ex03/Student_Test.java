package chapter9.ex03;


class Student{
	String stuName;
	static int stuNo; 
	/*
	 * 학생수 모든 객체에서 공유됨
	 * 객체를 생성시 하나씩 늘어 나도록 함
	 */
	
	String stuAdd;
	
	static {
		stuNo = 0;
	}

	public Student(String stuName, String stuAdd) {
		this.stuName = stuName;
		this.stuAdd = stuAdd;
		stuNo += 1;
			//stuNo는 객체를 생성할떄 학생수가 늘어남. 
	}
	
	void print() {
		System.out.println("학생이름:" + stuName);
		System.out.println("학생주소:" + stuAdd);
		System.out.println("학생수:" + stuNo);
	}
	
	
	
	
}





public class Student_Test {
	public static void main(String[] args) {
		//1. 객체 생성
		Student s1 = new Student("홍길동","서울 종로구");
		
		s1.print();
		
		Student s2 = new Student("홍길투", "경기도");
		s2.print();
		
		Student s3 = new Student("홍길쓰리", "경기도");
		s3.print();
		
		
		
		
		System.out.println(s1.stuNo);
		System.out.println(s2.stuNo);

		System.out.println(s3.stuNo);

		
		
		
		
		
		
		
	}
}






















