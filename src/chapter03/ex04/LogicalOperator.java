package chapter03.ex04;

public class LogicalOperator {

	public static void main(String[] args) {
		
		//논리 연산 vs 비트연산자 를 이용한 논리 연산 
		// 1. 논리연산자 ( AND (&&), OR ( || ), XOR ( ^ ), NOT (!)
		
				// << 숏트 서킷이 발생됨 >> 
		// 1-1. AND (&&)
			// true && true  ==> true
			// false && true ==> false 
			// true && false ==> false
			// false && false ==> false
		
		System.out.println(true && true);
		System.out.println(false && true);  //쇼트 서킷
		System.out.println(true && false);
		System.out.println(false && false); //쇼트 서킷
		
		
		// 1-2. OR (||)
		// true && true  ==> true
		// false && true ==> true 
		// true && false ==> true
		// false && false ==> false
		
		System.out.println(true || true); //쇼트 서킷
		System.out.println(false || true);
		System.out.println(true || false); //쇼트 서킷
		System.out.println(false || false);
		
		//1-3. XOR ( ^ )	: 두 값이 같을떄 False, 다를때 True
		
		
		System.out.println(true ^ true);//false
		System.out.println(false ^ true);//true
		System.out.println(true ^ false);//true
		System.out.println(false ^ false);//false
		System.out.println(false ^ (5 < 2)); //false
		
		
		//1-4. NOT (!) : true일때 false , false일떄 true
		System.out.println(!true );
		System.out.println(!false);
		
		
		//2. 비트연산자로 논리연산이 가능 하다.
		//		AND ( & ) , OR ( | ) , XOR ( ^ ), NOT ( ~ )
		System.out.println(true & true); //true
		System.out.println(true & false); // false
		System.out.println(true | false); // true
		System.out.println(true ^ true); //false
		System.out.println(!true);
		//System.out.println(~true); //오류 발생
		
		System.out.println("======================================");
		
		
		//3. 쇼트 서킷 : 논리연산에서 앞의 내용으로 뒤의 값의 유무없이 식별 가능하면 뒤의 값은 처리 하지 않음.
		
		System.out.println(false && true); //쇼트 서킷이 발생
			//AND 연산자에서는 처음 값이 false가 오게되면 뒤의 값이 어떤값이 오더라도 false
		
		
		System.out.println(false || true);
		System.out.println( true || true); //쇼트 서킷
			//OR 연산에서 처음 값이 true이면 쇼트 서킷이 발생됨
		
		System.out.println("=====================================================");
		int value1 = 3;//AND 연산에서 숏트 서킷 발생 및 방지
		System.out.println(false && ++value1>6); //쇼트서킷이 발생해서 뒤에 구문을 실행안함
		System.out.println(value1);
		
		
		int value2 = 3;
		
		System.out.println(false & ++value2 > 6); //쇼트 서킷이 발생 안됨
		System.out.println(value2);	//4
		
		
		int value3 = 3;//OR 연산에서 숏트 서킷 발생 및 방지
		System.out.println(true || ++value3>6); //쇼트서킷이 발생해서 뒤에 구문을 실행안함
		System.out.println(value3);
		
		
		int value4 = 3;
		
		System.out.println(true | ++value4 > 6); //쇼트 서킷이 발생 안됨
		System.out.println(value4);	//4
		
		
		//XOR ( ^ ) : 논리연산, 비트연산, <==뒤이ㅡ 값을 반드시 확인해야 결과를 알수있기때문에 숏트서킷이 발생안함
		
		
		
		
		
		
		
		
		
		
	}

}


































