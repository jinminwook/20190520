package ex20190520;

import java.util.*;
public class SetExample {

	public static void main(String[] args) {
		//Set 객체 선언
		Set<String> set = new HashSet<String>();
		set.add("민욱");
		set.add("이는");
		set.add("잘생");
		set.add("기고");
		set.add("귀가");
		set.add("없다");
		//set 객체의 크기값 출력하기
		System.out.println("set 크기 :"+set.size());
		//set 객체에 저장된 데이터 출력하기.
		Iterator<String>iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
