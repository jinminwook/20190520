package ex20190520;
import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		//map객체 선언
		//key가 String,value를 int 로 할 때
		Map<String,Integer> map =new HashMap<String,Integer>();
		//key를 String,value를 String 으로 할 때
		Map<String,String> map1=new HashMap<String,String>();
		//key를 int,value를 String로 할 때
		Map<Integer,String> map2=new HashMap<Integer,String>();
	
	//Map 객체에 데이터 저장하기
	map.put("첫번째",1000);
	map.put("두번째",2000);
	map.put("세번째",3000);
	
	map1.put("첫번째","첫번째데이터");
	//map 객체 크기 출력하기
	System.out.println("map 크기  : "+map.size());
	//map에 저장된 데이터 가져오기
	System.out.println(map.get("첫번째"));
	//map 객체에 담긴 전체 데이터 출력하기
	Set<String>keySet = map.keySet();
	Iterator<String> keyIterator = keySet.iterator();
	while(keyIterator.hasNext()) {
		String key = keyIterator.next();
		int value = map.get(key);
		System.out.println(key+":"+value);
	}
	}

	
	

}
