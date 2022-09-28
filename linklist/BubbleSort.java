package linklist;
class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}
public class BubbleSort {
	
	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
		 int n = length(head);
		    for (int i = 0; i < n; i++)
		    {
		    	 LinkedListNode<Integer> prev = null, 
		    			 curr = head, 
		    			 nxt = null;
		        for (int j = 0; j < n - i - 1; j++)
		        {
		            if (curr.data > curr.next.data)
		            {
		                if (prev == null)
		                {
		                    nxt = curr.next;
		                    head = nxt;
		                    curr.next = nxt.next;
		                    nxt.next = curr;
		                    prev = nxt;
		                }
		                else
		                {
		                    nxt = curr.next;
		                    prev.next = nxt;
		                    curr.next = nxt.next;
		                    nxt.next = curr;
		                    prev = nxt;
		                }
		            }
		            else
		            {
		                prev = curr;
		                curr = curr.next;
		            }
		        }
		    }
		    return head;
	}

	
	private static int length(LinkedListNode<Integer> head) {
	
	 if (head == null)
	    {
	        return 0;
	    }
	    return length(head.next) + 1;
	}
}

