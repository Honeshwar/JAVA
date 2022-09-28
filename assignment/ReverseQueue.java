package assignment;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

	
    public static void reverseQueue(Queue<Integer> input) {

        //Your code goes here
    	if(input.isEmpty()) {//input.size()==0, <=1
    		return;
    	}
    	int a=input.poll();
    	reverseQueue(input);
    	
    	input.add(a);
    	

    }

	
	public static void main(String[] args) {
		Queue<Integer> s = new LinkedList<>();//s belong to queue 
		// func that implement  in LL are accessible in s reference so we can access it in LL
		for(int i=1;i<10;i++) {
			s.add(i);
		}
		for(int i=1;i<10;i++) {
			System.out.print( s.poll()+" ");
		}
//		reverseQueue(s);
//		for(int i=1;i<10;i++) {
//			System.out.print( s.poll()+" ");
//		}
	}

}
