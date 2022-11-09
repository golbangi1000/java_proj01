package chapter02.ex02;

public class NamingVariable {
	public static void main(String[] args) {
		//변수 이름 지정 하기
		//	-변수명은 소문자로 시작(권고), 클래스이름은 대문자로 시작 (필수)
		// -변수명으로 한굴을 사용할 수 있따. (권장하지 않는다)
		// - 변수며응로 특수문자는 _, $ 만 사용 가능
		// - 변수명으로 숫자는 사용 가능하나 변수명 첫자리에 숫자가 오면 오류
		// - 변수명으로 자바에서 사용하는 예약어 (package, class, public...)
		boolean aBcD;
		aBcD = true;
		System.out.println(aBcD);
		
		byte 가나다라; // 1byte의 데이터만 저장
		short _abcd; // _, $를 사용할수있다
		char a3bcd;
		long abcd3;
		//예약어는 variable로 사용 불가 
		//variable에 공백도 불가 
		int myWork; // variable이름엔 camelCase 쓰는게 좋다.
		String myClassName; 
		
		// 상수 : 값을 넣으면 그 값을 변화 하지 못하도록 설정
			// - 상수명은 전체를 대문자 지정 (권장)
		
		final double PI = 3.141492;		//변수 : PI 변수에 값을 변화 시켜 줄수 있다.
		
		System.out.println(PI);
		//PI = 123.456;  상수라서 이렇게하면 오류뜸
		final int MY_DATA;
		MY_DATA = 11;
		System.out.println(MY_DATA);
		
		
		
		
		
	}
}
