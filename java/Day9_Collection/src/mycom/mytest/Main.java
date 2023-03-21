package mycom.mytest;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		//�����ְ� �����͸� ����/Ž��(����)�ϴ� �ڷᱸ��
		//������ �����ϴ� ��� = index
		//CollectionFramework�� Ŭ�������� �����͸� Object ���¸� �����Ѵ�.
		ArrayList list = new ArrayList();
		list.add(new Integer(10)); //-�� �׾�� ��ɾ�º���������
		list.add(20); //��� add���� �ڵ����� ���ֱ� ������ �̿Ͱ��� ����Ѵ�.
		System.out.println(list);
		
		LinkedList alist = new LinkedList();
		alist.add(12);
		alist.add(40);
		System.out.println(alist);
		
		//Generic ���(Ÿ�� ���� ���)
		ArrayList<Object> list2 = new ArrayList<Object>(); // ������ ��� ������ upcasting�Ǿ Ÿ���� Object�� ������ �ȴ�.
		list2.add("Hello");
		list2.add("World");
		System.out.println(list2);
		for(Object obj : list2) {
			String sobj = (String)obj; //�׷��� String �Լ��� ����ϱ� ���ؼ��� ���� ����ȯ�� �ʿ��ϴ�.
			System.out.println(sobj.toUpperCase());
		}
		
		ArrayList<String> list3 = new ArrayList<String>(); // String�� ���� �� �ְ� ����
		list3.add("Hello");
		list3.add("Good");
		System.out.println(list3);
		
		for(String str : list3) {
			System.out.println(str.toLowerCase());
		}
	}

}
