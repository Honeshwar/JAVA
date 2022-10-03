import java.util.LinkedList;

public class CloneLinkedList {
public static Random_LL<Integer> clone( Random_LL<Integer> head){
	 Random_LL<Integer> temp1=head;
	 Random_LL<Integer> clone_LL=null;
	 Random_LL<Integer> temp2=null;//next==tail
	
	while(temp1!=null) {
		if(clone_LL==null) {
			clone_LL=temp1;
			//clone_LL.previous=null;
			temp2=clone_LL;
		}else {
		//	temp2.previous=temp1.previous;
			temp2.next=temp1;
			temp2=temp2.next;
			
		}
		temp1=temp1.next;
	}
	
	//stgep 2
	temp1=head;
	 Random_LL<Integer> clone_LL2=clone_LL;
		
	while(temp1!=null&&clone_LL2!=null) {
		temp2=temp1;
		temp2.next=clone_LL2;
		clone_LL2.random=temp2;
		//clone_LL.random=clone_LL.random.random.next;// temp1.next.random.random.nr
			
		clone_LL2=clone_LL2.next;
		temp1=temp1.next;
	}
	temp1=head;
	 clone_LL2=clone_LL;
		
	while(temp1!=null) {
		temp2=temp1;
		clone_LL2.random=clone_LL2.random.random.next;
		
		clone_LL2=clone_LL2.next;
		temp1=temp1.next;
	}
	
	return clone_LL;
}
public static void main(String[] args) {
	Random_LL<Integer> head= new Random_LL<>(1);
	
	head.next = new Random_LL<Integer>(2);
    head.next.next = new Random_LL<Integer>(3);
    head.next.next.next = new Random_LL<Integer>(4);
    head.next.next.next.next
        = new Random_LL<Integer>(5);
    head.random =  head.next.next;
    head.next.random = head;
    head.next.next.random =  head.next.next.next.next;
    head.next.next.next.random= head.next.next;
    head.next.next.next.next.random = head.next;
	
	
//	head.print(head);
//	head.printRandom(head);
	
	head.print(clone(head));
	head.printRandom(clone(head));
	
	
	
}
}
