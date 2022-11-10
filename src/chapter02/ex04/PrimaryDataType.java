package chapter02.ex04;

import java.io.PrintWriter;

public class PrimaryDataType {
	public static void main(String[] args) {
		

	//자료형 : 변수명 앞에 반드시 
	// -기본 자료형 : boolean, byte, short, int , long ,float, double
		// 메모리의 stack 공간에 저장, (변수명 : 값)
	// - 참조 자료형: String, 
		//메모리의 Heap 공간에 변수의 값이 저장됨
		//stack 공간에는 변수명 : Heap의 주소값을 가지고 있따
	// 1. boolean : true, false 
	boolean bool1 = true; //선언과 동시에 변수에 값을 할당
	// 선언후
	boolean bool2 = false;		  // 값 할당
	System.out.println(bool1);
	System.out.println(bool2);
	System.out.println("=================================");
	// 2. 정수 (byte, short, int, long)
		// byte : (1byte = 8bit ) : -2^7 ~ 2^7 -1 : -128 ~ 127
	byte value1 = -128;
	byte value2 = 127;
	System.out.println(value1);
	System.out.println(value2);
	
	//short : 2byte = 16bit) : -2^15 ~ -2^15-1
	
	short value3 = -32768;
	short value4 = 32767;
	
	System.out.println(value3);
	System.out.println(value4);
	
	// int : (4byte = 24bit) : -2^23 ~ 2^23-1 :
	//-2,147,483,648 ~ 2,147,483,647
	
	int value5 = -2147483648;
	int value6 = 2147483647;
	
	System.out.println(value5);
	System.out.println(value6);
	
	// long : 8byte = 64bit : -2^63 ~ 2^63-1
		//long의 변수에 값을 할당 할때는 l, L을 붙여 줘야한다.
		// 붙여주지 않으면 기본적으로 int 형으로 값이 저장됨
	long value7 =-1000L;
	System.out.println(value7);
	
	// 3. 실수 (float, double)
		//실수의 기본은 double
		//float : float으로 지정된 변수의 값을 할당 할때 리터럴에 f, F명시를 해야한다.
	float value8 = 1.212412F;
	System.out.println(value8);
	
	double value9 = 1.241412424124124124124;
	System.out.println(value9);
	
	// 4. 문자 (char)  영문/한글/일본어/ 다 하나씩 
	// 변수의 값을 할당할 리터럴에 ' '
		// 1. char 자료형 변수에 직접 문자로 저장하는 방법 ()

	char value10 = 'A';
	char value11 = '가';
	char value12 = '3';
	char value13 =  'a';
	System.out.println(value10);
	System.out.println(value11);
	System.out.println(value12);
	System.out.println(value13);
		// 2. 정수값으로 저장하는 법 : 아스키 코드 값으로 문자를 저장 
		
	char value15 = 65;	//A
	char value16 = 0xac00; // 0x: 16진수 , 0: 8진수 , 0b: 2진수 
	char value17 = 51; //3
	System.out.println(value15);
	System.out.println(value16);
	System.out.println(value17);
	
		//3. 유니코드로 저장하는 방법
	
	char value18 = '\u0041'; //A
	char value19 = '\uac00'; // 가
	char value20 = '\u0033'; // 3
	
	System.out.println(value18);
	System.out.println(value19);
	System.out.println(value20);
	
	/*
	 * <문제>
	 */
	
	char aa ='\uAE40';	//성		김
	char bb ='\uB3D9';	//이름1	동
	char cc ='\uC6B1';	//이름2	욱


	System.out.println(aa);
	System.out.println(bb);
	System.out.printf("%c%c%c",aa,bb,cc);
	// 5. 문자열 (String)
	
		// 변수의 값을 할당하는 리터럴에 " "
		// 기본자료형이 아니다. 참조 자료형 (객체)
		
	String value21 = "안녕하세요. 오늘은 날씨가 좋다";
	
	System.out.println(value21);
	
	
	
	
	}
}















