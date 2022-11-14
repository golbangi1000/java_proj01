package chapter04.ex03;

public class Ex02 {
	public static void main(String[] args) {
		/*
		 * <문제> 2중 포문을 사용해서 1단 ~ 19단 까지 출력
		 * 3의 배수단을 출력
		 */
		for( int i = 1 ; i <=19; i ++) {
			System.out.println(i + "단");
			for( int j = 1; j <=19; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}
		
		System.out.println("================================================");
		for(int i = 3; i <= 19; i+=3) {
			System.out.println(i + "단");
			for(int j = 1; j <= 19; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}
	}
}
