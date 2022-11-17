package chapter05.ex09;

import java.util.Arrays;

public class String_Object_01 {
	public static void main(String[] args) {
		// 참조 자료형 : 객체 (String)
		/*
		 *  String 문자열을 저장하는 자바에서 생성해놓은 객체 
		 *  	- 다른 객체와는 다른 특수한 기능들이 들어있따.
		 *  
		 */
		
		//1. String 으로 객체 생성 방법			<== 별도의 주소에 생성됨
		String str1 = new String("안녕");
		System.out.println(str1);
		
		
		//2. String으로 객체 생성 방법  2   	<== 다른 객체와 공유 
		String str2 = "안녕하세요";
		System.out.println(str2);
		
		
		System.out.println("==============================================");
		
		//3. 문자열 수정 (객체내의 내용 변경 불가 ===> 새로운 객체가 생성)
		String str3 = new String("안녕2");
		String str4 = str3;
		System.out.println(System.identityHashCode(str3));

		str3  = "안녕하세요";

		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));

		//배열의 참조 변수 
		System.out.println("==================================================");
		int[] arr1 = new int[] {3,4,5};
		int[] arr2 = arr1;
		
		System.out.println(Arrays.toString(arr1));	//7,8,9
		System.out.println(Arrays.toString(arr2));	//7,8,9
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
