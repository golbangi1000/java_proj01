package chapter05.ex04;

public class Ex02 {
	public static void main(String[] args) {
		//배열 
		
		//1. 배열 선언 : - 동일한 데이터 타입을 저장. -방의 크기가 지정되면 수정이 불가
		
		int[] arr1;
		arr1 = new int[500];
		
		//배열에 저장된 기본값을 출력: Heap 강제 초기값이 할당됨
		System.out.println("배열의 초기값 출력");
		for ( int i = 0; i <  arr1.length; i++) {
			
			
		}
		
		
		/*
		 *2.배열의 값을 저장
		 *3.배열의 각방에 저장된 내용을 출력  For Enhanced for, Arrays.toString.
		 *
		 */
		//enhanced for 문
		for(int k : arr1) {
			System.out.println();
		}
	}
}
