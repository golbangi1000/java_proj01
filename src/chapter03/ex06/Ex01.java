package chapter03.ex06;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 * <문제> 스캐너로 정수 값을 인풋 받고 인풋 받은 정수값이 홀수이면 "홀수" 라고 출력 하고
		 * 인풋 받은 값이 짝수이면 "짝수" 하고 출력
		 */
		
		int num;
		String answer;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 주세요");
		num = sc.nextInt();
		answer = (num % 2 == 1) ? "홀수" : "짝수";
		System.out.println(answer);
		
	

		
		
		
	}
}
