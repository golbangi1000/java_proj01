package chapter17.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod {
		public static void main(String[] args) {
			List<Integer> aList1 = new ArrayList();
			
			//1.add( E element)	: List에 값을 추가할때
			aList1.add(3);
			aList1.add(5);
			aList1.add(2);
			System.out.println(aList1);
			
			
			//2. add(int index, E element) : 특정 방전호에 값을 넣는다.
			aList1.add(2,6); // 방번호 1에 6값을 넣겠다
			System.out.println(aList1);
			
			//3. addAll(다른 리스트객체)
			List<Integer> aList2 = new ArrayList();
			aList2.add(1); 
			aList1.add(2);
			
			System.out.println(aList2);
			aList2.addAll(aList1);
			System.out.println(aList2);
			
			//4. addAll(int index, 또 다른 리스트객체)
			List<Integer> aList3 = new ArrayList<>();
			
			aList3.add(1);
			aList3.add(2);
			
			
			System.out.println(aList3); //1,2
			aList3.addAll(1, aList3); // 1번방 뒤에 할당 
			
			System.out.println(aList3);
			
			//5. set(int index, E element) : 기존의 방의 값을 수정
			aList3.set(0, 5);
			aList3.set(1, 6);
			
			System.out.println(aList3);
			
			//6. remove(int index)
			aList3.remove(1);
			System.out.println(aList3);
			
			//7. remove(Object o) 방에 들어간 값으로 삭제
			aList3.remove(new Integer(5)); //오류는 아니고 경고 
			System.out.println(aList3);
			
			
			//8. clear() : 모든 값을 삭제
			aList3.clear();
			System.out.println(aList3);
			
			//9. isEmpty(): 값이 없으면 : true, 값이 존재하면 : false
			System.out.println(aList3.isEmpty()); //true
			
			//10. size()
			
			//11. get(int index) 방번호의 값을 가져올때 
			
			//12. toArray() List ==> Array(배열로 변환)
			aList3.add(1);
			aList3.add(2);
			aList3.add(3);
			Object[] obj = aList3.toArray();
			
			System.out.println(Arrays.toString(obj));
			
			
			//13. toArray(T[]t) --> T[] 리스트==>배열
			
			Integer[] int1 = aList3.toArray(new Integer[5]);//방크기를 키워서 하면 null값이 있음
			System.out.println(Arrays.toString(int1));
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

}
