package chapter05.ex09;

import java.util.Arrays;

public class String_Method {
	public static void main(String[] args) {
		/*
		 * 
		 * String 클래스에서 사용되는 주요 메소드 (함수)
		 * 			//기본 자료형:
		 * 			//참조 자료형: 배열 / 열거 / 객체 / 인터페이스 첫자 모두 대문자
		 * 		1. 문자열의 길이 (length)
		 * 
		 */
	//   참조 자료형		참조 변수 
		String str1 = "Hello Java";
		String str2 = "안녕하세요! 반갑습니다!";
		
		System.out.println(str1);  //글자의 갯수 : 11자 
		
		
		
		//2. 문자열 검색 ( charAt(), indexOf(), lastIndexof()	)
		
		System.out.println(str1.charAt(1));
		
		System.out.println(str1.indexOf("j"));
		
		System.out.println(str1.lastIndexOf('l')); //검색 방식은 뒤에서 부터 와서 첫번쨰 나오는 문자를 출력  
		
		
		System.out.println(str1.indexOf('a',8)); //8번부터 검색 a를 검색
		System.out.println(str1.lastIndexOf('a',8));//8번퉈 검색 a를 검색
		
		System.out.println("==================================================");
		
//		String str1 = "Hello Java";
//		String str2 = "안녕하세요! 반갑습니다";
		//문자열을 검색 해서 방전호를 출력
		
		System.out.println(str1.indexOf("Java"));
		System.out.println(str2.indexOf("하세요"));
		
		//검색 실패시 : -1을 return함 
		
		
		
		//3. 문자열 변환 및 문자열 연결 : String.valueOf(), concat()
		
		/*
		 *  String.valueOf() : 기본자료형을 ==> String 자료형으로 변환
		 */
		
		String str3 = String.valueOf(2.3); //다른 타입들도 가능
		String str4 = String.valueOf(true);
		
		//concat()
		
		String str5 = str3.concat(str4);
		String str6 = str3 + str3;
		System.out.println(str5);
		System.out.println(str6);
		
		System.out.println(str6);
		
		//String.valueOf() + concat()	 ==> 
		String str7 = "안녕" + 3;
		String str8 = "안녕".concat(String.valueOf(3));//내부적으로 작동됨 
		
		System.out.println(str7); 
		System.out.println(str8);
		
		//4. 문자열 ==> byte[] ( getBytes(), )
		
		// 	문자열 ==> char[] (toCharArray())
		
		String str10 = "Hello Java!";
		String str11 = "안녕하세요! 반갑습니다.";
		
		//getBytes()	;
		
		
		// ASCII 코드값을 준다 
		/*
		 * getBytes() : 문자열을 한글자씩 잘라서 byte 배열에 저장, 아스키 코드값이 출력
		 * 
		 */
		byte[] arr1 = str10.getBytes();
		byte[] arr2 = str11.getBytes();

		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		
		System.out.println("===========================================================");
		//toCharArray()	: 
		System.out.println();
		char[] arr3 = str10.toCharArray();
		char[] arr4 = str11.toCharArray();
		
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
		System.out.println(arr1[1]);
		
		//5. 문자열 수정, 대문자로 출력 : toUpperCase(), 소문자로 변환 : toLowerCase();
		System.out.println(str1.toLowerCase());
		
		System.out.println("=================================");
		
		
		
		//6. 문자열 수정 : replace("수정할원본", "수정할내용")
		String str13 = "안녕 자바 World";
		
		System.out.println( str13.indexOf('W'));
		System.out.println(str13.replace("World", "월드"));
		System.out.println(str13);
		
		
		
		//substring(0,5) : 0번방에서 부터 5번 방까지 잘라서 출력
		
		System.out.println(str13.substring(0, 5));
		
		System.out.println(str13.substring(3,4));
		
		
		//split()	 : 특정 문자를 기준으로 잘라서 문자열 배열에 저장 
		
		String[] strArray = "abc/def-ghi jkl".split("/|-| ");
		
		
		System.out.println(Arrays.toString(strArray));
		
		
		
		System.out.println("=======================================================");
		
		
		//6. 문자열의 내용 비교 ( equals(), equalsIgnoreCase() )
		
			//equals()	: Heap의 값을 비교 대문자 소문자까지 체크 
			//equalsIgnoreCase() : Heap의 값비교, 대소문자 체크하지 않고 비교
		
		
		String str20 = new String("Java");
		String str21 = new String("Java");
		String str22 = new String("java");

		System.out.println(str22.equalsIgnoreCase(str21));
		
		
		System.out.println("===================================================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
