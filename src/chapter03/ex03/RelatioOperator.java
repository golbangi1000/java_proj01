package chapter03.ex03;

public class RelatioOperator {
	public static void main(String[] args) {
		//크기 비교 여산 vs 등가 비교 연산자
		
		// 1. 크기비교 연산 (<, > , <= , >- ) ===> true, false
		
		System.out.println(5 >2);
		System.out.println(5 <2 );
		
		System.out.println(5>=5);
		
		//2. 등가 비교 연산자 (==, !=) ==> true, false
			//값이 같은지 다른지를 비교하는 연사자 
			//stack 메모리의 값을 비교
		
		int a = 5;
		int b = 2;
		int c = 5;
		
		System.out.println(a == b); //false
		System.out.println(a != b);	//true
		
		System.out.println( a==c); //true
		System.out.println(a!=c); //false
		
		//참조 자료형일때
		String str1 = new String ("안녕");
		String str2 = new String ("안녕");
		
		System.out.println(str1==str2);//false
		
		//개체변수.equals(객체변수2) : Heap 영역의 값을 비교 
		System.out.println(str1.equals(str2)); //true
		
	}
}














