package chapter03.ex02;

public class BitwiseOperator {
	public static void main(String[] args) {
		//다양한 진법 표현과 비트연산자
		// 1. 자바 코드를 사용해서 진법 변환 (10진수,16진수,8진수,진수)
		int data =13;
		System.out.println(Integer.BYTES);
		System.out.println(Integer.toBinaryString(data)); //2진수로 변환
		System.out.println(Integer.toOctalString(data)); //8진수로 변환
		System.out.println(Integer.toHexString(data)); //16진수로 변환
		
		//2. 2진수, 8진수, 16진수 ===> 10진수로 변환
		System.out.println(Integer.parseInt("1101", 2));//13, 2진수
		System.out.println(Integer.parseInt("15", 8)); //13, 8진수
		System.out.println(Integer.parseInt("d", 16));//13, 16진수
		
		//3. 다양한 진법을 표현 (0b : 2진수, 0 : 8진수, 0x : 16진수
		System.out.println(0b1101);	//13
		System.out.println(015);	//13
		System.out.println(0xd); 	//13
		
		// 4. 비트 연산자 (AND)
			//4-1, AND  
		    //0 & 0 , 1&0,
			System.out.println();
			//4-2, OR  |
		
		
			//4-3, XOR ^
			
			
			//4-4 NOT( ~)
			System.out.println(~3); //-4
			System.out.println(~10); //
	}
}
