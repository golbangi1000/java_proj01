package chapter05.ex08;

public class Ex01 {
	
	public static void main(String[] args) {
		/*
		 * <문제>
		 * 		-args  : 합계 40 77 99 100 200 
		 * 
		 * 
		 * 	합계: <정수를 더한 값을 출력> 
		 */
		
//		int a = Integer.parseInt(args[1]);
//		int b = Integer.parseInt(args[2]);
//		int c = Integer.parseInt(args[3]);
//		int d = Integer.parseInt(args[4]);
//		int e = Integer.parseInt(args[5]);
		int sum = 0;

		for(int i = 1; i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}
	
		System.out.println(args[0] + ":" + sum);
		
		System.out.println("=========================");
		System.out.println("합계" + 1 + 2 + 3); //합계123
		System.out.println(1 + 2 + 3 + "합계" ); //6합계 
	}
}
