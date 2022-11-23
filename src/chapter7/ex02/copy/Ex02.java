package chapter7.ex02.copy;

import java.util.Arrays;

public class Ex02 {

	
	
	public static void main(String[] args) {
		//
		
		//두 배열의 각 방의 내용을 더해서 출력 하는 메소드 생성
		
		int[] a = new int[300/3];
		int[] b = new int[300/2];
		//배열 a : 4의 배수를 300까지(방번호 아님) 저장
		for(int i = 0,j = 1; i < a.length;j++) {
			if(j % 3 == 0) {
				a[i] = j;
				i++;
			}
		}
		//배열 b : 5의 배수를 저장 300까지 (방번호 아님) 저장 
		for(int i = 0,j = 1; i < b.length;j++) {
			if(j % 2 == 0) {
				b[i] = j;
				i++;
			}
		}
		//두 배열의 각 방의 값을 더해서 출력
		System.out.println(Arrays.toString(addArray(a, b)));
		

		
	}
	
	public static int[] addArray(int[] a, int[] b) {
		if(a.length > b.length) { // a가 더 길경우
			int[] c = new int[a.length];
			for(int i = 0 ; i < b.length; i++) {
				c[i] = b[i];
			}
			for(int i = 0; i < a.length; i++) {
				a[i] = a[i] + c[i];
			
			}
		} else if(b.length > a.length) { //b가 더 길경우 
			int[] c = new int[b.length];
			for(int i = 0 ; i < a.length; i++) {
				c[i] = a[i];
			}
			for(int i = 0; i < b.length; i++) {
				b[i] = c[i] + b[i];
			
			}
		} else {  //배열의 길이가 같을때 
			for(int i = 0; i < b.length; i++) {
				b[i] = a[i] + b[i];
			}
		}
		
		if(a.length > b.length) {
			return a;
		} else {
			return b;
		}
	}
	
	
	
	
}
