package chapter12.ex02;

public class Cat implements Animal{
	@Override
	public void cry() {
		System.out.println("야옹");
	}
	@Override
	public void run() {
		System.out.println("고양이는 달리다 ");
	}
}
