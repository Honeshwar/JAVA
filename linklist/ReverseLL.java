package linklist;

import java.util.LinkedList;

 
public class ReverseLL {
	public static LinkList_Node<Integer> reverseLinkedListRec(LinkList_Node<Integer> head) {
		if(head==null) {
			return null;
		}
		if(head.next==null) {
			return head;
		}
		LinkList_Node<Integer> reverseH=reverseLinkedListRec(head.next);
//		head.next.next=head;
//		head.next=null;
		LinkList_Node<Integer> tail=head;
		head.next=tail;
		tail.next=null;
		reverseH=tail;
//		if(reverseH==null) {
//			reverseH=head;
//			head.next=null;
//					return reverseH;
//		}
//		reverseH=reverseLinkedListRec(reverseH.next);
		return reverseH;
	}
	public static void main(String[] args) {
		LinkList_Node<Integer> head=LinkList_Node.takeInput();
		head=reverseLinkedListRec(head);
	//	System.out.println(head==null);
		LinkList_Node.print(head);
		
	// head.print(head);	// null.finction=null pointer exception, make static print function.

		
		
		
	}
}
