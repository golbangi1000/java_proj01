package chapter06.ex01;

class Man {
	
	String name = "홍길동";
	int age = 30; 
	String phone = "010-1111-1234";
	String addr = "서울 종로구 인사동";
	double weight = 70.5;
	
	//기본 생성자는 생략됨 : A () {}
	
	
	//메소드 :
	int sum;
	void add1()	{
		//호출하면 1 ~ 100 까지 2의 배수를 출력하고 더한값 
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				sum+= i;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println(sum);
		sum = 0;

	}
	
	void add2() {

		//1 ~ 500 까지 3의 배수와 4의 배수를 출력하고 더한값출력 
		for(int i = 1; i <= 500; i++) {
			if(i % 3 == 0 || i % 4 == 0) {
				sum += i;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println(sum);
		sum = 0; 

		
	}
	void add3() {
		//1 ~ 1000까지 1씩등가하고 4의 배수만 출력되지 않도록 하고 더한값 출력 
		for(int i = 1; i <= 1000;i++) {
			if(i % 4 != 0) {
				sum += i;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println(sum);
		sum = 0;

	}
	
}





public class Ex01 {
	public static void main(String[] args) {
		Man man = new Man();
		
		man.add1();
		man.add2();
		man.add3();
	}
}
