package chapter10.ex03;



class Animal{
	
	
	void animalSound() {
		System.out.println("모든 동물은 소리내어 웁니다");
	}
	

}

class Tiger extends Animal{

	@Override
	void animalSound() {
		System.out.println("호랑이는 어흥하고 웁니다");
	}
	
}

class Eagle extends Animal{

	@Override
	void animalSound() {
		System.out.println("독수리는 끼이오하고 웁니다");

	}
	
}

class Lion extends Animal{

	@Override
	void animalSound() {
		System.out.println("사자는 어흐읗으흥 하고 웁니다 ");
	}
	
}

public class Method_Overriding02 {
	public static void main(String[] args) {
		
		/*
		 * 객체 생성 
		 */
		
		Animal t1= new Tiger();
		Animal t2= new Lion();
		Animal t3 = new Eagle();
		
		// Animal의 메소드 호출시 오버라이딩된 자식의 메소드가 출력 
		t1.animalSound();  // Animal의 animalSound호출시, Tiger의 animal sound가 호출됨
		t2.animalSound();// Animal의 animalSound호출시, Lion의 animal sound가 호출됨
		t3.animalSound();// Animal의 animalSound호출시, Eagle의 animal sound가 호출됨
		
		
		Animal[] arr1 = new Animal[3];
		
		//arr1 배열의 각방에 animal객체 저장
		
		arr1[0] = t1;
		arr1[1] = t2;
		arr1[2] = t3;
		
		//2. arr1배열에 Animal 타입의 객체가 저장이 되어있음
			//배열의 각 방의 값을 가지고 오기 
		
		Animal a1 = arr1[0];
		Animal a2 = arr1[1];
		Animal a3 = arr1[2];
		
		a1.animalSound();
		a2.animalSound();
		a3.animalSound();
		
		
		
	}
}












