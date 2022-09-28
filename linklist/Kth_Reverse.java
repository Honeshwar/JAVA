package linklist;
//class LinkedListNode<T> {
//    T data;
//    LinkedListNode<T> next;
//
//    public LinkedListNode(T data) {
//        this.data = data;
//    }
//}
public class Kth_Reverse {
	LinkedListNode<Integer> head;
	LinkedListNode<Integer> tail;
	//Pair reverse(Node *head)
	public static Kth_Reverse reverse(LinkedListNode<Integer> head)
	{
	    if (head == null || head.next == null)
	    {
	    	
	    	Kth_Reverse ans=new Kth_Reverse();
	        ans.head = head;
	        ans.tail = head;
	        return ans;
	    }
	    Kth_Reverse smallAns = reverse(head.next);
	    smallAns.tail.next = head;
	    head.next = null;
	    Kth_Reverse ans=new Kth_Reverse();
	    ans.head = smallAns.head;
	    ans.tail = head;
	    return ans;
	}
	
	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
	
		
		
		
		    if (head == null)
		    {
		        return head;
		    }
		    if (k == 0 || k == 1)
		    {
		        return head;
		    }

		    LinkedListNode<Integer>temp = head;
		    int count = 0;
		    while (temp != null && count != k - 1)
		    {
		        temp = temp.next;
		        count++;
		    }
		    LinkedListNode<Integer>head2 = null;
		    if (temp != null)
		    {
		        head2 = temp.next;
		        temp.next = null;
		    }
		    LinkedListNode<Integer>newHead = kReverse(head2, k);
		    Kth_Reverse ans = reverse(head);
		    ans.tail.next = newHead;
		    return ans.head;
		}

		
		
		
	
	}





