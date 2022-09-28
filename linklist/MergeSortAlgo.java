package linklist;

 
public class MergeSortAlgo {
	public static LinkList_Node<Integer> mergeSort(LinkList_Node<Integer> head) {
		// base case 
		if(head==null||head.next==null) {
			return head;
			
		}
		LinkList_Node<Integer> mid=mid(head);
		// divide ll in two part
		LinkList_Node<Integer> headPart1=head;
		LinkList_Node<Integer> headPart2=mid.next;
		mid.next=null;
		headPart1=mergeSort(headPart1);
		headPart2=mergeSort(headPart2);
		head=mergeTwoLinkList(headPart1,headPart2);
		
		
		
		
		return head;
	}
	
	
	
	
	
	
	private static LinkList_Node<Integer> mergeTwoLinkList(LinkList_Node<Integer> headPart1,
			LinkList_Node<Integer> headPart2) {
		LinkList_Node<Integer> t1=headPart1;
		LinkList_Node<Integer> t2=headPart2;
		LinkList_Node<Integer> head=null,tail=null;
		
		if(t1.data<=t2.data) {
			head=t1;
			tail=t1;//create for linking link list.
			t1=t1.next;
		}else {
			head=t2;
			tail=t2;//create for linking link list.
			t2=t2.next;
			
		}while(t1!=null&&t2!=null)
		{
			if(t1.data<=t2.data) {
				tail.next=t1;
				tail=t1;
				t1=t1.next;
		}else {
			tail.next=t2;// stored reference for next element in node next.
			tail=t2;  // update tail
			t2=t2.next;// move to next node
        }
		
		}
		
		if(t1!=null) {
			tail.next=t1;// entire link list from t1 to null that linked here.
		}else {
			tail.next=t2;
		}
		return head;
	


	}



	private static LinkList_Node<Integer>  mid(LinkList_Node<Integer> head) {
		LinkList_Node<Integer> slow=head;
		LinkList_Node<Integer> fast=head;
		while(fast.next!=null&&fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}






	public static void main(String[] args) {
		LinkList_Node <Integer> head=LinkList_Node.takeInput();
		LinkList_Node.print(mergeSort(head));
	}

}
