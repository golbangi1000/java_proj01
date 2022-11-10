package chapter03.ex03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		//<실습문제>
		/*  p.jangwooo@gmail.com
		 * 정수 2개를 Scanner로 인풋 받고 두값이 같으면 true를 다르면 false 출력
		 * 이름 2개를 Scanner로 인풋 받고 두값이 같으면 true를 다르면 false를 출력
		 * 
		 * 		등가연산자 사용.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		
		System.out.println("정수1");
		a = sc.nextInt();
		System.out.println("정수2");
		b = sc.nextInt();
		System.out.println(a==b);
		String aName;
		String bName;
		System.out.println("String값1");
		aName = sc.next();
		System.out.println("String값2");
		bName = sc.next();
		System.out.println(aName.equals(bName));
		
		/*
		 * 그냥 print한번하고 한꺼번에 받고 그다음에 프린트 하는것도됨
		 * 더 짧고 좋은듯 
		 * 설명도 넣긴해야 좋을듯
		 */
		System.out.println("정수2개 String2개");
		a = sc.nextInt();
		b = sc.nextInt();
		aName = sc.next();
		bName = sc.next();
		//이렇게하면 한꺼번에 공백넣고 넣을수 있음 ex. 1 1 홍길동 홍길동
		System.out.println(a==b);
		System.out.println(aName.equals(bName));
		
	}
}














