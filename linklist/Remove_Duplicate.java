package linklist;

import java.util.LinkedList;

 
public class Remove_Duplicate {
	public static LinkList_Node<Integer> removeDuplicates(LinkList_Node<Integer> head) {
		LinkList_Node<Integer> temp=head;
		int i=1;
		while(temp.next!=null) {
			if(temp.data==temp.next.data) {
				temp=LinkList_Node.delet(temp, 1);
				continue;
			}else {
				i++;
				temp=temp.next;
			}
			
		}
		
		return head;//space complexity O(1);
		
	}

	public static LinkList_Node<Integer> removeDuplicates2(LinkList_Node<Integer> head) {
		if (head == null){
	        return head;
	    }
		LinkList_Node<Integer>temp = head;
	    while(temp.next!= null){
	      //  if(temp.data.equals(temp.next.data)){// temp index=0
	        	 if(temp.data==temp.next.data){
	        		 
	        	temp.next= temp.next.next;
	        	// temp index=0
	        	// temp.next index=1, 
	        	// temp.next.next index=2, 
	        	//temp.next index=2,
	        }
	        else{
	        	temp=temp.next;
	        }
	    }
	    return head;
	}
	
	
	
	public static void main(String[] args) {
		LinkList_Node<Integer> head=new LinkList_Node<Integer> ();
		head=LinkList_Node.takeInput();
		removeDuplicates(head);// same class so no need to write reference.
		head.print(head);
		
		
		
	}
}
