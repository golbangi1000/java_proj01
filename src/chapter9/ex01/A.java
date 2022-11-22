package chapter9.ex01;

public class A {
	
	public int a = 1;   //외부 패키지에서 접근이 가능
	protected int b = 2;	//다른 패키지에서 접근 가능 (단 상속관계일때만 적용) 
	int c = 3;	//같은 패키지
	private int d = 4; //같은 파일 
	
	
	
}
