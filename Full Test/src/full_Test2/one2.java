package full_Test2;

class Node{
	int data;
	Node next;
}
public class one2{
	
	
	  public static Node reverse(Node head, int k)
	    {
	      
	        // base case
	        if (head == null) {
	            return null;
	        }
	 
	        // start with the current node
	        Node current = head;
	 
	        // reverse next `k` nodes
	        Node prev = null;
	        int count = 0;
	 
	        while (current != null && count++ < k)
	        {
	          
	            Node next = current.next;
	 
	            
	            current.next = prev;
	 
	           
	            prev = current;
	 
	           
	            current = next;
	        }
	 
	       
	        head.next = reverse(current, k);
	 
	        
	        return prev;
	    }
	 
	
	
	
	
	
	
	
	
//  // base case
//  if (head == null) {
//      return null;
//  }

//  // start with the current node
//  Node current = head;

//  // reverse next `k` nodes
//  Node prev = null;
//  int count = 0;

//  // iterate through the list and move/insert each node
//  // in front of the result list (like a push of the node)
//  while (current != null && count++ < k)
//  {
//      // tricky: note the next node
//      Node next = current.next;

//      // move the current node onto the result
//      current.next = prev;

//      // update the previous pointer to the current node
//      prev = current;

//      // move to the next node in the list
//      current = next;
//  }

//  // recur for remaining nodes
//  head.next = reverseInGroups(current, k);

//  // it is important to return the previous node
//  // (to link every group of `k` nodes)
//  return prev;
//}

}