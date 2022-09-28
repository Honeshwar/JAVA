package linklist;



class DoubleNode{
	LinkList_Node<Integer> head;
	LinkList_Node<Integer> tail;
	public DoubleNode(LinkList_Node<Integer> head,
			LinkList_Node<Integer> tail) {
		this.head=head;
		this.tail=tail;
	
	}
	public DoubleNode() {
		
	}
	
	
}


public class DoubleNode_ReverseInPairOfNode {
public static DoubleNode reverseB(LinkList_Node<Integer> head) {
	DoubleNode ans;
	if(head==null||head.next==null) {
		ans=new DoubleNode(head,head);//if head.next==null
		return ans;
	}DoubleNode ans2=reverseB(head.next);
	ans2.tail.next=head;//doubleNode tail ko head assign kar diya.
	head.next=null;//head stored reference ko null kar diya.
	 ans=new DoubleNode(ans2.head,head);// ans2.head= reverse pointer (head of ll), tail=head (ab joh head hai boh tail ho gayaga).
	 // update head and tail of double node.
	return ans;
}
public static void reverse(LinkList_Node<Integer> head){
	DoubleNode temp=reverseB(head);
	while(temp.head!=null) {
		System.out.println(temp.head.next);
		System.out.print(temp.head.data+" ");
		temp.head=temp.head.next;
	}System.out.println();
}
public static void main(String[] args) {
	LinkList_Node<Integer> head=LinkList_Node.takeInput();
	reverse(head);
	//LinkList_Node.print(head);
	System.out.println(head.next);
	}

}
