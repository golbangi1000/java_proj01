package chapter05.ex05;

import java.util.Arrays;

public class RectangleArrayDefinition {
	public static void main(String[] args) {
		// 다차원 배열 ( 2차원 배열)
		/*
		 *  - 정방형 배열		: row(행) 에 대해서 열 (column)이 동일한 배열 
		 *  - 비정방형 배열	: row(행) 에 대해서 열 (column)이 동일 하지 않는 배열
		 *  
		 */
		
		// 1. 정방형 배열 선언 방법
		int [][] arr1 = new int[3][4];   //3 : 행의 갯수
									     //4 : 열의 갯수 
		
		//배열의 각 방에 값을 넣기
		
		arr1[0][0] = 10;
		arr1[0][1] = 20;
		arr1[0][2] = 30;
		arr1[0][3] = 40;

		arr1[1][0] = 50;
		arr1[1][1] = 60;
		arr1[1][2] = 70;
		arr1[1][3] = 80;

		arr1[2][0] = 90;
		arr1[2][1] = 100;
		arr1[2][2] = 110;
		arr1[2][3] = 120;
		
		//2차원 배열의 방의 값 출력 하기
		System.out.println(arr1[2][3]);
		
		
		//2. 정방형 배열 선언 2
		int arr2[][]= new int [3][4];
		int arr4[][];
		arr4 = new int[3][4];
		
		
		//이런방식
		int[][] arr5;
		arr5 = new int[3][4];
		
		
		
		
		
		//4. 정방형 배열 선언과 동시에 값넣기   <<<주의>>> 방크기를 지정하면 오류 발생 
		int [][] arr11 = new int[][] {{1,2,3}, {4,5,6}};
		
		
		int [][] arr12;
		arr12 = new int[][] {{11,223,34,45}, {142,1,152,125}};
		
		
		
		
		//5. 정방형 배열 선언과 동시에 값넣기 2
		int[][] arr13 = {{100,110,120}, {120,1401,150}};
		
		
		
		
		System.out.println(arr13.length);
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				arr13[i][j] = j;
			}
		}
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arr13[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
