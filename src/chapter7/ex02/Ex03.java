package chapter7.ex02;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		
		int [] a = new int[500/7];
		int [] b = new int[500/9];
		//배열 a : 7의 배수를 저장하는 배열 1에서 500까지 
		 for(int i = 0, j = 7; i < a.length;i++,j+=7) {
			 a[i] = j;
		 }
		 System.out.println(Arrays.toString(a));
		 
		//배열 b : 9의 배수를 저장하는 배열 1에서 500까지 
		 for(int i = 0, j = 9; i < b.length;i++,j+=9) {
			 b[i] = j;
		 }
		 System.out.println(Arrays.toString(b));
		
		//두 배열의 각방의 값을 더해서 출력 
		
		
		
		
		
		
		
		
	}
	
	
	
	//두 배열을 인풋 받아서 각 방의 값을 더해서 출력 하는 메소드 
	
	
	
	public static void arraySum(int[] a, int[] b) {
		int[] c = new int[71];  // c : 두 배열의 각 방의 값을 더해서 저장하는 배열 변수 
		for ( int i = 0 ; i < a.length; i++) {  //0번 부터 70번까지
			for ( int j = 0 ; j < b.length; j++) {
				if( i > 54) {  // i 가 다른거 길이보다 길때 a[i]가 더 긴 경우니깐 b[i]대신 0을 넣는다 
					c[i] = a[i] + 0;
				}
				
				if(i == j ) { // i 랑 j 가 같을때만 돔 
					c[i] = a[i] + b[i];
					
				}
			}
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
