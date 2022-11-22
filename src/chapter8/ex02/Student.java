package chapter8.ex02;




public class Student {
	
	String stuname;
	String stuNo;
	int stuYear;
	String stuAdd;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String stuname, String stuNo, int stuYear, String stuAdd) {
		this.stuname = stuname;
		this.stuNo = stuNo;
		this.stuYear = stuYear;
		this.stuAdd = stuAdd;
	}
	public void print() {
		System.out.println(stuname);
		System.out.println(stuNo);
		System.out.println(stuYear);
		System.out.println(stuAdd);
	}
	
	
	
}
