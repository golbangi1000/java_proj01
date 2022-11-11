package chapter04.ex02;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 *  <문제> switch 문을 사용하여 프로그램 하세요.
		 *  	스캐너로 
		 *  정수 1를 인풋 받으면 "금메달입니다" 출력
		 *  2를 인풋 받으면 "은메달입니다 출력
		 *  3을 인풋 받으면 동메달입니다 출력
		 *  그외 값을 인풋 받으면 메달이 없습니다 출력	
		 */
		int medal;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("1,2,3 숫자중 하나를 주세요");
		medal = sc.nextInt();
		switch(medal) {
		case 1:
			System.out.println("금메달입니다");
			break;
		case 2:
			System.out.println("은메달입니다");
			break;
		case 3:
			System.out.println("동메달입니다");
			break;
		default:
			System.out.println("메달이 없습니다");
		}
		
		
		/*
		 *  문제 Ex02
		 *  스캐너로 gold를 인풋 받으면 금매달입니다 출력
		 *  bronze를 인풋 받으면 동매달입니다 출력
		 *  그외 값을 인풋 받으면 메달이 없습니다 출력
		 */
		String medal2;
		
		System.out.println("gold, silver, bronze중 하나를 타입해주세요");
		medal2 = sc.next();
		
		
		switch(medal2) { //case 여러개를 넣을수 있따 이렇게 
		case "gold": case "Gold" : case "GOLD": case "GoLD": case "GOlD":
			System.out.println("금메달입니다");
			break;
		case "silver":
			System.out.println("은메달입니다");
			break;
		case "bronze":
			System.out.println("동메달입니다");
			break;
		default:
			System.out.println("메달이 없습니다");
		}
		
		/*
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
	}
}
