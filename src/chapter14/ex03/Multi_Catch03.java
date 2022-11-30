package chapter14.ex03;

public class Multi_Catch03 {
	public static void main(String[] args) {
		
		/*

		 */

			try {
				System.out.println(3/0);
				int[]arr = new int[] {1,2,3};
				
				System.out.println(arr[5]);
				
				int num = Integer.parseInt("20A");
			}catch (NumberFormatException e) {
			}
			catch (ArrayIndexOutOfBoundsException e) {
			}
			catch (ArithmeticException e) {
			}
			catch (Exception e) {//세부적인 Exception이후에 이게 제일 마지막에 오는게 좋다
				
			}
		
	}
}
