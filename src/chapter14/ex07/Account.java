package chapter14.ex07;

class BalanceException extends Exception{
	public BalanceException() {
		super();
	}
	public BalanceException(String message) {
		super(message);
	}
}


public class Account {
	private long balance = 1000;
	public Account() {
		
	}
	public long getBalance() {  //getter
		return balance;
	}
	
	
	public void deposit(int money) {  // 기존의 잔고에서 money를 인풋받고 
		balance += money;
	}
	
	
	//예외 처리
	public void withdraw(int money) throws BalanceException {
		//잔고가 money보다 적은 경우 잔고 부족이라고 강제로 예외를 발생 시킴
			//예외 메세지: "잔고가 부족합니다" 라고 출력
			// BalanceException <== 사용자 정의 예외를 생성해서
		
		if(money <= balance) {
			System.out.println("현재예금잔고:" + balance + "출금 요청 금액:" + money);

			balance -= money;
		} else if(money > balance) {
			throw new BalanceException("잔고가 부족합니다");
		}
		
	}
	
	public static void main(String[] args) {
	Account a = new Account();
		
		System.out.println(a.getBalance());
		
		try {
			a.withdraw(1000);
		} catch (BalanceException e1) {
			e1.printStackTrace();
		}
		System.out.println(a.getBalance());

		try {
			a.withdraw(0);
		} catch (BalanceException e1) {
			e1.printStackTrace();
		}
		System.out.println(a.getBalance());
		try {
			a.withdraw(10111010);
		} catch (BalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}
