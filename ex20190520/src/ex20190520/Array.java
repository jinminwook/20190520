package ex20190520;


import java.util.*;
public class Array {

	public static void main(String[] args) {
		/*
		 * Collection Framework
		 * 1.List
		 * 	-순서를 유지하고 저장할 수 있음.
		 * 	-중복 저장이 가능함.
		 * 2.Set
		 * 	-저장하는데 순서가 없음.
		 * 	-중복 저장이 불가능
		 * 3.Map
		 * 	-key,value 의 쌍으로 저장됨.
		 * 	-key 값은 중복 불가능.
		 * 
		 */
		//Array List 선언
		List<String> list = new ArrayList <String>();
		/*
		 * <데이터 타입> : 제네릭 (Generic)
		 * 	-번거로운 타입 변환을 제거해 줌.
		 * 
		 * 제네릭을 사용하지않고 list 객체를 선언 해서 사용
		 */
		List list1 = new ArrayList();
		list.add("가나다라");
		Object obj = list.get(0);
		String value = (String)obj;
		System.out.println(value);
		
		//list 객체에 데이터 저장
		list.add("Java");
		list.add("민욱");
		list.add("카트");
		list.add("하나더");
		list.add(2, "새치기");
		//List 의 크기 출력
		System.out.println("list 의 크기 : "+list.size());
		
		//list에 담긴 데이터 출력
		System.out.println("첫번째 데이터 : "+list.get(0));
		System.out.println("첫번째 데이터 : "+list.get(1));
		System.out.println("첫번째 데이터 : "+list.get(2));
		System.out.println("첫번째 데이터 : "+list.get(3));
		
		for(int i=0;i<list.size();i++) {
			System.out.println(i+"번째 데이터 : "+list.get(i));
		}
		System.out.println("-----------------------");
		//데이터 삭제 
		list.remove(2);
		list.remove(2);
		for(int i=0;i<list.size();i++) {
			System.out.println(i+"번째 데이터 : "+list.get(i));
		}
		
	}

}
