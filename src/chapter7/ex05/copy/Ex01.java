package chapter7.ex05.copy;

class Student{
	
	
	
	String stuName;
	int stuNo;
	String stuPhone;
	String stuAddr;
	int stuAge;
	double stuWeight;
	

	Student() {
		stuName = "학생이름 없음";
		stuNo = 0;
		stuPhone = "000-0000-0000";
		stuAddr = "서울";
		stuAge = 0;
		stuWeight = 0.0;
	}
	Student(String stuName){
		this();
		this.stuName = stuName;
	}
	
	Student(String stuName, int stuNo){
		this(stuName);
		this.stuNo = stuNo;
	}
	Student(String stuName, int stuNo, String stuPhone){
		this(stuName, stuNo);
		this.stuPhone = stuPhone;
	}
	Student(String stuName, int stuNo, String stuPhone, String stuAddr){
		this(stuName, stuNo, stuPhone);
		this.stuAddr = stuAddr;
	}
	Student(String stuName, int stuNo, String stuPhone, String stuAddr, int stuAge){
		this(stuName, stuNo, stuPhone, stuAddr);
		this.stuAge = stuAge;
	}
	
	Student(String stuName, int stuNo, String stuPhone, String stuAddr, int stuAge, int stuWeight){
		this(stuName, stuNo, stuPhone, stuAddr,stuAge);
		this.stuWeight = stuWeight;
	}
	
	void print() {
		System.out.println("학생이름:" + stuName);
		System.out.println("학번:" + stuNo);
		System.out.println("핸드폰번호:" + stuPhone);
		System.out.println("주소: " + stuAddr);
		System.out.println("나이:"  + stuAge);
		System.out.println("몸무게:" + stuWeight);
	}
	
}


public class Ex01 {
	public static void main(String[] args) {
		Student student1 = new Student();
		
		student1.print();
		
		
		
		Student student2 = new Student("홍길동");
		
		student2.print();
		
		
		Student student3 = new Student("홍길투", 1245);

		student3.print();
		
		Student student4 = new Student("홍길투", 1245, "010-4141-1515");

		student4.print();
		
		Student student5 = new Student("홍길동",1244,"010-1412-1512","서울시",20,100);
		
		student5.print();
		
		
		
		
		
	}
}
