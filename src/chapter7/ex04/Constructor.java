package chapter7.ex04;

//생성자 오버로딩


class Ab{
	//필드 인스턴스 필드 객체를 생성후 호출
	int m;
	int n;
	int l;
	int k;
	
	
	//생성자:
	
	Ab(){
		
	}
	
	Ab(int m){
		this.m = m;
		System.out.println("매개변수: " + m); 
	}
	
	Ab(int m, int n	){
		this.m = m;
		this.n = n;
	}

	public Ab(int m, int n, int l) {
		super();
		this.m = m;
		this.n = n;
		this.l = l;
	}
	
	
	
	
	
	
	
	
}








public class Constructor {

		
	
	
	public static void main(String[] args) {
		
		Ab ab1 = new Ab(1,3,4);
		
		Ab ab2 = new Ab();
		
		
	}

}
