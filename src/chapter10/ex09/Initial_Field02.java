package chapter10.ex09;

class Student1{
	
	//필드 접근 제어자 
	private String name;
	private int stuID;
	private int age;
	private String stuAdd;
	private String stuPhone;
	private double weight;
	private int month;
	
	public Student1() {
		
	}
	
	public Student1(String name, int stuID, int age, String stuAdd, String stuPhone, double weight, int month) {
		super();
		this.name = name;
		this.stuID = stuID;
		this.age = age;
		this.stuAdd = stuAdd;
		this.stuPhone = stuPhone;
		this.weight = weight;
		this.month = month;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStuID() {
		return stuID;
	}
	public void setStuID(int stuID) {
		this.stuID = stuID;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStuAdd() {
		return stuAdd;
	}
	public void setStuAdd(String stuAdd) {
		this.stuAdd = stuAdd;
	}
	public String getStuPhone() {
		return stuPhone;
	}
	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}

	//객체 자체를 프린트할떄 필드의 값 전체를 출력 할수있도록  toString을 쓴다 
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", stuID=" + stuID + ", age=" + age + ", stuAdd=" + stuAdd + ", stuPhone="
				+ stuPhone + ", weight=" + weight + ", month=" + month + "]";
	}
	
	
}




public class Initial_Field02 {
	public static void main(String[] args) {
		/*
		 * 1. 모든 필드의 접근 제어자가 private이므로 직접 접근 불가
		 * setter를 사용해서 생성자를 사용해서 값을 할당 가능함 
		 */
		Student1 s1 = new Student1();
		
	}
}














