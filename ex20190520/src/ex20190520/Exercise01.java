package ex20190520;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		/*
		 * List 에 이름 5개를 입력받아서 
		 * 가장 긴 이름을 출력하세요.
		 * 
		 */
		   ArrayList<String> list = new ArrayList<String>();
		      Scanner scan= new Scanner(System.in);
		      for(int i=0;i<5;i++) {
		         System.out.println(i+1 +"번째 문자열 입력하세요. ");
		         String word = scan.next();
		      list.add(word);
		      }
		      //입력된 내용 확인
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
		      System.out.println("가장 긴 문자열 이름:"+list.get(longWord));
	}
}

