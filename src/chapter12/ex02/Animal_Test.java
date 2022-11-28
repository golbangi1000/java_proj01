package chapter12.ex02;

public class Animal_Test {
	public static void main(String[] args) {
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		Animal a3 = new Tiger();
		Animal a4 = new Eagle();
		
		
		Animal[] arr1 = new Animal[] {a1,a2,a3,a4};
		
		
		//3. For문을 사용해서 오버라이딩된 메소드 출력
		
		for(int i = 0 ; i < arr1.length;i++) {
			arr1[i].cry();;
			arr1[i].run();;
		}
		
		for( Animal K : arr1) {
			K.cry();
			K.run();
		}
	}
}
