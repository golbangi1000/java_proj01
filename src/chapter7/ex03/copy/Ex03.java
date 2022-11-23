package chapter7.ex03.copy;

public class Ex03 {

	
	public static void main(String[] args) {
		
		
		
		//가변 길이 배열 문제
		/*
		 * 		values[0] : 값이 정수 1 ~ 9 이 들어올때 "파워레벨 1~9입니다"
		 * 		values[1] : 값이 정수 1 ~ 9가 들어올때  "스피드레벨 1~9입니다"
		 * 
		 * 
		 * 
		 * 
		 */
		arrayFlexible(11, 1,5,13);
		
		
		
		
	}
	
	
	
	public static void arrayFlexible(int...values) {
		for(int i = 0; i < values.length;i ++) {
			switch(i) {
			
			case 0: 
				if(values[i] >= 1 && values[i] <=9) {
					System.out.println("파워레벨 " + values[i] + " 입니다");
				} else {
					
					System.out.println("잘못된 입력입니다 1-9사이만 넣으세요");
				}
			break;
			
			case 1:
				if(values[i] >= 1 && values[i] <=9) {
					System.out.println("스피드레벨 " + values[i] + " 입니다");
				} else {
					
					System.out.println("잘못된 입력입니다 1-9사이만 넣으세요");
				}
			break;
			}
		}
		

	}
	
	
	
	
	
}
