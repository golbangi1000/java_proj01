package chapter14.ex03;

public class Ex01 {
	public static void main(String[] args) {
		
		
		/*
		 * 3개의 예외를 하나의 try catch블락에 넣고
		 * 각각에 대해서
		 */
		
//		System.out.println(3/0);
//		int[]arr = new int[] {1,2,3};
//		
//		System.out.println(arr[5]);
//		
//		int num = Integer.parseInt("20A");
		
		try {
			System.out.println(3/0);
			int[]arr = new int[] {1,2,3};
			
			System.out.println(arr[5]);
			
			int num = Integer.parseInt("20A");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수없습니다");
		}catch (NumberFormatException e) {
			System.out.println("바꿀수없습니다");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 ");
		}
		
		try {
			System.out.println(3/0);
			int[]arr = new int[] {1,2,3};
			
			System.out.println(arr[5]);
			
			int num = Integer.parseInt("20A");
		} catch (ArithmeticException| NumberFormatException | ArrayIndexOutOfBoundsException e) {
			System.out.println("모든 예외를 하나로 처리 ");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}
}
