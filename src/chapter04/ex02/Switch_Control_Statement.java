package chapter04.ex02;

public class Switch_Control_Statement {

	public static void main(String[] args) {
		//switch 문
		/*
		 * 	--if 문은 참일경우 실행블락을 실행후 breka;가 자동으로 작동
		 * 	--switch 문은 실행후 해당 블락을 빠져나오지 않는다. 강제로 빠져나오도록 break;를 넣어야한다.
		 * 
		 */
	
		//1. switch문에서 break를 사용하지 않는 경우.
		
		int value1 = 3;
		//3을 넣으면 case 3부터 쭉내려감 
		
		switch (value1) {
		case 1:
			System.out.println("A");
		case 2: 
			System.out.println("B");
		case 3:
			System.out.println("C");
		case 4:
			System.out.println("D");
		default:
			System.out.println("F");
		}
		
		
		System.out.println("==============================================");
		
		//2. switch 문에서 break를 포함해서 출력 <==기본적으로 사용
		switch (value1) {
		case 1:
			System.out.println("A");
			break;
		case 2: 
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
		case 4:
			System.out.println("D");
			break;
		default:						//if무느이 else와 같다. <<case에 존재하지 않는 모든것>>
			System.out.println("F");
			break;
		}
		
		
		
		System.out.println("================if 문으로 변환============");
		
		
		// 3.
		int value2 = 1;
		if (value2 ==1) {
			System.out.println("A");
		} else if ( value2 ==2 ) {
			System.out.println("B");

		}else if ( value2 ==3 ) {
			System.out.println("C");
		}else if ( value2 ==4 ) {
			System.out.println("D");
		}else if ( value2 ==5 ) {
			
		} else {
			System.out.println("F");
		}
		
		
		
		
	}

}
