package chapter16.ex10;

//제너릭 클래스의 상속 자식 클래스는 부모 클래스의 타입변수의 갯수가 같거나 많아야한다
//두점의 좌표를 처리하는 클래스 생성. < 제너릭 클래스> 

class Parent<T>{
	T t;
	//getter setter 생략
}
//부모에 인풋되는 T값이 하나면 최소한 하나는 자녀에 있어야됨 
class Child1<T> extends Parent<T>{
	
}

// 이건 두개니깐 괜찮음 
class Child2<T, V> extends Parent<T>{
	V v;
}





public class InheritanceGenericClass {
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
