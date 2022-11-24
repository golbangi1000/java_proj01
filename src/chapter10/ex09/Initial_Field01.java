package chapter10.ex09;

class Student{
	String name;
	int stuID;
	int age;
	String stuAdd;
	String stuPhone;
	double weight;
	int month;
	public Student() {
	
	}
	
	public Student(String name, int stuID, int age, String stuAdd, String stuPhone, double weight) {
		this.name = name;
		this.stuID = stuID;
		this.age = age;
		this.stuAdd = stuAdd;
		this.stuPhone = stuPhone;
		this.weight = weight;
		
		
	}

	
	// getter setter 

	
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
		if( month >= 1 && month <= 12) {
			this.month = month;
		} else {
			System.out.println("잘못된 입력 값입니다");
			return;
		}
	}
	//toString() 재정의 : 객체의 heap 메모리의 주소값 출력, hashcode로 출력(16진수)
	//객체 자체를 출력했을때 toString()가 작동 



	@Override
	public String toString() {  //Object 클래스의 메소드 모든 자바 클래스는 Object를 상속함
		return "Student [name=" + name + ", stuID=" + stuID + ", age=" + age + ", stuAdd=" + stuAdd + ", stuPhone="
				+ stuPhone + ", weight=" + weight + "]";
	}
	
	
	
	
}





public class Initial_Field01 {
	public static void main(String[] args) {
		/*
		 * 1.객체를 생성후 직접 필드의 값을 할당
		 * 2. 객체를 생성할떄 생성자를 사용해서 필드의 값을 할당.
		 * 3. DTO (Data Transfer Object) , VO(Value Object) :
		 * 		: client에게 값을 받아서 DAO에 값을 전송
		 * 				//DAO (Data Access Object) : Database에 값을 insert, update, Delete
		 * 	getter
		 *  setter
		 *  
		 */
	
		Student s = new Student("awe", 2, 2, "fa", "awe", 214);
		System.out.println(s.toString());
		
		System.out.println("==================================");
		
		Student s3 = new Student();
		s3.setAge(123);
		s3.setName("강감찬");
		s3.setStuID(1235);
		s3.setStuAdd("경기도");
		s3.setStuPhone("9149-15915");
		s3.setWeight(1424);
		System.out.println(s3.toString());
		
		
		
		
		System.out.println(s3.getAge());
		System.out.println(s3.getName());
	}
}


















