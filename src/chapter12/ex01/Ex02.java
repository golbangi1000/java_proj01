package chapter12.ex01;

abstract class Calc2{
	abstract void add (int a, int b);
	abstract void diff (int a, int b);
	abstract void mul (int a, int b);
	abstract void div (int a, int b);
}

class Calc_Impl2 extends Calc2 {
	@Override
	void add(int a, int b) {
		System.out.println(a+b);
	}
	@Override
	void diff(int a, int b) {
		System.out.println(a-b);
	}
	@Override
	void div(int a, int b) {
		System.out.println(((double)a/b));
	}   
	@Override
	void mul(int a, int b) {
		System.out.println(a*b);
	}
}


public class Ex02 {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		Calc2 c1 = new Calc_Impl2();
		
		c1.add(a, b);
		c1.diff(a, b);
		c1.mul(a, b);
		c1.div(a, b);
		
		Calc2 c2 = new Calc2() {
			
			@Override
			void mul(int a, int b) {
				System.out.println(a*b);
			}
			
			@Override
			void div(int a, int b) {
				System.out.println(((double)a/b));
			}
			
			@Override
			void diff(int a, int b) {
				System.out.println(a-b);
			}
			
			@Override
			void add(int a, int b) {
				System.out.println(a+b);
			}
		};
		
		c2.add(a, b);
		c2.diff(a, b);
		c2.mul(a, b);
		c2.div(a, b);
	}
}
