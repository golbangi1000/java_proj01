package chapter04.ex01;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		int select;
		Scanner sc = new Scanner(System.in);

		int kor;
		int eng;
		int math;
		int sum;
		int avg;
		int a;
		
		String aName;
		String bName;
		
		
		
		System.out.println("==========================================");
		System.out.println("1. 학점의 합계/평균 | 2. 홀수/짝수 | 3. 같은 이름 식별");
		System.out.println("===========================================");
		System.out.println("위의 번호를 선택하세요.>>>");
		select = sc.nextInt();
		
		if(select == 1) { //점수 합이랑 평균 알려주는 선택지
			System.out.println("국어 영어 수학 점수를 순서대로 점수들 사이에 공백을 넣어서 적어주세요");
			kor = sc.nextInt();
			eng = sc.nextInt();
			math= sc.nextInt();
			sum = kor + eng + math;
			avg = sum/3;
			System.out.println("합계:" + sum + "평균:" + avg);
			
		} else if(select ==2) {   //홀짝 알려주는 선택지
			System.out.println("정수 하나를 주세요");
			a = sc.nextInt();
			System.out.println((a % 2 == 0)? "짝수" : "홀수");
			
		} else if(select ==3) {  //같은 이름인지 식별 
			System.out.println("이름 사이에 공백을 넣어서 이름 두개를 주세요 ");
			aName = sc.next();
			bName = sc.next();
			System.out.println( (aName.equals(bName))? "같은이름" : "다른이름" );
			
		} else {
			System.out.println("없는 선택지");
		}
		
		
		
		
		

		
	}
}
