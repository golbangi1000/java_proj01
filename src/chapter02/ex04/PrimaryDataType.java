package chapter02.ex04;

public class PrimaryDataType {
	public static void main(String[] args) {
		

	//자료형 : 변수명 앞에 반드시 
	// -기본 자료형 : boolean, byte, short, int , long ,float, double
	// - 참조 자료형: String, 
	
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
	
	// 4. 문자 (char)
	// 변수의 값을 할당할 리터럴에 ' '
	char value10 = 'A';
	char value11 = '가';
	char value12 = '3';
	char value13 =  'a';
	System.out.println(value10);
	System.out.println(value11);
	System.out.println(value12);
	System.out.println(value13);
	
	
	// 5. 문자열 (String)
		// 변수의 값을 할당하는 리터럴에 " "
	
	
	}
	
}
