package linklist;

 
public class Mid_Of_Node_Solution {
    
    public static LinkList_Node<Integer> midPoint(LinkList_Node<Integer> head) {
        if(head == null || head.next==null || head.next.next == null  )// -1 , 1 -1 , 2 1 -1
            return head;
        
        LinkList_Node<Integer> s = head;
        LinkList_Node<Integer> f = head;// speedf = 2 X s
         
          while(f.next !=null && f.next.next!=null)
          {
              s= s.next; //i=i+1
              f=f.next.next;//i=i+2
             //s.next=f.next=s.next;
          }
        return s;
        
    }  

}

/* 
      
      f     		f    1 step=2 step
      s     s			 1 step=1 step			
      1  2  3  4   5
     

*/
