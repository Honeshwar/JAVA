package linklist;

 
//class LinkedListNode<T> {
//    T data;
//    LinkedListNode<T> next;
//
//    public LinkedListNode(T data) {
//        this.data = data;
//    }
//}
public class SwapTwoNode {
	  public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
			
		  if (i == j || head == null)
		     {
		         return head;
		     }
		     LinkedListNode<Integer> p1 = null,
		                             c1 = null,
		                             p2 =null, 
		                             c2 = null, 
		                             temp = head,
		                             prev =null;
		     int index = 0;
		     while (temp != null)
		     {
		         if (index == i)
		         {
		             c1 = temp;
		             p1 = prev;
		         }
		         else if (index == j)
		         {
		             c2 = temp;
		             p2 = prev;
		         }
		         index++;
		         prev = temp;
		         temp = temp.next;
		     }
		     if (p1 !=null)
		     {
		         p1.next = c2;
		     }
		     else
		     {
		         head = c2;
		     }
		     if (p2 != null)
		     {
		         p2.next = c1;
		     }
		     else
		     {
		         head = c1;
		     }
		     LinkedListNode<Integer> nextToC1 = c1.next;
		     c1.next = c2.next;
		     c2.next = nextToC1;
		     return head;}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static LinkedListNode<Integer> swapNodes1(LinkedListNode<Integer> head, int i, int j) {
		LinkedListNode<Integer> temp=head;
		
		if(i==j) {
			return head;
		}else if(i==0&&j!=0 ||i!=0&&j==0  ) {
			LinkedListNode<Integer> cur1=null;
			LinkedListNode<Integer> cur2=null;
			LinkedListNode<Integer> pre = null;
			
			int n=0;
			temp=head;
			while(temp!=null) {
				if(n==i-1) {
					pre=temp;
				}else if(n==i) {
					cur1=temp;
				}else if(n==j-1) {
					pre=temp;
				}else {
					cur2=temp;
				}
				n++;
				temp=temp.next;
			}
			LinkedListNode<Integer> temp2=cur1.next;
			pre.next=cur1;
			cur1.next=cur2.next;
			cur2.next=temp2;
		head=cur2;
		return head;
		}
		else if(i!=0&&j!=0&& i-j==1||i-j==-1) {
			LinkedListNode<Integer> cur1=null;
			LinkedListNode<Integer> cur2=null;
			LinkedListNode<Integer> pre = null;
			
			int n=0;
			temp=head;
			while(temp!=null) {
				if(i>j) {
				 if(n==i) {
					cur1=temp;
				}else if(n==j-1) {
					pre=temp;
				}else {
					cur2=temp;
				}}else {
					if(n==i-1) {
						pre=temp;
					}else if(n==i) {
						cur1=temp;
					}else {
						cur2=temp;
					}
				}
				n++;
				temp=temp.next;
			}
			
			pre.next=cur2;
			cur1.next=cur2.next;
			cur2.next=cur1;
			head=pre;
			return head;
			
			
		}
		else if(i==0||j==0&&i-j==1||i-j==-1) {
			LinkedListNode<Integer> cur1=null;
			LinkedListNode<Integer> cur2=null;
			int n=0;
			temp=head;
			while(temp!=null) {
			if(n==i) {
				cur1=temp;
			}else {
				cur2=temp;
			}n++;
			temp=temp.next;
			}
			
			cur1.next=cur2.next;
			cur2.next=cur1;
			head=cur2;
			return head;
			
			
		}else if(i!=0&&j!=0&&i<j||i>j){
			
		
		
	//i=1 j=4 like that
		LinkedListNode<Integer> cur1=null;
		LinkedListNode<Integer> cur2=null;
		LinkedListNode<Integer> pre1 = null;
		LinkedListNode<Integer> pre2=null;
		
		int n=0;
		temp=head;
		while(temp!=null) {
			if(n==i-1) {
				pre1=temp;
			}else if(n==i) {
				cur1=temp;
			}else if(n==j-1) {
				pre2=temp;
			}else {
				cur2=temp;
			}
			n++;
			temp=temp.next;
		}
		
		pre1.next=cur2;
		pre2.next=cur1;
		cur1.next=cur2.next;
		cur2.next=cur1;
		head=pre1;
		return head;
	}return head;
	}
	
	public static void main(String[] args) {
		LinkList_Node<Integer> l=new LinkList_Node<Integer>(3);
		for(int i=0;i<7;i++) {
			l.next=new LinkList_Node<Integer>(i);
			
		}
	}
}






