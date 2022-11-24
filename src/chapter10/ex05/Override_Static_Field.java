package chapter10.ex05;

class Aa{
	static int m =3;
}

class Bb extends Aa{
	static int m = 4;
}



public class Override_Static_Field {
	public static void main(String[] args) {
		/*
		 * static field 오버라이딩 안됨
		 *  
		 *  메모리의 클래스 영역에 값이 존재함 
		 *  
		 *  
		 */
		
		System.out.println(Aa.m);
		System.out.println(Bb.m);
		
		
		
		Aa aa = new Aa();
		Bb bb = new Bb();
		Aa ab = new Bb();
		
		System.out.println(aa.m);//3
		System.out.println(bb.m);//4
		System.out.println(ab.m);//3 
		
		
		
		
		
		
	}
}
