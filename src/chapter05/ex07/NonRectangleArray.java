package chapter05.ex07;

import java.util.Arrays;

public class NonRectangleArray {
	public static void main(String[] args) {
		/*
		 * 비정방형 배열 ( 2차원)
		 * 		-정방형 배열 : 모든 행에 대해서 동일한 여을 가지고 있는 배열
		 * 		-비정방형 배열 : 각행 에 대해서 열의 갯수가 각각 다른 배열 
		 * 
		 * 
		 * 
		 */
		
		//1. 비 정방형 배열 선언 : 초기 배열 선언시 행의 갯수만 정의 하고 열의 갯수는 나중에 각각 다르게 정의 
		int [][] arr1 = new int[2][];	// 2. initialize rows only
		
		// 2. 각 행에 대해서 열의 정의
		arr1[0] = new int [2]; //arr1의 0행의 열의 갯수를 2개로 지정
		System.out.println(Arrays.toString(arr1[0]));	
		System.out.println(Arrays.toString(arr1[1]));		

		arr1[0][0] = 1;
		arr1[0][1] = 1;
		
		arr1[1] = new int [3];
		
		arr1[1][0] = 1;
		arr1[1][1] = 1;
		arr1[1][2] = 1;


		
		// 3. 각 행의 값을 출력
		
			for( int i = 0 ; i < arr1.length;i++) {
				for(int j = 0; j < arr1[i].length; j++) {
					System.out.println(arr1[i][j] + " ");	
				}
				System.out.println();
			}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
