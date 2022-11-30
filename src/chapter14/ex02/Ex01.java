package chapter14.ex02;

public class Ex01 {
	public static void main(String[] args) {
		
		int[] arr= new int[] {1,2,3,4};
		//실행시 예외 발생:
		
		
		try {
			System.out.println(arr[5]);

		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutofboundsException 걸림");
		} finally {
			System.out.println("무조건 되는곳 ");
		}
		System.out.println("프로그램종료");
		
		
		
	}
}
