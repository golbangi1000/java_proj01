package chapter7;

class Calc{
	
	
	int add (int a, int b) {
		
		return a + b;
	}
	
	//빼기 diff
	
	int diff ( int a , int b) {
		return a-b;
	}
	
	//곱하기 multi
	int multi(int a, int b) {
		return a*b;
	}
	
	//나누기 div : double
	double div (double a, double b) {
		return a/b;
	}
	
	//면적 rec 가로 x 세로 y
	double rec(double x, double y) {
		return x*y;
	}
	
}


public class Ex01 {
	
	public static void main(String[] args) {
		Calc c = new Calc();
		
		System.out.println(c.add(1, 14));
		
	}
}
