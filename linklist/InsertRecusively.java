package linklist;
import java.util.Scanner;


public class InsertRecusively {
	
public static LinkList_Node <Integer>  insertR1(LinkList_Node <Integer> 
head,int data,int pos,int index ) {
	if(pos==0) {
		LinkList_Node <Integer> newHead=new 
				LinkList_Node <Integer>(data);
		newHead.next=head;
		 head=newHead;//return new head S(n)-->o(n) 
		 return head;//O(1)
	}
	//base case
	if(head==null) {
		return null;
	}
	head.next=insertR1(head.next, data, pos,index+1);
	if(index==pos-1) {
		LinkList_Node <Integer> insertElement=new 
				LinkList_Node <Integer>(data);
		LinkList_Node <Integer> temp=head.next;
		head.next=insertElement;
		insertElement.next=temp;
	//return head;
	}
	return head;
}

public static LinkList_Node <Integer> insertR2(LinkList_Node <Integer> head, int elem, int pos){
    if(head==null&& pos>0 ){//check
    	// pos =2,2,1,3,4,5... all the time;
    	// pos>0 is for index+1 element insert,if pos ==0 than work
    	// pos=-1 will never come because pos==0 will return head see below,call will start returning
      return head;
    }
    if(pos==0){
    	LinkList_Node <Integer>newNode= new LinkList_Node <Integer>(elem);
        newNode.next= head;
        return newNode;
    }else{
//    	LinkList_Node <Integer>smallOutput=insertR2(head.next, elem, pos-1);
//    	 head.next=smallOutput;
//        return head;
    head.next= insertR2(head.next, elem, pos-1);
    return head;
    }
}
public static void main(String[] args) {
		LinkList_Node <Integer> head=
				LinkList_Node.takeInput(); 
		
		//head=insertR1(head,20,6,0);
		head=insertR2(head,20,5);
		head.print(head);
	}

}
