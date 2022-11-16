package chapter05.ex06;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		/*
		 * <문제>
		 * 
		 * 2차원 배열 변수 : arr1
		 * arr1[0] <== 2의 배수만 저장
		 * arr1[1] <== 5의 배수만 저장 
		 * arr1[2] <== 3의 배수와 8의 배수를 저장
		 * arr1[3] <== 1부터 시작해서 1씩증가 7의 배수는 저장 안함 
		 * 
		 * 행 4개
		 * 열 100개 
		 */
		
		
		// 1. for 문으로 출력, 2. Enhanced For 문, 3. Arrays.toString 
		int[][] arr1 = new int[4][100];
		
		for(int i = 0 ; i < arr1.length; i++ ) {
			switch(i) {
			case 0:
				for(int j = 1, x = 0; x < arr1[i].length; j++) {
					if(j % 2 == 0) {
						arr1[i][x] = j;
						x++;
					}
				}
				break;

			case 1:
				for(int j = 1, x = 0; x < arr1[i].length; j++) {
					if(j % 5 == 0) {
						arr1[i][x] = j;
						x++;
					}
				}
				break;

			case 2:
				for(int j = 1, x = 0; x < arr1[i].length; j++) {
					if(j % 3 == 0 || j % 8 == 0) {
						arr1[i][x] = j;
						x++;
					}
				}
				break;

				
			case 3:
				for(int j = 1, x = 0; x < arr1[i].length; j++) {
					if(j % 7 != 0) {
						arr1[i][x] = j;
						x++;
					}
				}
				break;
				
				
			}
			
		}
		
		// for 문
		System.out.println("==============For=========================");

		for(int q = 0 ; q < arr1.length;q++) {
			for(int w = 0; w < arr1[q].length; w++){
				System.out.print(arr1[q][w] + " ");
			}
			System.out.println();
		}
		System.out.println();

		// 향상된 for 문
		System.out.println("==============Enhanced for 문=====================");

		for(int[] k : arr1) {
			for(int j : k) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		// Arrays.toString
		System.out.println("==============Arrays.toString======================");
		for( int[] k : arr1) {
			System.out.println(Arrays.toString(k));
		}
		
				
	}
}
