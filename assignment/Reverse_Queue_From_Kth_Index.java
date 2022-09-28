package assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse_Queue_From_Kth_Index {

	//approach 1
    public static void reverseQueue(Queue<Integer> input,int k) {

        //Your code goes here
    	if(k==0) {//input.size()==0, <=1
    		return;
    	}
    	int a=input.poll();
    	reverseQueue(input,k-1);
    	
    	input.add(a);
    	

    }
 
 	public static Queue<Integer> reverseKElements1(Queue<Integer> input, int k) {
	 
 	reverseQueue(input,k);
         int i=0; 
         while(i<input.size()-k){
           int a =  input.poll();
              input.add(a);
             i++;
         }
       
            return input; 
 
 	}
	
    
    
    //approach 2 
public static Queue<Integer> reverseKElements2(Queue<Integer> input, int k){
        Queue<Integer> temp=input;
    Stack <Integer> s=new Stack<>();
        int a=k;
        //k element dtack ma push kiya
        while(a>0){
            s.push(temp.poll());
            a--;
        }
        //some j elemnt are in queue and insert k element at end of queue
        a=k;
         while(a>0){
          temp.add(s.pop());
            a--;
         }
        //some j elemnt are in queue are poll and add at end
        a=input.size()-k;
        
        while(a>0){
          int b=temp.poll();
            temp.add(b);
            a--;
         }

    input=temp;
        return input;

    }

	
	public static void main(String[] args) {
		Queue<Integer> s = new LinkedList<>();//s belong to queue 
		// func that implement  in LL are accessible in s reference so we can access it in LL
		for(int i=1;i<11;i++) {
			s.add(i);
		}
		
		s=reverseKElements1(s, 5);
		//s=reverseKElements2(s, 10);
		
		for(int i=1;i<10;i++) {
			System.out.print( s.poll()+" ");
		}
		
		
//	 	reverseQueue1(s,5);
//      int i=0; 
//      while(i<s.size()-5){
//        int a =  s.poll();
//           s.add(a);
//          i++;
//      }
//    
//		for(int i1=1;i1<11;i1++) {
//			System.out.print( s.poll()+" ");
//		}
	}

}
