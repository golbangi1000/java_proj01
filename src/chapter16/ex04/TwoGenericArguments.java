package chapter16.ex04;



/*
 * 제너릭 클래스 : 타입변수가 2개인 베너릭 클래스 <K, V>
 * T 타입 Type
 * K 키 Key
 * V value
 * N Number
 * 
 * 
 *
 */
//제너릭 클래스 
class KeyValue<K,V>{
	private K key;
	private V value;
	
	
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	
	
}




public class TwoGenericArguments {
	public static void main(String[] args) {
		//1. <String,Integer>	 타입으로 객체 생성
		KeyValue <String, Integer> kv1 = new KeyValue<>();
		
		//setter를 사용해서 값 할당
		kv1.setKey("사과");
		kv1.setValue(1000);
		
		
		//getter를 사용해서 값 출력 
		String key1 = kv1.getKey();
		
		System.out.println("key: "+ key1 + "value:" + kv1.getValue());
		System.out.println("key:" + kv1.getKey());
		
		System.out.println("====================================================");
		
		
		//2. <Integer, String> 
		KeyValue<Integer, String> kv2 = new KeyValue<>();
		
		
		//setter를 사용해서 값입력
		kv2.setKey(404);
		kv2.setValue("오류");
		System.out.println(kv2.getValue() + " " +kv2.getKey());
		
		
		//3. <String, Void>	 <== Void : 해당 필드를 사용하지 않음
		KeyValue<String, Void> kv3 = new KeyValue<>();
		kv3.setKey("키 값만 사용");
		System.out.println(kv3.getKey());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
