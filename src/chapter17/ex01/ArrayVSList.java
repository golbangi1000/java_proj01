package chapter17.ex01;

import java.util.ArrayList;
import java.util.List;

/*
 *  배열과 컬렉션의 차이점
 *  	1. 배열: -동일한 타입을 저장.
 *  			-바으이 크기가 고정: 방의 크기를 수저잉 불가능하다. 방의 크기가 고정
 *  	2. 컬렉션 :  - 동일한 타입을 저장.
 *  				-제너릭 타입, 객체를 생성시에 타입을 지정해서 저장.
 *  				-방의 크기가 고정되어있지 않다. 자동으로 늘어나고 자동으로 줄어든다.
 */




public class ArrayVSList {
	public static void main(String[] args) {
		String[] arr = new String[] {"가","나","다","라","마"};
		
		System.out.println(arr.length);
		
		
		//List는 인터페이스다 
		List<String> aList = new ArrayList<>();
		
		//List : 방의 크기를 알려주는 메소드: size();
		System.out.println(aList.size());
		
		
		//ArrayList에 값넣기 
		aList.add("가");
		aList.add("나");
		aList.add("다");
		aList.add("라");
		aList.add("마");
		aList.add("바");
		aList.add("사");
		aList.add("악");
		
		System.out.println(aList.size());
		
		
		/*
		 * 방의 값을 출력하기
		 * 모든 컬렉션은 객체 자체를 출력시 Object 클래스의 toString()이 재정의 되어있따
		 */
		System.out.println(aList);
		
		aList.remove("다");
		System.out.println(aList );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
}
