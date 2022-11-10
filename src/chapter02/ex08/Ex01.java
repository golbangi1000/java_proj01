package chapter02.ex08;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//<문제> 스캐너를 등록하고,
		// 어머님이름, 아버님 이름, 형제이름, 자신 이름
		// 어머님나이, 아머님 나이, 형제나이, 자신 나이
		
		//콘솔에서 인풋 받은 이름은 모두 출력
		// 나이의 합계와 평균을 출력
		
		String mom;
		String dad;
		String bro;
		String me;
		int nmom;
		int ndad;
		int nbro;
		int nme;
		
		int sum;
		double avg;
		System.out.println("어머니이름");
		mom = sc.next();
		System.out.println("아버지이름:");
		dad = sc.next();
		System.out.println("형제이름:");
		bro = sc.next();
		System.out.println("자신이름:");
		me = sc.next();
		
		System.out.println("어머니나이");
		nmom = sc.nextInt();
		System.out.println("아버지나이");
		ndad = sc.nextInt();
		System.out.println("형제나이");
		nbro = sc.nextInt();
		System.out.println("자신나이");
		nme = sc.nextInt();
		
		sum= nmom + ndad + nbro + nme;
		avg = sum / 4;
		System.out.println(mom +" "+ dad +" "+ bro +" "+ me);
		System.out.println("나이합계" + sum+ " 나이평균"+avg);
		
		
		
		
		
	}

}
