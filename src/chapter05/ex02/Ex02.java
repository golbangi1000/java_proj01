package chapter05.ex02;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		//<문제> 배열 변수 : arr1 , 배열의 방의 갯수 : 500개
		// 배열방에 3의 배수또는  5의 배수를 저장 
		//출력 ; 1. for, 2. Enhnaced for, 3. arrays tostring()
		
		int[] arr1 = new int[500];
		int[] arr2 = new int[500];

		
		//그냥 for 문 3의배수 또는 5의 배수를 저장 후 출력 
		for(int i = 0, j= 1; i < 500; j++) {
			if(j % 3 == 0 || j % 5 == 0) {
				arr1[i] = j;
				System.out.print(arr1[i] + " ");
				i++;
			} 
			
		}
		//선생님의 방법
		int x = 0;
		for (int a = 1; a < 3000; a++) {
			if( a % 3 ==0 || a % 5 == 0) {
				arr2[x]=a;
				x++;
			}
			if(x>499) {
				break;
			}
		}
		
		
		System.out.println();
		//향상된 for 문 출력
		for(int i : arr1) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// Arrays.toString 출력
		System.out.println(Arrays.toString(arr1));
		
	}
}
