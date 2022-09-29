package priority_Queues_1;

import java.util.*;






	

/*
7
    Time complexity: O(N * log(N))
8
    Space complexity: O(N)
9

10
    where N is the number of people in the queue
11
 */

 class Solution {

    public static int buyTicket(int input[], int k) {

        Queue<Integer> q = new LinkedList<Integer>();

        // Max priority queue
 
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(10, Collections.reverseOrder());

        for (int i : input) {

            q.add(i);
 
            pq.add(i);
 
        }
 
        int count = 0;
 
        while (!pq.isEmpty()) {
 
            if (q.peek().equals(pq.peek())) {
 
                if (k == 0) {

                    return count + 1;
 
                } else {
 
                    count++;
 
                    q.poll();
     
                    pq.poll();
 
                    k--;
 
                }
 
            } else {
 
                q.add(q.peek());
 
                q.poll();
 
                if (k == 0) {
  
                    k = q.size() - 1;
  
                } else {
    
                    k--;
  
                }
  
            }
  
        }
   
        return count;
 
    }
 
}

	


public class BuyTheTicket {

	public static int buyTicket(int a[], int k) {
		
		int n=a.length;
		if(n == 0 )
			return 0; 
		if( k == 0)
			return 1; // time taken to get the ticket by frient if ticket=0,than only person get the ticket is your friend.
		
		
		
		Queue<Integer> indexOfPriority =new  LinkedList<>(); 
            
		for(int i=0;i<n;i++)
			indexOfPriority.add(i);
		
		
		PriorityQueue<Integer> maxPriorityQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i=0;i<n;i++)
		     maxPriorityQueue.add(a[i]);
	
		int time=0;
		int i=k;
		while(!indexOfPriority.isEmpty()) {
			
			int temp        = indexOfPriority.peek();
			int maxPriority = maxPriorityQueue.peek();
			
           
			if(temp == k ) {
                       
                                if(a[temp] >= maxPriority || i==0) { 
                    
                                        return ++time;

                                         }

                                   else {

                                        int el=indexOfPriority.poll();
                                        indexOfPriority.add(el); 

                                    }
				
			               }
            
            else if (  temp != k){
                                 
                                  if(a[temp] >= maxPriority) { 
                                            time++;
                                            indexOfPriority.poll();
                                            maxPriorityQueue.poll();
                                            i--;

                                             }
                                        else {

                                            int el=indexOfPriority.poll();
                                            indexOfPriority.add(el); 

                                        }
				
			              }
		  }
            
		return time;
	}
	
	
	public static void main(String[] args) {
		int a[] = {2,3,2,2,4};
		
		System.out.println(timeTakenToGetTicket(a,3));
	}

	private static int timeTakenToGetTicket(int[] a, int k) {
		//all about question
		// k = selected person index , find time taken to give ticket to kth (index) person  , and
		// 1 ticket give = 1 minute ;
		
		
		int n=a.length;
		if(n == 0 )// nobody in  queue (line).
			return 0; // o minute ,time
		if( k == 0)
			return 1; // time taken to get the ticket by frient if index person=0,than only person get the ticket is your friend.
		
		
		
		Queue<Integer> indexOfPriority =new  LinkedList<>(); //  not work like ll PriorityQueue<Integer>(); // new linkedList<>(); implement queue
		// queue is an interface (inherit)extends Collection<E> and in collection priority queue is present;
		// queue abstract function implement in collection PQ ;
		
		// ndexOfPriority is added
		for(int i=0;i<n;i++)
			indexOfPriority.add(i);
		
		
		PriorityQueue<Integer> maxPriorityQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		// CBT  for parent is largest priority > its child priority
		for(int i=0;i<n;i++)
		     maxPriorityQueue.add(a[i]);
	
		int time=0;
		//int i=k; no need 
		while(!indexOfPriority.isEmpty()) {
			
			int temp        = indexOfPriority.peek();// first element index
			int maxPriority = maxPriorityQueue.peek();
			
			
		
			// reach to k==selected person index\
			if(temp == k ) { // friend person whom i have to give ticket in front of me t
				// and he has maxPrioriy to in queue/
				if(a[temp] >= maxPriority ) { // Priority ==  max
					time++;//  kitne time lagaga to give ticket to my selected person ( if i have or haven't ticket ).
//					indexOfPriority.poll();
//					maxPriorityQueue.poll();
					
					return time;
				}
				else {// prority not max, than i say to him go to last to line
					int el=indexOfPriority.poll();
					indexOfPriority.add(el); // last ma add hoga
					
				}
				
			}else if (  temp != k){// not need because ticket == 0 than  to reach your selected person do same until  line 117 execute
				if(a[temp] >= maxPriority) { // Priority ==  max
					time++;
					indexOfPriority.poll();
					maxPriorityQueue.poll();
//					i--;
					
			}
				else {
			
					int el=indexOfPriority.poll();
					indexOfPriority.add(el); // last ma add hoga
					
				}
				
			}
		}
		return time;
	}
	
	
}

