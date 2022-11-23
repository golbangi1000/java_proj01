package chapter7.ex02.copy;

import java.util.Arrays;

public class ArrayArgumentMethod {
	
	
	public static void main(String[] args) {
		//메소드의 매개변수 (Argument)가 배열
		
		int[] a = new int[]{1,23,4,12,5,125,125,12,51,251,62,16,};
		printArray(a);
		
		//2.메소드 호출시에 객체를 생성해서 호출
		printArray(new int[]  {12,3,142,142,142,1,4});
		
		//3. 주의 : 오류 발생	
		// 이렇게하면 오류 발생 printArray({11,12,13,14,15});
		
		
		
		
		
		
	}
	
	//매개변수로 배열을 인풋 받는 메소드 
	public static void printArray(int[] a) {
		//1. 배열의 index = 0 마지막 방번호까지 for 문을 사용해서 출력
		
		for( int i =0; i < a.length; i++ ) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		System.out.println("======================================");
		
		for(int i : a) {
			System.out.print( i + " ");
		}
		System.out.println();
		System.out.println("===3. Arrays.toString()");
		
		System.out.println(Arrays.toString(a));
		
		
		
		
		
	}

}
