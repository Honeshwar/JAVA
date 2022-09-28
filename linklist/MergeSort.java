package linklist;

 
public class MergeSort {
	 public static LinkList_Node<Integer> mergeTwoSortedLinkedLists(
			 LinkList_Node<Integer> head1,  LinkList_Node<Integer> head2) {
		        
		       
		        if(head1==null&&head2==null){
		            return null;
		        }
		         if(head1==null){
		            return head2;
		        }
		        if(head2==null){
		            return head1;
		        }
		        
		        
		        ////////////
		        LinkList_Node<Integer> temp1=head1;
		        LinkList_Node<Integer> temp2=head2;
		        LinkList_Node<Integer>
		         head=null,
// ll not create only reference create so space complexity=O(1)
		         tail=null;
		        
		         if(temp1.data<=temp2.data){
		             head=temp1;
		             tail=temp1;
		             temp1=temp1.next;
		           
		         }else{
		             head=temp2;
		             tail=temp2;
		              temp2=temp2.next;
		         }
		        
		        
		         while(temp1!=null&&temp2!=null){
		            if(temp1.data<=temp2.data){
		             
		                tail.next=temp1;
		                  tail= temp1;
		                temp1=temp1.next;
		            }else{
		               tail.next=temp2;
		               tail= temp2;
		               temp2=temp2.next;
		            }
		       }
		            if(temp1!=null){
		                tail.next=temp1;
		            }else{
		                tail.next=temp2;
		            }
		        return head;
		            
		        
		        
		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
