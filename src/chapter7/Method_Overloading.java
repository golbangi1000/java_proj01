package chapter7;


class MethodOverLoading{
	//메소드 오버로딩 동일한 이름의 메소드이지만 시그니쳐에 따라서 다른 메소드를 호출하는것
	//시그니쳐 : 매개변수 갯수, 매개변수의 데이터 타입 
	void print() {
		System.out.println("데이터가 없습니다");
	}
	void print(String a) {
		System.out.println(a);
	}
	void print(int a) {
		System.out.println("int:" + a);
	}
	
	void print(double a) {
		System.out.println("double: "  + a);
	}
	
	//오버로딩의 위배 다른 순서는 되는데 같은 순서는 안됨 
}

public class Method_Overloading {

	
	
	
	
	
	public static void main(String[] args) {
		//오버로딩 : 메소드의 인풋 매개변수 갯수, 인풋 타입이 다르면 오버로딩 
		//오버라이딩 상속에서만 적용됨 
		
		MethodOverLoading m = new MethodOverLoading();
		
		m.print();
		
		m.print(123);
		
		m.print(234.12);
		
		
		
	}

}
