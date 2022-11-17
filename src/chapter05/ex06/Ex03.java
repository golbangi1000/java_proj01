package chapter05.ex06;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		//2차 정방형 배열
		
		
		// 1. 배열의 선언
		
		int[][] arr1 = new int[5][100];
		
		System.out.println(arr1.length);// 5, arr1.length : number of rows
		System.out.println(arr1[0].length); //100, arr1[0].length : number of columns 
		
		

		
		
		// 3. 배열의 값을 출력 하기 ( for - for)
		for ( int i = 0; i < arr1.length; i++) {
			for(int j = 0 ; j < arr1[i].length ; j++) {
				
			}
		}
		
		System.out.println("================Enhanced for 문으로 출력 ==================");
		// 4. Enhanced for 문을 사용해서 값 출력
		for( int [] k : arr1) {
			for ( int b : k) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		//5. Arrays.toString () < == 1차원 배열의 값을 출력
			// arr1: 2차원 배열
		
		for( int[] k : arr1) {
			System.out.println(Arrays.toString(k));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
