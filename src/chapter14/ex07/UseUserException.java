package chapter14.ex07;


/*
 * 사용자 정의 예외
 * 
 * 1. 점수가 음수이면 예외 발생 시키는 사용자 정의 예외
 * 
 * 2.점수가 100점을 초과하는 경우 사용자 정의 예외
 * 
 */

//1. 점수가 음수이면 예외 발생 시키는 사용자 정의 예외
class MinusException extends Exception{
	public MinusException() {
		super();
	}

	public MinusException(String message) {
		super(message);
	}
	
}
//2.점수가 100점을 초과하는 경우 사용자 정의 예외

class OverException extends Exception{
	public OverException() {
		super();
	}
	public OverException(String message) {
		super(message);
	}
	
}



class Aa{
	void checkScore(int score) throws MinusException, OverException {
		if(score < 0) {
			//일반 예외기 때문에 예외 처리를 해줘야됨 
			throw new MinusException("예외가 발생됨: 음수값 입력 불가함");
		} else if(score > 100) {
			throw new OverException("예외가 발생됨 : 100점을 넘을수 없음");
		} else {
			System.out.println("정상값입니다");
		}
	}
}










public class UseUserException {
	public static void main(String[] args) {
		Aa a1 = new Aa();
		
		try {
			a1.checkScore(124 );
		} catch (MinusException | OverException e) {
			e.printStackTrace();
		}
		
		
	
		
	}
}











