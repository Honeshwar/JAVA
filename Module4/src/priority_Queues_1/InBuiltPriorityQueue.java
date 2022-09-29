package priority_Queues_1;

import java.util.Collections;
import java.util.PriorityQueue;

public class InBuiltPriorityQueue {
public static void main(String[] args) {
	
	int a[]= {32,4,5,8,9,0,1,32,3};
	
	// max priority queue
	PriorityQueue<Integer> kElement = new PriorityQueue<>(Collections.reverseOrder());
	
	
	
	
	PriorityQueue<Integer> pq=new PriorityQueue<>();
	// by default min Priority Queue.
	
	
	
	pq.add(1);
	boolean b=pq.isEmpty();
	int n=pq.size();
	int get=pq.peek();// getmin
	// both delete       difference
	int s=pq.poll();   // if  Priority Queue is empty it will return null.
//	int s1=pq.element();// if  Priority Queue is empty it will return exception,  
	               //like in queue DS remove return exception and pool return null
	
	
	for(int i=0;i<a.length;i++) {
		pq.add(a[i]);
	}
	while(!pq.isEmpty()) {
//		System.out.print(pq.peek()+"");
		System.out.print(pq.poll()+" "); // remove  min among all.
		
	}
}
}
