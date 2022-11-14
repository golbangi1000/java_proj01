package chapter04.ex05;

public class Do_While_Statement {
	public static void main(String[] args) {
		/*
		 * do ~ while 문: 실행문을 조건과 상관 없이 한번은 실행시킨후 조건에 따라 반복
		 * while 문 : 	조건에  만족해야지만 실행블락을 실행한다.
		 * 
		 * 
		 * 
		 * 
		 * do while 문
		 * 초기식;
		 * do  {
		 *  	실행블락;
		 *  	증감식;
		 *  } while(조건);
		 *  
		 */
		
		//1.while 문
		int a = 0;
		while (a < 0) {		//조건이 false이므로 실행이 안됨
			System.out.println(a);
		}
		
		//2. do while 문
		System.out.println("do while 문");
		a = 0;
		do {
			System.out.println(a + " ");
		} while (a < 0);
		
		//3. 반복 횟수가 10번인 경우 while 문과 do while문 비교
		
		a = 0;
		while ( a< 10) {
			System.out.print(a);
			a++;
		}
		System.out.println();
		System.out.println("==================do while문 ================");
		a = 0;
		do {
			System.out.print(a);
			a++;
		} while (a < 10);
		
	}
}















