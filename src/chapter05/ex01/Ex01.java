package chapter05.ex01;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 * <문제>
		 * 배열 선언 4 가지 방법:
		 * 1. 배열 변수 이름 : arr1, 정수로 방 3개로 지정, 40 50 60 ..출력
		 * 2. 배열 변수 이름 : arr2, 실수로 방 5개로 지정, 44.0 50.0 60.0 출력
		 * 3. 배열 변수 이름 : arr3, 문자열 3, "오늘" "날씨" "흐림" <배열 선언 3>
		 * 4. 배열 변수 이름 : arr4, 문자 3, 'A' 'B' 'C'
		 */
		
		
		//방식
		int arr1[] = new int[] {40,50,60};
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		System.out.println(arr1[0]+ ""+ arr1[1]+ arr1[2]);
		
		//방식
		double[] arr2 = new double[5];
		arr2[0] = 40.0;
		arr2[1] = 50.0;
		arr2[2] = 60.0;
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);

		
		//
		String[] arr3;
		arr3 = new String[] {"오늘","날씨","흐림"};
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);

		//
		char[] arr4 = {'A','B','C'};
		System.out.println(arr4[0]);
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);

		//선생님 답

		
		

	}
}
