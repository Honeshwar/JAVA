package linklist;

public class EvenAferOdd {
	
	public static LinkList_Node<Integer> evenAfterOdd(LinkList_Node<Integer> head){
		LinkList_Node<Integer> oddH=null;
		LinkList_Node<Integer> oddT=null;
		LinkList_Node<Integer> evenH=null;
		LinkList_Node<Integer> evenT=null;
	 while(head!=null){
         // for odd list
         if(head.data%2==1){
             if(oddH==null){
                 oddH=head;
                 oddT=head;
             }else{
                 oddT.next=head;
                 oddT=oddT.next;
             }
         }else{
             // for even list
              if(evenH==null){
                 evenH=head;
                 evenT=head;
             }else{
                 evenT.next=head;
                 evenT=evenT.next;
             }
         }
         head=head.next;
     }
     
     // check whether list is pure  even or not;
     if(oddH==null){// entire list is even.
         return evenH;
     }else{
         oddT.next=evenH;
     }
     
     
     return oddH;
	}




public static void main(String[] args) {
	LinkList_Node<Integer> head=LinkList_Node.takeInput();
	head=evenAfterOdd(head);
	LinkList_Node.print(head);
}}
