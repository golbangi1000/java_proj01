package chapter16.ex10;
import java.lang.Math;
//제넉릭 클래스 / 제너릭 메소드를 사용해서 두점의 좌표 값으로 넓이를 구하는 프로그램 작성.

//두점의 좌표를 처리하는 클래스 생성 <제너릭 클래스>

class Point <X extends Number , Y extends Number>{
	X x;
	Y y;
	public Point() {} //기본 생성자 
	
	public Point(X x, Y y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//getter 만 생성 
	public X getX() {
		return x;
	}
	public Y getY() {
		return y;
	}
	
}
//제너릭 메소드 : 일반클래스내에 제너릭 메소드 

class GenericMethod{
	
	
	//makeRectangle메소드를 호출했을때 
	// 안바꾸고 할려면 (double)쓰기 
	public static <T extends Number,V extends Number> double makeRectangle(Point<T,V> p1,Point<T,V> p2) {
		double area = (p1.getX().doubleValue()- p2.getX().doubleValue()) * (p1.getY().doubleValue() - p2.getY().doubleValue());
		area = Math.abs(area);
		return area;
	}

}





public class Ex01 {
	public static void main(String[] args) {
		//두점의 좌표를 저장하는 p1, p2 
		Point<Number,Number> p1 = new Point<>(10.12, 11);
		Point<Number,Number> p2 = new Point<>(111,4);
		
		
		//makeRectangle를 호출하면서  makeRectangle(p1,p2) 리턴값으로 넓이를 리턴해줌 
		System.out.println(GenericMethod.makeRectangle(p1, p2));

	}
}











