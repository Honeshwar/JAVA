package linklist;

public class FIndNodeInLinkedList {
 	public static int findNode1(LinkedListNode<Integer> head, int n) {
		LinkedListNode<Integer> temp= head;
     int index=0;
     while(temp!=null){
         if(temp.data==n){
             return index;
         }
         index++;
         temp=temp.next;
     }
     return -1;
	}


 public static int findNode3(LinkedListNode<Integer> head, int n){
    return findNode2(head,n,0);
 }

public static int findNode2(LinkedListNode<Integer> head, int n,int count){

 if(head==null)
     return -1;

  if(head.data==n){
     return count;
 }
 return findNode2(head.next,n,count+1);
 // int small=findNode2(head.next,n,count+1);
 // //else
 // return small;
}

//important

public static int findNode(LinkedListNode<Integer> head, int n){
 
    if(head==null)
     return -1;

 if(head.data==n){
    return 0;
}
 int ans=findNode(head.next,n);
 // one check to say recursion when change index
 if(ans==-1)
 return ans;
 else// 0
     return 1+ans;
}





}
