package chapter04.ex01;

public class If_Control_Statement {
	public static void main(String[] args) {
		//IF 구문 사용하기 
		// 1. type 1 : if (조건) {실행문 : 조거닝 참일때 실행;}
		int value1 = 5;
		if (value1 > 3) {
			System.out.println("실행1"); //조건이 참이므로 실행됨
		}
		
		//조건이 거짓일떄 
		if( value1 <3) {
			System.out.println("실행2");
		}
		
		System.out.println("========={조거닝 참일때 실행문 , {}생략 가능=====");
		
		if(value1 > 3)
			System.out.println("실행3");
			System.out.println("실행4"); //얘는 적용 안됨
			
		//2. type 2: if (조건) {조건이 참일때 실행; } else {조건이 거짓일떄 실ㅎ행}
			// 삼항 연산자로 변환
				//{}를 생략 가능한데, 생략될 경우 실행문 1개만 적용
			boolean bool1 = true;
			boolean bool2 = false;
			
			if (bool1) {
				System.out.println("참");
			} else {
				System.out.println("거짓");
			}
			
			if (bool2) {
				System.out.println("참");
			} else {
				System.out.println("거짓");
			}
		// 삼항 연산자를 사용해서 출력
			System.out.println((bool1)? "참":"거짓");
		
		//3. type 3 : 조건이 여러개인 경우 :
		// if (조건1 ) {조건1이 참일떄 실행} else if .....
		int value3 = 85;
		
		if ( value3 > 90) {
			System.out.println("A학점");
		} else if (value3 >=80) {
			System.out.println("B학점");
		} else if(value3 >=70) {
			System.out.println("C학점");
		} else if(value3 >=60) {
			System.out.println("D학점");
		} else {
			//위의 조거닝 모두 만족하지 않으면 실행
			System.out.println("F학점");
		}
		
		System.out.println("======================================================");
		
		if ( value3 > 70) {
			System.out.println("C학점");
		} else if (value3 >=80) {
			System.out.println("B학점");
		} else if(value3 >=90) {
			System.out.println("A학점");
		} else {
			System.out.println("F학점");
		}
		
		System.out.println("===================================");
		if (value3 <= 70 && value3 >= 60) {
			System.out.println("D학점");
		} else if ( value3 >=70 && value3 < 80) {
			System.out.println("C학점");
		} else if (value3 >=80 && value3 <90) {
			System.out.println("B학점");
		} else if (value3 >=90 && value3 <100) {
			System.out.println("A학점");
		} else if (value3 >=0 &&  value3 <60) {
			System.out.println("F학점");
		}
	}
}













