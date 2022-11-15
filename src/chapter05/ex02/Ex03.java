package chapter05.ex02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		/*
		 *  스캐너로 배열의 방번호를 인풋 받습니다.
		 *  배열 변수 : arr1 , 2의 배수를 저장후 출력   enhanced for문을 사용해서 출력
		 *  배열 변수 : arr2, 3의 배수를 인풋 받아서 출력 for문을 사용해서 출력
		 *  
		 *  .length 기억하기
		 *  
		 *  
		 */
		
		
		Scanner sc = new Scanner(System.in);

		
		int[] arr1;
		int[] arr2;

		int a;
		
		System.out.println("Array 방갯수를 정수로 주세요");
		a = sc.nextInt();
		arr1 = new int[a];
		for(int i = 0,j = 1; i < arr1.length;j++) {
			if(j % 2 == 0 ) {
				arr1[i] = j;
				i++;
			}
		}
		for(int k : arr1) {
			System.out.print(k + " ");
		}
		
		
		System.out.println();
		
		
		System.out.println("Array 방갯수를 정수로 주세요");
		a = sc.nextInt();
		arr2 = new int[a];

		for(int i = 0,j = 1; i < arr2.length;j++) {
			if(j % 3 == 0 ) {
				arr2[i] = j;
				System.out.print(arr2[i] + " ");
				i++;
			}
		}
		
		/*
		 * 선생님 방법
		 * 이건 그냥 하나만 있으니깐 그냥 j 써서 더하기로 짧게 할수있음 
		 * 틀릴 경우가 없으니깐 그런듯
		 * 처음부터 2나 3을 넣어서 그냥 더하면서 넣으면 중간이 빌일이 없다.
		 * 더 짧고 좋음 
		 */
		System.out.println("Array 방갯수를 정수로 주세요");
		a = sc.nextInt();
		
		/*
		 * 숫자 물어보고 바로 그냥 새로만들어서 초기화하고
		 * 바로 저렇게 넣어버리고 그다음에 출력하면 짧고 좋은듯 
		 */
		int[] arr5 = new int[a];
		for ( int i = 0, j= 2; i < arr5.length; i++, j+=2) {
			arr5[i] = j;
		}
		
		for ( int i = 0, j= 3; i < arr5.length; i++, j+=3) {
			arr5[i] = j;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
