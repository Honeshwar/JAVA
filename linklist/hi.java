package linklist;


public class hi {
	static void fun(LinkList_Node<Integer> start)
	{
	  if(start == null)
	    return;
	  System.out.print( start.data); //135

	  if(start.next != null )
	    fun(start.next.next);
	  System.out.print(start.data);//531
	}
public static void main(String[] args) {
	LinkList_Node<Integer> start=LinkList_Node.takeInput();
	fun(start);
}
}
