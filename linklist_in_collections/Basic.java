package linklist_in_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;


public class Basic {

	public static void main(String[] args) {
		//ArrayList<Integer> m=new ArrayList<>();
		LinkedList<Integer> list=new LinkedList<>();
		list.add(20);
		list.add(1, 60);
		//list.addAll(list);
		list.addFirst(90);
		list.addLast(100);
		//list.addAll(0, list);
		
		int size=list.size();
//		System.out.println(list.isEmpty());//false
//		System.out.println( list.equals(null));//false
//		System.out.println(list.contains(null));//false
		list.getFirst();
		list.getLast();
		System.out.println(list.toString());
	System.out.println(	list.descendingIterator());
		for(int i=0;i<size;i++) {
			//list.set(i,i*20);//replace each index .
			System.out.println(list.get(i));
		}

	}

}
