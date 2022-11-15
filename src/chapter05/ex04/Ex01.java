package chapter05.ex04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		/*
		 * <문제> 
		 */
		
		Scanner sc = new Scanner(System.in);
		int a;
		int[] arr1;
		while(true) {
			System.out.println("=======================================================================");
			System.out.println("1. 인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장후 출력");
			System.out.println("2. 인풋 값을 받아서 방의 크기를 지정하고 1씩증가하도록 값을 넣는데 4배수만 빼고 저장후 출력");
			System.out.println("3. 인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 그중 6의 배수만 뺌");
			System.out.println("4. 프로그램 종료");
			System.out.println("=======================================================================");
			a = sc.nextInt();
			
			
			if(a == 1) {
				System.out.println("배열 길이를 정수로 주세요");
				a = sc.nextInt();
				arr1 = new int[a];
				for(int i = 0, j = 1; i < arr1.length; j++) {
					if(j % 7 == 0 || j % 8 == 0) {
						arr1[i] = j;
						i++;
					}
				}
				System.out.println(Arrays.toString(arr1));
				
				
			} else if(a ==2) {
				System.out.println("배열 길이를 정수로 주세요");
				a = sc.nextInt();
				arr1 = new int[a];
				for(int i = 0, j =0; i < arr1.length; j++) {
					if(j % 4 != 0) { // 0 % 4 == 0?
						arr1[i] = j;
						i++;
					}	
				}
				System.out.println(Arrays.toString(arr1));


			} else if (a == 3) {
				System.out.println("배열 길이를 정수로 주세요");
				a = sc.nextInt();
				arr1 = new int[a];
				
				for(int i = 0,j = 3; i < arr1.length; j+=3) {
					if(j % 6 != 0) {
						arr1[i] = j;
						i++;
					}
				}
				System.out.println(Arrays.toString(arr1));
				

			}else if(a ==4) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("1~4중에 하나의 숫자만 주세요");
			}
		}
		
		
		
		
		
		
		
		
		
	}
}
