package mycom.mytest;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		//순서있게 데이터를 저장/탐색(관리)하는 자료구조
		//순서를 관리하는 기술 = index
		//CollectionFramework의 클래스들은 데이터를 Object 형태만 관리한다.
		ArrayList list = new ArrayList();
		list.add(new Integer(10)); //-로 그어둔 명령어는비권장사항임
		list.add(20); //사실 add에서 자동으로 해주기 때문에 이와같이 사용한다.
		System.out.println(list);
		
		LinkedList alist = new LinkedList();
		alist.add(12);
		alist.add(40);
		System.out.println(alist);
		
		//Generic 사용(타입 제한 방법)
		ArrayList<Object> list2 = new ArrayList<Object>(); // 들어오는 모든 값들이 upcasting되어서 타입이 Object로 들어오게 된다.
		list2.add("Hello");
		list2.add("World");
		System.out.println(list2);
		for(Object obj : list2) {
			String sobj = (String)obj; //그래서 String 함수를 사용하기 위해서는 강제 형변환이 필요하다.
			System.out.println(sobj.toUpperCase());
		}
		
		ArrayList<String> list3 = new ArrayList<String>(); // String만 들어올 수 있게 제한
		list3.add("Hello");
		list3.add("Good");
		System.out.println(list3);
		
		for(String str : list3) {
			System.out.println(str.toLowerCase());
		}
	}

}
