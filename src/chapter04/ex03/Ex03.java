package chapter04.ex03;

public class Ex03 {
	public static void main(String[] args) {
		/*
		 * <문제> : 2중 for문을 사용해서 1단 ~ 9단 출력 print \t
		 * 1단
		 * 1 * 1 =1 탭 1 * 2 = 2 탭 1 * 3 = 3..........	1 * 9
		 * 2단
		 * ........
		 * 9단
		 */
		
		for( int i = 1; i <= 9; i++) {
			System.out.println(i + "단");
			for(int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + i*j +"\t");
			}
			System.out.println();
			System.out.print("\n");
		}
		
		
		//printf() 를 사용해서 출력 부분을 간결하게 처리
		//printf()를 쓰면 좀 짧아짐 
		System.out.println("===========printf()======================");
		
		
		
	}
}
