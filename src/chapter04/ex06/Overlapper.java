package chapter04.ex06;

public class Overlapper {
	public static void main(String[] args) {
		//제어문의 중복
		//1. if 구문내의 if 구문
		
		System.out.println("========if - if================================================");
		int value1 = 5;
		int value2 = 3;
		
		
		if( value1 > 5) {			//false
			if(value2 < 2) {
				System.out.println("실행1");
			}	else {
				System.out.println("실형2");
			}
		} else {	//false  실행 블락 
			System.out.println("실행3");
		}
		
		System.out.println("======================================================");
		
		int value3 = 2;
		 switch (value3) {
		 case 1:
			 for(int k = 0; k < 10 ; k++) {
				 System.out.println(k + " ");
			 }
			 System.out.println();
			 break;
		 case 2:
			 for(int k = 10; k > 0 ; k--) {
				 System.out.println(k + " ");
			 }
			 System.out.println();
			 break;
		 }
		
		 for(int i = 0; i < 3 ; i++) { //3번 루프 , 0, 1, 2
			 System.out.println("i : " + i + "일때");
			 for (int j = 0; j < 5; j++) { //5번 루프 0,1,2,3,4
				 System.out.println(i + "," + j);
				 
				 if(i == j) {
					 System.out.println("i == j =>" + i + " : " +  j);
				 }
				 
			 }
		 }
		 System.out.println();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}







