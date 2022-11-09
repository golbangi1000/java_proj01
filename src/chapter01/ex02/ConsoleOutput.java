package chapter01.ex02;

public class ConsoleOutput {
	public static void main(String[] args) {
		//콘솔에서 다양한 출력 방법
		//1. System.out.println(); 라인 개행
			//출력시 문자열을 출력 할때는 
		System.out.println("안녕하세요");
		System.out.println("안녕" + "하세요");
		System.out.println(2+4);
		
		System.out.println("문자"+ 1 + 2);  //문자12
		System.out.println(1+2+"문자");  // 3문자
		
		System.out.println("========변수에 값을 할당후 출력========================================");
		//변수선언 : 자료형 변수명 = 변수의 값 
		int a = 5; 
		
		System.out.println(a);
		
		String b = "하세요";
		
		System.out.println(b);
		
		System.out.println("안녕" + b);
		
		
		System.out.println(a + "안녕" + b + 2);
		
		
		System.out.println("================================================");
		//2. System.out.print(); 라인 개행안함
		System.out.print("반갑");
		System.out.print("습니다\n");
		System.out.print("반갑\n");
		System.out.print("\t습니다\n");
		
		
		
		//2.System.out.printf();  , 뒤의 변수값을 ""안으로 가져옴.
			// \n : 엔터, \t : tab
		
		
		// %d   : 뒤의 정수를 불러 올떄 사용 (10진수)
		System.out.printf("오늘의 날짜는 %d 월 %d 일입니다\n", 11, 07);
		
		// %o : 뒤의 8진수 값을 불러올때 사용
		System.out.printf("8진수 10을 불러옵니다: %o   \n", 10);
		
		// %x : 뒤의 값을 16진수로 불러올떄 사용
		System.out.printf("뒤의 값을 16진수로 불러옵니다: %x   \n", 10);
		
		// %s : 뒤의 문자열을 가지고 옵니다
		
		System.out.printf("%s 은 %s가 매우 매우 %s 니다\n", "오늘","날씨","맑습");
		
		// %f : 문자열 뒤의 실수 값 불러올때 사용
		// %4.2f : 4 : 전체 4자리, 2소숫점이하 2자리까지 잘라서 출력
		System.out.printf("나의 몸무게는 %f입니다\n", 75.12345678);
		System.out.printf("나의 몸무게는 %4.2f입니다\n", 75.1234567);
		
		System.out.printf("오늘의 온도는 %f도이고, %s %f 입니다", 17.33, "나의 몸무게는 ", 75.5);
		
		
		
	}
}
