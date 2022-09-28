package linklist;



public class CheckPalindrome {
	           /* value may be long so some error occur */
    public static int length(LinkList_Node<Integer> head){
	LinkList_Node<Integer> temp=head;
	int length=0;
	
    while(temp!=null){//not -1 ,it is not included check takeInput method
        length++;
        temp=temp.next;
        
    }return length;}

	public static long reverseSum(LinkList_Node<Integer> head,int count) {   
         // count=0
        
		LinkList_Node<Integer> temp=head;
		if(temp==null){
           return 0;
        }
        long answer=reverseSum(temp.next,count+1);
      return   (long)(answer+(long)Math.pow(10,count)*temp.data);
	}
   
    	public static long forwardSum(LinkList_Node<Integer> head,int count) {   
         // count=0
        
		LinkList_Node<Integer> temp=head;
		if(temp.next==null){
           return temp.data;
        }
        long answer=forwardSum(temp.next,count-1);
     return   (long)(answer+(long)Math.pow(10,count)*temp.data);

	}
    
    public static boolean isPalindrome(LinkList_Node<Integer> head) {
        
         if(head==null){
            return true;
        }
        int length=length(head)-1;
        long answer1=reverseSum(head,0);
        long answer2=forwardSum(head,length);//length
      //  System.out.print(answer1+" "+answer2);
      
       
        if(answer1==answer2){
            return true;
        }
        return  false;
        }
    
}
