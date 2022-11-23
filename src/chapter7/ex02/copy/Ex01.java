package chapter7.ex02.copy;

import java.util.Arrays;

public class Ex01 {

	
	public static void main(String[] args) {
		//메소드 매개 변수로 배열을 Argument로 인풋
		
		
		// 1 ~ 100 까지 3의 배수의 배열을 생성후 메소드 호출 , 정수 5
		int[] a = new int[100/3];
		//100번방까지가 아니라 100까지 
		int[] b = new int[100/7];

		
		for(int i = 0, j = 1; i < a.length;j++) {
			if(j % 3 == 0) {
				a[i] = j;
				i++;		
			}
		}
		for(int i = 0, j = 3; i < b.length; i++,j+=3) {
			b[i] = j;
		}
		System.out.println(Arrays.toString(a));
		
		System.out.println(Arrays.toString(print(a, 5)));
		//1 ~ 100 까지 7의 배수만 저장하고 정수 2를 던져주기 
		
		for(int i = 0, j = 1; i < b.length;j++) {
			if(j % 7 == 0) {
				b[i] = j;
				i++;
				
			}
		}
		for(int k : b) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(print(b, 2)));
		
		int[] c = multiArray(200, 9);
		System.out.println(Arrays.toString(c));
		
	}
	
	
	
	/*
	 * 메소드 static , 매개변수로 정수 1, 배열 1개를 인풋 받아서
	 * 각 방의 배열의 값을 인풋받은 정수로 곱해서 출력하는 배열
	 */
	
	public static int[] print(int[] a, int b){
		
		for(int i = 0; i < a.length;i++) {
			a[i] *= b;
		}
		return a;
	}
	
	
	// maxCount방의 갯수 multi는 배수 정해주기 ex.5의배수 3의 배수 등등. 
	public static int[]	multiArray(int maxCount, int multi) {
		int[] a = new int[maxCount/multi];
		for(int i = 0, j = 1; i < a.length;j++) {   //j 배수를 저장하는 변수 
			if(j %  multi == 0) {
				a[i] = j;  //multi의 배수만 담겠다 
				i++;
			}
		}
		
		return a;
	}
}
















