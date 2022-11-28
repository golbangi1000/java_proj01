package chapter12.ex03;

interface A{
	
}

interface B{
	
}


class C implements A{
	
}

//다중 인터페이스 상속
class D implements A, B {
}


// 크르래스와 인터페이스를 한번에 상속
// 자바는 하나의 부모 클래스만 가진다. 인터페이스는 다중 상속이 가능 
class F extends C implements A,B{
	
}

public class Interface_test {
		public static void main(String[] args) {
			
		}

}









