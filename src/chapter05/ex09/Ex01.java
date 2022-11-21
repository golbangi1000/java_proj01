package chapter05.ex09;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 *	 		
		 *
		 *	args: 홍길동 70 88 77 99 이순신 80 68 87 79 김똘똘 60 86 87 30 홍길순 77 56 80 99 
		 * 
		 */
		/*
		 * 주석 잘쓰기 
		 * 
		 * 
		 */
		int sum = 0;
		int count = 0;
		int count2 = 0;
		int[] sum1 = new int[4];
		int[] kor = new int[4];
		int[] eng = new int[4];
		int[] math = new int[4];
		int[] sci = new int[4];
		String[] name = new String[4];
		
		for(int i = 0; i < args.length; i++) {
			if(i % 5 != 0) {
				sum += Integer.parseInt(args[i]);
				count++;
			}
			if(count == 4) {
				sum1[count2] = sum;
				count2++;
				count = 0;
				sum = 0;
			}
		}
		for(int i = 0; count < 4; i+=5) {
			if(i % 5 == 0) {
				kor[count] = Integer.parseInt(args[i+1]);
				eng[count] =Integer.parseInt(args[i+2]);
				math[count]=Integer.parseInt(args[i+3]);
				sci[count]=Integer.parseInt(args[i+4]);
				name[count] = args[i];
				count++;
			}
		}
		
		count = 0;
		count2 = 0;
		
		System.out.println("===============================================================");
		System.out.println("이름\t" + "국어\t" +"영어\t" +"수학\t" +"과학\t" +"합계\t" +"평균\t");
		for(int i = 0; i < args.length;i++) {
			System.out.print (args[i] + "\t");
			count++;
			if(count % 5 == 0 ) {
				System.out.print(sum1[count2] + "\t");
				System.out.println((double)sum1[count2]/4);
				count2++;
				count = 0;
			}
		}
		System.out.println("===============================================================");

		System.out.print("합계\t");
		
		int[] sum2 = new int[4];
		double[] sum3 = new double[4];
		for(int i = 0; i < 4;i++) {
			if(i == 0) {
				sum = 0;
				for(int j = 0 ; j < kor.length;j++) {
					sum+= kor[j];
				}
				sum2[i] = sum;
				sum3[i] = (double)sum/4;

				System.out.print(sum +"\t");
			} else if( i == 1) {
				sum = 0;
				for(int j = 0 ; j < kor.length;j++) {
					sum+= eng[j];
				}
				sum2[i] = sum;
				sum3[i] = (double)sum/4;

				System.out.print(sum +"\t");
			} else if(i == 2) {
				sum = 0;
				for(int j = 0 ; j < kor.length;j++) {
					sum+= math[j];
				}
				sum2[i] = sum;
				sum3[i] = (double)sum/4;

				System.out.print(sum +"\t");
			} else if(i == 3) {
				sum = 0;
				for(int j = 0 ; j < kor.length;j++) {
					sum+= sci[j];
				}
				sum2[i] = sum;
				sum3[i] = (double)sum/4;

				System.out.print(sum +"\t");
			}
		}
		sum = 0;
		for(int i = 0 ; i < sum1.length;i++) {
			sum += sum1[i];
		}
		System.out.print(sum + "\t");
		double sum5 = 0;
		for(int i = 0 ; i < sum3.length;i++) {
			sum5 += sum3[i];
		}
		System.out.print(sum5 + "\t");

		System.out.println();
		System.out.print("평균\t");
		for(int i = 0; i < sum2.length;i++) {
			System.out.print((double)sum2[i]/4 + "\t");
		}	
		sum5 = 0;
		for(int i = 0 ; i < sum1.length;i++) {
			sum5 += sum1[i];
		}
		System.out.print(sum5/4 + "\t");
		sum5 = 0;
		for(int i = 0 ; i < sum3.length;i++) {
			sum5 += sum3[i];
		}
		System.out.print(sum5/4 + "\t");	
	}
}








