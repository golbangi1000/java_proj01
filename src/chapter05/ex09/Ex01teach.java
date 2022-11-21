package chapter05.ex09;

public class Ex01teach {
	public static void main(String[] args) {
		
		
		// 홍길동 70 88 77 99 이순신 80 68 87 79 김똘똘 60 86 87 30 홍길순 77 56 80 99 
		
		
		
		for(int i = 0 ; i < args.length; i++) {
			if(i % 5 == 0) {		
				if(i != 0 ) { // 처음에 개행 하면 안되니깐 0일때는 제외하고 개행 
					System.out.println();
				}
			}
			System.out.print(args[i] + "\t");  //간단하게 되네 근데 이건 그냥 프린트만 할때 
		}
		
		
		int sum1 = 0 ;
		double avg1= 1.0;
		
		int korSum= 0;
		int engSum = 0;
		int mathSum = 0;
		int sciSum = 0;
		
		for( int i = 4 ; i < args.length; i +=4) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
