package chapter12.ex04;

import chapter12.ex02.Animal;

interface Animal1{
	void cry();
}

interface Animal2{
	void run();
}

interface Animal3{
	void eat();
}

/*
 *  Animal을 쓸꺼면 interface extends interface를 써서 Animal1 extends Animal쓰고 
 *  하면 됨 
 */

//Cat Tiger : cry run
// Dog Lion :run eat
// Eagle : cry run eat
/*
 * 배열에 넣어서 출력 instacneof 메소드를 사용함 
 */
class Cat implements Animal1, Animal2{
	@Override
	public void cry() {
		System.out.println("냐옹");
	}
	@Override
	public void run() {
		System.out.println("고양이 달린다");
	}
}

class Tiger implements Animal1, Animal2{
	@Override
	public void cry() {
		System.out.println("어흥");
	}
	@Override
	public void run() {
		System.out.println("호랑이 달린다");
	}
}
//Cat Tiger : cry run
//Dog Lion :run eat
//Eagle : cry run eat

class Dog implements Animal2, Animal3{
	@Override
	public void eat() {
		System.out.println("멍멍이는 고기를 먹는다");
	}
	@Override
	public void run() {
		System.out.println("멍멍이 달린다");
	}
}
class Lion implements Animal2, Animal3{
	@Override
	public void eat() {
		System.out.println("사자는 고기를 먹는다");
	}
	@Override
	public void run() {
		System.out.println("사자는 달린다");
	}
}
//Cat Tiger : cry run
//Dog Lion :run eat
//Eagle : cry run eat
class Eagle implements Animal1,Animal2,Animal3{
	@Override
	public void cry() {
		System.out.println("독수리는 끼이오");
	}
	@Override
	public void eat() {
		System.out.println("독수리는 물고기를 먹는다");
	}
	
	@Override
	public void run() {
		System.out.println("독수리는 달린다 ");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		//Cat Tiger : cry run
		// Dog Lion :run eat
		// Eagle : cry run eat
		
		Animal2 cat = new Cat();
		Animal2 tiger = new Tiger();
		Animal2 dog = new Dog();
		Animal2 lion = new Lion();
		Animal2 eagle = new Eagle();
		
		Animal2[] arr1 = new Animal2[] {cat,tiger,dog,lion,eagle};

		
		
		for(int i = 0 ; i < arr1.length;i++) {
			if( arr1[i] instanceof Animal2 &&  arr1[i] instanceof Animal1 && !(arr1[i] instanceof Animal3)) {
				if(arr1[i] instanceof Cat) {
					((Cat)arr1[i]).cry();
					((Cat)arr1[i]).run();
				} else if(arr1[i] instanceof Tiger) {
					((Tiger)arr1[i]).cry();
					((Tiger)arr1[i]).run();
				}
			} else if(arr1[i] instanceof Animal2 &&  arr1[i] instanceof Animal3 && !(arr1[i] instanceof Animal1)) {
				if(arr1[i] instanceof Dog) {
					((Dog)arr1[i]).eat();;
					((Dog)arr1[i]).run();;
				} else if (arr1[i] instanceof Lion){
					((Lion)arr1[i]).eat();
					((Lion)arr1[i]).run();
				}
			} else if(arr1[i] instanceof Animal2 &&  arr1[i] instanceof Animal3 && arr1[i] instanceof Animal1) {
				((Eagle)arr1[i]).cry();
				((Eagle)arr1[i]).run();
				((Eagle)arr1[i]).eat();
			}
		}
		System.out.println("==============================================");
		/*
		 * 선생님이 보여준 더 깔끔한 방법 
		 * 
		 * 아래에 있음 
		 * 
		 * 객체 타입이 아니라 사용된 인터페이스 타입을 써서 하기 
		 * 구분할때 객체 타입으로도 할수있는데 생각을 못함 
		 */
		
		for(int i = 0 ; i < arr1.length;i++) {
			if( arr1[i] instanceof Cat || arr1[i] instanceof Tiger) {
					((Animal1)arr1[i]).cry();
					((Animal2)arr1[i]).run();
				
			} else if(arr1[i] instanceof Dog || arr1[i] instanceof Lion) {
				((Animal3)arr1[i]).eat();
				((Animal2)arr1[i]).run();
			} else if(arr1[i] instanceof Eagle) {
				((Animal1)arr1[i]).cry();
				((Animal2)arr1[i]).run();
				((Animal3)arr1[i]).eat();
			}
		}
		
		
		
		
		
	}
}
