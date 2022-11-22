package chapter7;


class Aa{
	int m1;
	int m2;
	int m3;
	int m4;
	
	Aa(){
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	Aa(int a){
		m1 = a;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	Aa(int a, int b){
		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4;
	}
	Aa(int a, int b, int c){
		m1 = a;
		m2 = b;
		m3 = c;
		m4 = 4;
	}
	
	
	//이렇게하면 길어짐 
	void print() {
		System.out.println(m1+ " " + m2 + " " + m3 + " " + m4);
	}

}

class Bb{
	
	int m1,m2,m3,m4;
	Bb(){
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	Bb(int a){
		this();
		m1 = a;
	}
	
	Bb(int a, int b){
		this(a);
		m2 = b; //m1 = a 는 위에 있어서 ㄱㅊ
	}
	
	Bb(int a , int b , int c){
		this(a,b);
		m3 = c; // m2 = b는 또 위에거에 있어서 ㄱㅊ
	}
	
	Bb(int a, int b, int c, int d){
		this(a,b,c);
		m4 = d; //m3= c는 바로 위에거에 있음 
	}
	//메소드 : 필드의 내용을 
	void print() {
		System.out.println(m1 + " " + m2 + " "+ m3 + " "+ m4 + " ");
	}
	
}



public class This_Method02 {
	public static void main(String[] args) {
		
		Aa a1 = new Aa();
		a1.print();
		
		Aa a2 = new Aa(1);
		a2.print(); 
		
		
		
		
		
		//2. Bb 클래스 
		
		//this() 메소드를 사용해서 생성자 호출
		//기본생성자 호출
		
		System.out.println("===========Bb클래스=======");
		
		
		Bb b1 = new Bb();
		
		b1.print();
		
		Bb b2 = new Bb(13);
		
		b2.print();
		
		Bb b3 = new Bb(11,12);
		
		b3.print();
		
		
		Bb b4 = new Bb(15,16,17);
		
		b4.print();
		
		Bb b5 = new Bb(21,142,117,124);
		
		b5.print();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
