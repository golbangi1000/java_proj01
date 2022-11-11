package chapter04.ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		/*
		 * 1월 ~ 12월까지 월을 인풋 받아서 해당월의 일수를 출력해주면 됩니다.
		 * 1월 31
		 * 2월 28
		 *  month 월은 day 일 입니다
		 */
		
		
		int month;
		int day = 30;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1월~12월중에 하나를 타입해주세요 월은뺴고 ex. 1월은 1");
		month = sc.nextInt();
		
		
		switch(month) {
		case 1: case 3: case 5:case 7:case 8:case 10:case 12:
			day = day + 1 ;
			System.out.println(month+"월은 " + day + "일 입니다" );
			break;
		case 2: 
			day = day -2;
			System.out.println(month+ "월은 " + day + "일 입니다" );
			break;
		case 4:case 6:case 9:case 11:		
			System.out.println(month+ "월은 " + day + "일 입니다" );
			break;
		}
		
		
		/*
		 * 선생님 방법 더 짧음
		 * print는 마지막에 하나만 두고
		 * 그냥 다른 day만 계산하고 break;하고 돌게 하면 됨 
		 * 짧은게 좋다 
		 */
		day = 30;
		switch(month) {
		case 1: case 3: case 5:case 7:case 8:case 10:case 12:
			day = day + 1 ;
			break;
		case 2: 
			day = day -2;
			break;
		case 4:case 6:case 9:case 11:		
			break;
		}
		System.out.println(month+ "월은 " + day + "일 입니다" );

	}
}




