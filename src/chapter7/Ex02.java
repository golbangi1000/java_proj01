package chapter7;

class Student{
	String stuName;		//학생이름
	int stuNum;			//학번을 저장
	String stuAddr;		//학생의 주소
	String stuPhone;	//학생의 전화번호
	double weight;		//학생의 몸무게
	
	
	/*
	 * 생성자 오버로딩
	 * 		기본생성자, 매개변수 3개인 생성자 5개 생성자
	 * 
	 * 
	 * 필드의 값을 출력하는 메소드 void print()
	 */
	
	Student(){
	}
	
	Student(String stuName, int stuNum, String stuAddr){
		this.stuName = stuName;
		this.stuNum = stuNum;
		this.stuAddr = stuAddr;
	}
	Student(String stuName, int stuNum, String stuAddr, String stuPhone, double weight){
		this.stuName = stuName;
		this.stuNum = stuNum;
		this.stuAddr = stuAddr;
		this.stuPhone = stuPhone;
		this.weight = weight;
	}
	void print() {
		System.out.println("이름:" + stuName);
		System.out.println("학번:" + stuNum);
		System.out.println("주소: " + stuAddr);
		System.out.println("전화번호:"  + stuPhone);
		System.out.println("몸무게:" + weight);
	

	}
	
	
	
	
	
}

public class Ex02 {
	public static void main(String[] args) {
		Student s1 = new Student("홍길동",123456,"한국");
		s1.print();
		
		System.out.println();
		Student s2 = new Student("홍길투", 123457, "미국", "010-1042-1124", 76.55);
		s2.print();
	}

}
