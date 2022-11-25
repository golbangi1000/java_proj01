package chapter10.ex10;

import javax.print.attribute.standard.MediaSize.NA;

class C {
	String stuID;
	String name;
	int age;
	//생성자, 기본생성자1, 생성자2
	public C() {
		super();
	}
	public C(String stuID, String name, int age) {
		super();
		this.stuID = stuID;
		this.name = name;
		this.age = age;
	}
//	c1.equals(c2) //stuID 필드를 재정의해서, stuID가 같으면 true, 아니면 false
	@Override
	public boolean equals(Object obj) {
		if(this.stuID == ((C)obj).stuID) {
			return true;
		} else {
			return false;
		}

	}


	
	
	//toString 메소드 재정의 : 필드의 값을 출력, 객체 
	
	@Override
	public String toString() {
		return "C [stuID=" + stuID + ", name=" + name + ", age=" + age + "]";
	}
}


public class Ex01 {
	public static void main(String[] args) {
		C c1 = new C("STUDENT", "홍길동", 123);
		C c2 = new C("STUDENT", "홍길동", 123);
		C c3 = new C();
		C c4 = new C();
		C c5 = new C("STUDENT", "홍길동", 1232);
		C c6 = new C("STUDENT", "홍길동", 123124);
		c1.name = "ss";
		System.out.println(c1.name);
		System.out.println(c1.equals(c2));	
		System.out.println(c2.equals(c3));
		System.out.println(c3.equals(c4));

		System.out.println("================================");
		String a1= "STUDENT";
		
		System.out.println(c1.stuID == c2.stuID);
		System.out.println(c1.stuID.hashCode());
		System.out.println(c2.stuID.hashCode());
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
