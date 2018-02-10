package test;



import org.junit.Test;

import bean.Mantou;
import custom.list.LinkedList;

public class LinkedListTest {
	
	@Test
	public void test1(){
		
		LinkedList<Object> list = new LinkedList<>();
		Mantou mt1 = new Mantou(1);
		
		list.add(null);
		list.add(null);
		list.add("090909");
		list.add(null);
		list.add("qqq");
		list.add(111);
		list.add(mt1);
		list.add(true);
		System.out.println(list.size());
		
//		 int index = list.indexOf(new Mantou(1));
//		 System.out.println(" Ä¿±êË÷Òı  "+index);
//		 System.out.println("É¾³ı  "+list.remove(3));
		 
		 
	
	}

}
