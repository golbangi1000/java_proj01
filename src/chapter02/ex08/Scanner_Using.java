package chapter02.ex08;

import java.util.Scanner;

public class Scanner_Using {
	public static void main(String[] args) {
		//Scanner 사용법 : 이클립스에서 콘솔로 값을 인풋 받을수가 있다
		// -- 콘솔로 값을 받아서 변수에 저장하고 값을 출력할수있다
		// 스캐너 선언
		//객체 객체 변수= 객체 생성 
		//ctrl+ shift + o 하면 에러 임포트 단축키
		Scanner sc = new Scanner(System.in);
		
		
		//사용할 변수 선언 : 스캐너(콘솔)로 인풋 받아서 저장할 변수 선언
		String name;	//이름 저장하는 변수
		int kor;
		int eng;
		int math;
		int music;
		int sci;
		int sum;
		double avg;
		
		
		
		System.out.print("이름을 입력하세요>>>");
		name = sc.next();
		System.out.print("국어점수를 입력하세요>>>");
		kor = sc.nextInt();
		System.out.print("영어점수를 입력하세요>>>");
		eng = sc.nextInt();
		System.out.print("수학점수를 입력하세요>>>");
		math = sc.nextInt();
		System.out.print("음악점수를 입력하세요>>>");
		music = sc.nextInt();
		System.out.print("과학점수를 입력하세요>>>");
		sci = sc.nextInt();
		
		
		sum = kor + eng + math + music + sci;
		avg =  sum /5;
		System.out.println("당신의이름은" + name + "이고");
		System.out.println("합계:"+sum + " 평균:" + avg);
		
		
		
		
		
		
	}
}
