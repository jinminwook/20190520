package ex20190520;
import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		//map��ü ����
		//key�� String,value�� int �� �� ��
		Map<String,Integer> map =new HashMap<String,Integer>();
		//key�� String,value�� String ���� �� ��
		Map<String,String> map1=new HashMap<String,String>();
		//key�� int,value�� String�� �� ��
		Map<Integer,String> map2=new HashMap<Integer,String>();
	
	//Map ��ü�� ������ �����ϱ�
	map.put("ù��°",1000);
	map.put("�ι�°",2000);
	map.put("����°",3000);
	
	map1.put("ù��°","ù��°������");
	//map ��ü ũ�� ����ϱ�
	System.out.println("map ũ��  : "+map.size());
	//map�� ����� ������ ��������
	System.out.println(map.get("ù��°"));
	//map ��ü�� ��� ��ü ������ ����ϱ�
	Set<String>keySet = map.keySet();
	Iterator<String> keyIterator = keySet.iterator();
	while(keyIterator.hasNext()) {
		String key = keyIterator.next();
		int value = map.get(key);
		System.out.println(key+":"+value);
	}
	}

	
	

}
