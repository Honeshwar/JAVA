package generices;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		
		ArrayList<Integer> l1=new ArrayList<>();
		ArrayList<Integer> l2=new ArrayList<>(20);
		
		l1.add(8);//index =0 internally stored in.
		//l1.add(2, 70);// directly jump in index not allowed
		
		
		l1.add(1,70);
		l1.add(20);
		l1.set(0, 201);// remove 8 from index=0
		l1.add(1, 189);
		/* ADD index=2 ma 189 and element that 
		initially at index=2 shift  to right index ,every element  shift to
		right index.*/
		
		
		
		
		int size1=l1.size();// best ways to store length ,not call in iteration an size function
		int size2=l2.size();
//	     l1.clear();// reset ArrayList
//		System.out.println(l1.isEmpty());
	
		
		for(int i=0;i<size1;i++) {
		// array empty karna hai 
			 //l1.add(i,null);
		System.out.println(l1.get(i));
		}
		//Enhanced for loop,for each loop ,only use for print array, iterate in array
		// we pass only value,after all done by for each loop itself
		
		// for each element i in array
		for(int i:l1) {
			System.out.println(i);
			System.out.print(l1+" ");// whole  array return i time
		}
		
		
		System.out.println(size1+" "+size2);// size give us current element filled count
//	      l1.clear();
//	      l1.clone();
	      
	      Integer i=12;
	      l2.add(44);
	      l1.remove(0);
	      l1.remove(l2);
	      l1.remove(i);// object remove
	      
	      
	      
	      
	}
	

}
