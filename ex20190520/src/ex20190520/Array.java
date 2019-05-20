package ex20190520;


import java.util.*;
public class Array {

	public static void main(String[] args) {
		/*
		 * Collection Framework
		 * 1.List
		 * 	-������ �����ϰ� ������ �� ����.
		 * 	-�ߺ� ������ ������.
		 * 2.Set
		 * 	-�����ϴµ� ������ ����.
		 * 	-�ߺ� ������ �Ұ���
		 * 3.Map
		 * 	-key,value �� ������ �����.
		 * 	-key ���� �ߺ� �Ұ���.
		 * 
		 */
		//Array List ����
		List<String> list = new ArrayList <String>();
		/*
		 * <������ Ÿ��> : ���׸� (Generic)
		 * 	-���ŷο� Ÿ�� ��ȯ�� ������ ��.
		 * 
		 * ���׸��� ��������ʰ� list ��ü�� ���� �ؼ� ���
		 */
		List list1 = new ArrayList();
		list.add("�����ٶ�");
		Object obj = list.get(0);
		String value = (String)obj;
		System.out.println(value);
		
		//list ��ü�� ������ ����
		list.add("Java");
		list.add("�ο�");
		list.add("īƮ");
		list.add("�ϳ���");
		list.add(2, "��ġ��");
		//List �� ũ�� ���
		System.out.println("list �� ũ�� : "+list.size());
		
		//list�� ��� ������ ���
		System.out.println("ù��° ������ : "+list.get(0));
		System.out.println("ù��° ������ : "+list.get(1));
		System.out.println("ù��° ������ : "+list.get(2));
		System.out.println("ù��° ������ : "+list.get(3));
		
		for(int i=0;i<list.size();i++) {
			System.out.println(i+"��° ������ : "+list.get(i));
		}
		System.out.println("-----------------------");
		//������ ���� 
		list.remove(2);
		list.remove(2);
		for(int i=0;i<list.size();i++) {
			System.out.println(i+"��° ������ : "+list.get(i));
		}
		
	}

}
