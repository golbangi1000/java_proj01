package chapter05.ex08;

public class Ex02 {
	public static void main(String[] args) {
		/*
		 *  main method의 배열 변수 args로 실수 값 넣어서 계산 하기 
		 *  args : 합계 10.2 20.5 30.5 40.5 77.7 88.123 99.345 65.123
		 *  
		 *  
		 */
		
		double sum = 0;
		for(int i = 1; i < args.length;i++) {
			sum += Double.parseDouble(args[i]);
		}
		
		
		// printf를 써서 3자리수까지 하면 더 보기 좋다
//		The %0,10.3f  format specifier breaks down like this:
//
//			The number generated totals 10 characters in width, including the sign, radix and grouping comma.
//			Zero padding on the left ensures all 10 characters are used.
//			Precision is to two decimal places.
//			A comma groups large numbers by the thousands.
		System.out.println(sum);
		System.out.printf(args[0] + ": %.3f " , sum);
		
	}
}
