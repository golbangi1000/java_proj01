package chapter7.ex03.copy;

import java.util.Arrays;

public class FlexibleSizeArrayArgument {
	
	
	public static void main(String[] args) {
		//가변길이 배열 매개변수 처리, Argument로 전소오디는 배열의 길이가 다이나믹하게 가변적으로 변화됨
		
		
		
		method1(1,2,3,123,151,16);
		System.out.println("======================================");
		method2("awef", "fawefwa", "ㅀㅇㅎㅇㅎ","ㅎㅈㅎㅁ");
		method2( "안녕", "하세요", "하하하");
		
	}

	





	public static void method1 (int...values) { //values를 쓰면 여러가지값을 던져줄수있다 
	System.out.println(Arrays.toString(values));
}

	public static void method2 (String...values) {
		for(int i = 0 ; i < values.length;i++) {
			System.out.print(values[i] + " ");
		}
		System.out.println();
	}




}