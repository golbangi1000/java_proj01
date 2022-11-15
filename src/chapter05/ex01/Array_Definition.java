package chapter05.ex01;

public class Array_Definition {

	public static void main(String[] args) {
			/*
			 * 자료형 : 변수를 선언시 변수에 할당할 값을 정의 
			 * 		-기본 자료형 : boolean byte short int long float double char
			 * 				-메모리의 Stack rhdrksdp 변수와 값이 저장됨
			 * 		-참조 자료형 : 배열 , 엵, 클래스/인터페이스
			 * 				-메모리의 Stack공간에 변수명과 참조주소
			 * 				-변수에 들어갈 값은 Heap 영역에 저장됨 
			 * 
			 * 변수 - 변수에는 하나의 값만 저장됨
			 * 배열 - 하나의 배열 변수에 많은 값을 저장 할수 있다.
			 * 	   - 배열의 특징 : 1.배열 변수의 동일한 자료형의 값만 저장할수있따 
			 * 					2. 배열은 방의 갯수가 정의 되면 수정이 불가능
			 * 		-배열의 초기값을 할당 하지 않더라도 강제로 초기값이 할당됨.
			 * 		-Heap 공간에는 값이 반드시 할당되어야 된다.
			 * 
			 * 
			 * 
			 * 
			 */
		
		//1. 변수  - 선언과 동시에 값 할당
		int a = 10;
		
		//2. 변수 - 선언 이후 값할당
		int b; 			//선언
		b  = 20;		// 값 할당
		int c;
		int d;
		
		
		int[] array1 = new int[3];
		
		//array1: 변수명은 Stack에 저장 array1에 Heap 영여그이 주소값 저장
		//new : Heap 영역에 값을 저장하라
		//int[3] : Heap 영역에 저장할 방의 갯수를 지정 
		//배열에 값 할당.
		array1[0] = 55;
		array1[1] = 66;
		array1[2] = 77;
		
		System.out.println("0번쨰값:" + array1[0]);
		
		int[] array2;
		array2 = new int[5];
			//array2 배열 변수에 값을 넣고 출력;
		array2[0] = 55;
		array2[1] = 66;
		array2[2] = 77;
		array2[3] = 88;
		// 오류 : 예외 발생
		// - 컴파일 시 오류 : 이클립스에서 자동으로
		// - 실행시 오류가 발생:
		
		int array3[] = new int[4];
		int[] array4 = new int[4];
		
		System.out.println(array2[2]);
		
		
		//배열 선언과 동시에 값 할당
		int[] array5 = new int[]{1,2,3,4,5};
		//값을 할당할떄 방크기까지 선언하면 에러가남
		
		
		//배열을 선언 후 값 할당.
		int[] array7;
		array7 = new int[] {1,2,3,4,5};
		
		
		System.out.println("==========배열 : 1. 선언 방법================");
		
		
		//new int[] 가 생략돼도 됨
		int[] array8 = {11,22,344,25,25,25,25};
		//근데 선언과 값을 분리시 오류 발생
		
		
	}

}

















