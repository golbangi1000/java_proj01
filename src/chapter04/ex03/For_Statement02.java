package chapter04.ex03;

public class For_Statement02 {
	public static void main(String[] args) {
		/*
		 * FOR문의 특수한 형태 ( 무한 루프)
		 * 	---for 문에서 조건이 생략될 경우 무한 루프 
		 * 
		 */
		//조건이 생략되면 무한로프 메모리가 꽉차서 서버 터질수도있다
		//for(int i = 0; ;  i++) {
		//	System.out.println(i);
		//}
		
		System.out.println("=====================================");
		
		for (int i = 0; ;i++) {
			System.out.println(i + " ");
			if (i > 99) {
				break; //break; 는 if 조건과 같이 사용한다.
			}
		}
		
		
		
		
		
	}
}














