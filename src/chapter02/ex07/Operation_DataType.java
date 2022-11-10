package chapter02.ex07;

public class Operation_DataType {
	public static void main(String[] args) {
		//같은 자료형 간의 연산 vs 다른 자료형 간의 연산
		
		//1. 같은 자료형 간의 연산
		
		float data1 = 3.0f + 5.0f;

		System.out.println(data1);
		
		double data4 = 8/5.0;
		System.out.println(data4); //정수 8이 자동으로 double로 업캐스팅되고 연산
		// 1.6
		
		double data3 = 8/5.0;	// 정수 8이 double 형으로 업캐스팅이 일어나서 연산
		System.out.println(data3);		//1.6
		
		//주의 : 평균을 계산 할떄 double
		
		System.out.println("======================================");
		
		
		//2. 다른 자료형 간의 연산 ( 작은 자료형은 높은 자료형으로 업캐스팅이 자동으로 일어나고 연산)
		
		//int data5 =  5 + 3.5; 오류 발생
		double data6 = 5 + 3.5; // 5.0 + 3.5
		
		int data7 = 5 + (int) 3.5;
		
		int data8 = (int) (5 + 3.5); //결과값은 double이고 int로 바뀜
		
		System.out.println(data8);
		
		
		double data9 = 5/2.0;	//5가 double형으로 바뀜
		System.out.println(data9);
		
		double data10 = 5/2;
		System.out.println(data10); // 2.0
		
		int data11 = 50;
		double data12 = 33.33;
		
		System.out.println(data11 + data12);
		
		
		System.out.println(data11 + data12); //double
		System.out.println(data11 / data12);
		System.out.println(data11/(int)data12);
		
		/*
		 * <문제>
		 * 
		 * 국어 90 수학 88 영어 77 음악 90 과학 99
		 * 각 과목의 점수를 int의 변수를 만들어서 저장후 : 합계 , 평균 
		 * 
		 */
		
		double sum = 0;
		double avg = 0;
		
		int kor = 90;
		int math = 88;
		int eng = 77;
		int music = 90;
		int sci = 99;
		
		sum = kor + math + eng + music + sci;
		avg = sum / 5;
		
		System.out.println("합계:" + sum + " 평균:" + avg );
		
		
		
		
		
		
		
	}
}
