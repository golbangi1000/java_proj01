package chapter10.ex08;


class Animal {
	void run ()	{
		System.out.println("모든 동물은 달립니다");
	}
}

class Man extends Animal{

	@Override
	void run() {
		System.out.println("모든 남자는 달립니다");

	}
	
}
class Woman extends Animal{
	@Override
	void run() {
		System.out.println("모든 여자는 달립니다");

	}
}
class Lion extends Animal{
	@Override
	void run() {
		System.out.println("모든 사자는 달립니다");

	}
}

class Tiger extends Animal{
	@Override
	void run() {
		System.out.println("모든 호랑이는 달립니다");

	}
}

class Cat extends Animal{
	@Override
	void run() {
		System.out.println("모든 고양이는 달립니다");

	}
}
class Dog extends Animal{
	@Override
	void run() {
		System.out.println("모든 개는 달립니다");

	}
}

class DogChild extends Dog{

	@Override
	void run() {
		System.out.println("모든 개 새끼는 달립니다");

	}
	
	
	
}
public class Ex01 {
	public static void main(String[] args) {
		/*
		 * animal : 부모 클래스, run()	 정의 
		 * 자식 클래스 : Man Woman Lion Tiger Cat Dog Dogchild
		 * -	부모의 run 재정의
		 * 
		 * arr 배열에 저장후 for, Enhanced for, run() 출력
		 */
		
		
		Animal animal = new Animal();
		Animal man = new Man();
		Animal woman = new Woman();
		Animal lion = new Lion();
		Animal tiger = new Tiger();
		Animal cat = new Cat();
		Animal dog = new Dog();
		Animal dogChild = new DogChild();
		
		
		Animal[] arr = new Animal[] {animal, man , woman, lion , tiger,cat,dog,dogChild};
		
		for(int i = 0 ; i < arr.length;i++) {
			arr[i].run();
		}
		
		for(Animal k : arr) {
			k.run();
		}
		
		
		
		
		
	}
}













