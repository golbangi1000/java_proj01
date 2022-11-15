package chapter05.ex04;

public class PrimaryDataType_VS_ReferenceDataType {
	public static void main(String[] args) {
		//기본 데이터 타입과 첨조 데이터 타입의 비교
		
		//1. 기본 데이터 타입에서 대입 연산 (Stack 값을 복사)
		int value1 = 3;
		int value2 = value1;
		
		System.out.println(value1);	//3
		System.out.println(value2);	//3 ===> 7
		
		//2. 참조 데이터 타입에서 대입 연산 (Stack의 값(Hepa영역의 주소를 복사))
		
		int[] arr1 = new int[] {3,4,5};
		int[] arr2 = arr1; 
		
		arr2[0] = 7;
		
		System.out.println(arr1[0]); //Heap 값을 복사하는것이 아니라 주소를 복사
		System.out.println(arr2[0]); //arr1의 Stack의 주소값을 복사해버림 
		
		
		System.out.println("=====================================");
		
		
		
		//객체의 Heap 영역에 주소 출력 
		System.out.println(arr1);	//Heap 영역의 16진수의 Hashcode  <== Heap 영역의 메모리 주소값
		System.out.println(arr2);
		
		
		
		
		
		
		
		
		
	}
}
