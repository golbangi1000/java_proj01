package chapter16.ex09;

import chapter16.ex07.BoundedTypeOfGenericClass;

//메소드에 인풋으로 들어오는 타입을 제한

class A{
	
}
class B extends A{
	
}
class C extends B{
	
}

class D extends C{
	
}
class Goods<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

class Test{
	//이건 A 타입만 들어올수있다
	void method1 (Goods<A> g) {}
	// ? : 모든 클래스 올수있따 . A B C D 
	void method2 (Goods<?> g) {}
	// B C D 올수있따 B의 자녀 클래스들이니깐
	void method3 (Goods<? extends B> g) {}
	// B A 만 올수있따 super니깐 부모들만 가능하게 한듯 
	void method4 (Goods<? super B> g) {}
}
public class BoundedTypeOfInputTypeArgument {

	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		
		//1번 A객체만 넣을수 있다
		t.method1(new Goods<A>());
		
		//2번 모든 타입이가능
		t.method2(new Goods<A>());
		t.method2(new Goods<B>());
		t.method2(new Goods<C>());
		t.method2(new Goods<D>());
		t.method2(new Goods<BoundedTypeOfInputTypeArgument>()); 
		t.method2(new Goods<BoundedTypeOfGenericClass>());
		
		//3번 B랑 B자녀클래스들만 가능 
		t.method3(new Goods<B>());
		t.method3(new Goods<C>());
		
		
		//4번 super 들어간 method니깐  B랑 A만 가능 
		t.method4(new Goods<B>());
		t.method4(new Goods<A>());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
