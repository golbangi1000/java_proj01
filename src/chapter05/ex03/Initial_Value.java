package chapter05.ex03;

public class Initial_Value {
	public static void main(String[] args) {
	
		/*
		 * 기본 자료형과 참조 자료형의 초기값
		 * 		기본자료형: Stack 공간에 변수와 변수의 값이 저장됨
		 * 			//강제 초기화가 안됨. 사용시에는 초기값을 넣고 사용
		 * 		참조 자료형 (배열)	: Stack 공간에 [배열] 변수와 heap 영역의 주소정보가 저장
		 * 						Heap 영역에는 값이 저장
		 * 
		 * 			//강제 초기화가 됨. boolean (false), 정수 (0), 실수 (0.0)
		 */
		
		
		/*
		 * 1. stack 메모리값(rkdwp chrlghkrk ehlwl dksgdma)
		 */
		
		int value1;
		//System.out.println(value1); 초기화가 안되서 에러가뜸
		int[] value2;
		//System.out.println(value2); 이것도 에러뜸 
		value2 = new int[3];
		
		System.out.println(value2); //주소값 출력 
		
		int value3 = 0;
		System.out.println();
		int[] value4 = null; // null; 비어이쓴ㄴ 상태, 기본자료형에는 사용 할수 없다.
							//참조 자료형에서만 사용가능하다. 
		System.out.println(value4);
		
		System.out.println("===================================");
		
		// 2. Heap 영역은 강제 초기화가 된다. 
		//2-1. 기본자료형 배열
		/*
		 * boolean은 초기값으로 false
		 * 정수형은 초기값으로 0f
		 */
		boolean[] arr1 = new boolean[3]; //기본값으로 false가 각 방에 할당됨 
		for( int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}	//각 방에 초기값이 들어 있따 
		int[] arr123 = new int[3]; //기본값으로 0이 각 방에 할당됨 
		for( int i = 0; i < arr123.length; i++) {
			System.out.println(arr123[i]);
		}
		
		System.out.println("================================================");
		
		String[] arr5 = new String[3];
		for( int i = 0; i < arr5.length; i++) {
			System.out.println(arr5[i]);
		}
		
		// Arrays.toString()으로 출력
		
		
		
		
		
		
		}
}









