package ex20190520;

import java.util.*;
public class SetExample {

	public static void main(String[] args) {
		//Set ��ü ����
		Set<String> set = new HashSet<String>();
		set.add("�ο�");
		set.add("�̴�");
		set.add("�߻�");
		set.add("���");
		set.add("�Ͱ�");
		set.add("����");
		//set ��ü�� ũ�Ⱚ ����ϱ�
		System.out.println("set ũ�� :"+set.size());
		//set ��ü�� ����� ������ ����ϱ�.
		Iterator<String>iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
