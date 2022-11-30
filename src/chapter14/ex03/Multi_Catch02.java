package chapter14.ex03;

public class Multi_Catch02 {
	public static void main(String[] args) {
		try {
			System.out.println(3/0);
			int[]arr = new int[] {1,2,3};
			
			System.out.println(arr[5]);
			
			int num = Integer.parseInt("20A");
		} catch (Exception e) {
			
			 
			System.out.println(e.getMessage());// 간략한 정보를 출력 
			e.printStackTrace();  //자세한 정보를 출력
		}
	}
}
