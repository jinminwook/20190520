package ex20190520;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		/*
		 * List �� �̸� 5���� �Է¹޾Ƽ� 
		 * ���� �� �̸��� ����ϼ���.
		 * 
		 */
		   ArrayList<String> list = new ArrayList<String>();
		      Scanner scan= new Scanner(System.in);
		      for(int i=0;i<5;i++) {
		         System.out.println(i+1 +"��° ���ڿ� �Է��ϼ���. ");
		         String word = scan.next();
		      list.add(word);
		      }
		      //�Էµ� ���� Ȯ��
		      String max="";
		      for(int i=0; i<list.size();i++) {
		    	  System.out.println(list.get(i));
		      }
		         int longWord=0;
		         for(int k=1;k<list.size();k++) {
		         if(list.get(longWord).length()<list.get(k).length()) {
		         longWord = k;
		      }
		      }
		      System.out.println("���� �� ���ڿ� �̸�:"+list.get(longWord));
	}
}

