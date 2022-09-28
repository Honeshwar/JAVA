package linklist;



public class DeletionWithRecusion {

	public static void main(String[] args) {
		
		LinkList_Node <Integer> head=
				LinkList_Node.takeInput(); 
		
		head=deletionWithRecusion(head,5);
		head.print(head);
	}

	private static LinkList_Node<Integer> deletionWithRecusion(LinkList_Node<Integer> head, int position) {
		//base case
		if(head==null)// if i have index and head!=null than i do something otherwise return null/
		{
			return head;
		}
		// case
		if(position==0) {
			return head.next;
		}
		else {
			head.next=deletionWithRecusion(head.next, position-1);
			// my head that .next would be that changed reference(like @123, now @132,@123 delete);
//			if(position==1) {
//				head.next=head.next.next;
			return head;
//			}
		}
		//return head;
	}

}
