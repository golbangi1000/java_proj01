package chapter02.ex02;

public class NamingVariable {
	public static void main(String[] args) {
		//변수 이름 지정 하기
		//	-변수명은 소문자로 시작(권고), 클래스이름은 대문자로 시작 (필수)
		// -변수명으로 한굴을 사용할 수 있따. (권장하지 않는다)
		// - 변수며응로 특수문자는 _, $ 만 사용 가능
		// - 변수명으로 숫자는 사용 가능하나 변수명 첫자리에 숫자가 오면 오류
		boolean aBcD;
		aBcD = true;
		System.out.println(aBcD);
		
		byte 가나다라; // 1byte의 데이터만 저장
		short _abcd; // _, $를 사용할수있다
		
	}
}
