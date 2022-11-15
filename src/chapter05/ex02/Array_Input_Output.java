package chapter05.ex02;

import java.util.Arrays;

public class Array_Input_Output {
	public static void main(String[] args) {
		/*
		 * 배열에 값을 넣고, 출력 하기 
		 */
		System.out.println("======================================");
		
		//배열 변수 선언 및 방 크기 초기화
		int[] arr1 = new int[5];
		
		//직접 해당 방 번호에 값을 할당
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
		
		//직접 방의 번호를 출력
		System.out.println(arr1[0] + " " + arr1[1] + " " + arr1[2] + " " + arr1);
		System.out.println("======1. for 문을 사용해서 대량으로 값을 넣고 값을 출력 하기 ===");
		
		int[] arr2 = new int[100];
		
		//for 문을 사용해서 값 할당 하기 : i : index (방번호)
		for( int i = 0; i < 100; i++) {
			arr2[i] = i + 1;	//각 방에 값을 자동으로 넣는다.
			// arr2[i]의 인덱스에 i+1이 늘어나서 들어난거지 i 에 i + 1이 저장된게 아니다
			// 햇갈리지말자 
		}
		
		for ( int i = 0; i < 100 ; i++) {
			System.out.println(arr2[i]);
		}
		
		for ( int i = 0; i < 10; i++) {
			System.out.println(arr2[i]);
		}
		
		
		System.out.println("======3. Enhanced For (향상된 For 문====================");
		//Enhanced For: 배열의 각방의 값을 출력 할때 쉽게 출력 할수 있다. 
		
		int[] arr3 = new int [100];
		
		//for 문을 사용해서 7의 배수만 저장 
		for(int i = 0, j = 7; i < 100; i++,j+=7) {
			arr3[i] = j;
		}
		
		//각 방의 내용을 for 문을 사용해서 출력 
		for(int i = 0; i < 100; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		
		
		System.out.println("향상된 for문");
		
		for ( int k : arr3) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("=========Arrays.toString(배열변수)=============");
		//Arrays.toString(arr3)
			//Arrays: 객체
			//toString(): 메소드
				//메소드 : 객체 지향언어에서 함수를 메소드 (method)라고 호칭한다
		
		System.out.println(Arrays.toString(arr3));
		
		
		System.out.println(arr3.length);
	
		
		
	}
}
















