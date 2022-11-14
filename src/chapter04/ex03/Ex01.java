package chapter04.ex03;

public class Ex01 {
	public static void main(String[] args) {
		//<문제> : i * j = 1 단출력
		/*
		 *  1 * 1 = 1
		 *  1 * 2 = 2
		 *  ....
		 *  1 * 9 = 9
		 */
		System.out.println("============for 문을 사용해서 1단 출력====================");
		
		for (int i = 1 ; i <= 9; i ++) {
			System.out.println("1 * " + i +" = " + i);
		}
		System.out.println();
		System.out.println("============================");
		for(int i = 2, j = 1; j <= 9; j++) {
			System.out.println(i + " * " + j + " = " + j*i);
		}
	}
}
