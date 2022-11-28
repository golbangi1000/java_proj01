package chapter12.ex01;

abstract class Calc{
	abstract int add(int a, int b);  //더하기
	abstract int diff(int a , int b); //빼기
	abstract int mul(int a , int b);//곱하기
	abstract double div(int a , int b);//나누기 
	
}

class Calc_Impl extends Calc {
	@Override
	int add(int a, int b) {
		
		return a+b;
	}
	@Override
	int diff(int a, int b) {
		return a-b;
	}
	@Override
	double div(int a, int b) {
		return ((double)a/b);
	}
	@Override
	int mul(int a, int b) {
		return a*b;
	}
}



public class Ex01 {
	public static void main(String[] args) {
		int a= 5;
		int b=4;
		
		
		//1.  구현 클래스의 메소드 호출후 출력
		Calc c1 = new Calc_Impl();
		
		System.out.println(c1.add(a, b));
		System.out.println(c1.diff(a, b));
		System.out.println(c1.div(a, b));
		System.out.println(c1.mul(a, b));
		//2. 익명 클래스로 메소드 호출후 출력 
		
		Calc c2 = new Calc() {
			
			@Override
			int mul(int a, int b) {
				return a*b;
			}
			
			@Override
			double div(int a, int b) {
				return ((double)a/(double)b);
			}
			
			@Override
			int diff(int a, int b) {
				return a-b;
			}
			
			@Override
			int add(int a, int b) {
				return a+b;
			}
		};
			
		System.out.println(c2.add(a, b));
		System.out.println(c2.diff(a, b));
		System.out.println(c2.div(a, b));
		System.out.println(c2.mul(a, b));
		
		
		
		
		}
	
}









