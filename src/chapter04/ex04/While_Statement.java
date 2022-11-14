package chapter04.ex04;

public class While_Statement {
	public static void main(String[] args) {
		/*
		 * while 문 : 반복문
		 * 
		 * 
		 * while(조건){
		 * 	실행블락;
		 * 	증감식;
		 * }
		 */
		
		
		//1. While ansdml rlqhs ansqjq rnwh
		int a = 0;
		while(a < 10) {
			System.out.println(a++);
		}
		
		
		System.out.println();
		System.out.println("===============================================");
		
		
		//while 문 vs for문으로 처리
		a = 100;
		while(a >2) {
			System.out.println(a-=2);
		}
		
		for(int i = 100; i> 0 ; i-=2) {
			System.out.println(i);
		}
		//답
		int c = 100;
		while(c > 0) {
			System.out.println(c + " ");
			c-=2;
		}
		
		
		System.out.println("===========while에서 무한루프===================");
		
		boolean ab = true;
		int d = 0;		//기본 자료형은 반드시 초기값이 할당되어 있어야 한다.
		while(ab) {
			System.out.println("무한 루프");
			
			if(d > 100) {
				break;
			}
			d++;
		}
		System.out.println("while문 빠져나옴");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
