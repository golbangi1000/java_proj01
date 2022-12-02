package chapter16.ex07;

abstract class Fruit{
	abstract void print(); //추상 메소드, 객체의 필드 정보를 출력
}

class Apple extends Fruit{
	private String name;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//프린트 오버라이딩
	@Override
	void print() {
		System.out.println(name + price);
	}
	
	
}

class Banana extends Fruit{
	private String name;
	private int price;
	@Override
	void print() {
		System.out.println(name + price);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}


class Pencil{
	private String name;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

//제너릭 클래스 : Fruit만 저장할수있는 제너릭 클래스 
class GenericClass<T extends Fruit> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}




public class Ex01 {
	public static void main(String[] args) {
		GenericClass<Apple> g1 = new GenericClass<>();
		g1.setT(new Apple());
		g1.getT().setName("사과");
		g1.getT().setPrice(1234);
		
		g1.getT().print();
		
		//객체 미리 만들고 주입하는것도 ㄱㅊ 
		GenericClass<Banana> g2 = new GenericClass<>();
		g2.setT(new Banana());
		g2.getT().setName("바나나");
		g2.getT().setPrice(12345);
		
		g2.getT().print();
		
		// Fruit을 extends 했으니깐 Fruit 자녀클래스나 Fruit아니면 안됨 
		//GenericClass<Pencil> g2 = new GenericClass<>();
		//GenericClass<Double> g3 = new GenericClass<>();
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
