package chapter7;

class Product{
	//이너 클래스 
	/*
	 * 클래스 내의 클래스 
	 */
	
	String proName;
	int proNo;
	int proPrice;
	int proCount;
	
	public Product() {
		super();
	}

	public Product(String proName, int proNo, int proPrice, int proCount) {
		//생성자 리턴 타입이 존재하지 않는다 
		//다른 생성자가 존재할 경우 반드시 명시해 줘야 한다.
		//객체를 생성시 생성자 호출. 필드의 기본값을 할당. 
		this.proName = proName;
		this.proNo = proNo;
		this.proPrice = proPrice;
		this.proCount = proCount;
	}

	public Product(String proName, int proNo) {
		super();
		this.proName = proName;
		this.proNo = proNo;
	}
	
	
	//메소드
	void print() {
		System.out.println("제품 이름 : " + proName);
		System.out.println("제품 번호 : " + proNo);
		System.out.println("제품 가격 : " + proPrice);
		System.out.println("제품 갯수 : " + proCount);

	}
	
	
	
	
	
}


public class Product_Test {

	
	int b = 7;
	
	
	public static void main(String[] args) {
		Product p = new Product();
		
		//인스턴스 화 
		p.print();
		
		
		Product p1 = new Product("삼성모니터", 2134,12314,12);
		
		p1.print();

	}
}
















