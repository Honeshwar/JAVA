package linked_list;

//public class Append_N_Node {
//	public static int length(LinkedListNode<Integer> head){
//		LinkedListNode<Integer> temp=head;
//		int length=0;
//		
//	    while(temp!=null){//not -1 ,it is not included check takeInput method
//	        length++;
//	        temp=temp.next;
//	        
//	    }return length;}
//
//		public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
//			 LinkedListNode<Integer> temp=head;
//	        int length=length(temp);
//	      
//	        int i=0;
//	        // LinkedListNode<Integer> first=temp;
//	        LinkedListNode<Integer> newHead=null;
//	        while(temp!=null){
//	            
//	            if(n==0){
//	                return head;
//	            }
//	            if(i==length-n-1){
//	                newHead=temp.next;
//	               temp.next=null;
//	             //   break;
//	          temp=newHead;//if temp will not change ,than it will than
//	                //  temp=null and loop false ,it will not iterate further
//	            
//	            } 
//	           else  if(temp.next==null){
//	                temp.next=head;
//	                head=newHead;
//	                break;
//	            
//	          }    
//	            
//	            temp=temp.next;i++;}
//	        
//	       // temp=newHead;
//	        
////	         while(temp!=null){
//	        
////	            if(temp.next==null){
////	                 temp.next=head;
////	                 head=newHead;
////	                 break;
//	            
////	          }
////	             temp=temp.next;i++;
////	         }
//					
//	        return head;
//	        
//		}


