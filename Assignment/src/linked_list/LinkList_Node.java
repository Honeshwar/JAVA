package linked_list;
import java.util.Scanner;
public class LinkList_Node<T> {
	T data;
	LinkList_Node<T> next;

	public LinkList_Node() {
		
	}
	public LinkList_Node(T data) {
		this.data=data;
//		next=null;
	}
	public  void printLinklist() {
		LinkList_Node<Integer> head=createLinkList();
		while(head!=null) {
			System.out.print(head.data+" ");
			//System.out.print(head+" "+head.data+" "+ head.next);
			head=head.next;
			//System.out.println(head.next.data);
			//System.out.println();
		}System.out.println();
	}

	public void print(LinkList_Node<Integer> head) {
		LinkList_Node<Integer> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}System.out.println();
	}
	public static LinkList_Node<Integer> createLinkList(){
		LinkList_Node<Integer> n1=new LinkList_Node<>(10);
		LinkList_Node<Integer> n2=new LinkList_Node<>(20);
		LinkList_Node<Integer> n3=new LinkList_Node<>(30);
		LinkList_Node<Integer> n4=new LinkList_Node<>(40);
		// linking or connection can be any format
		n1.next=n2;//n4.next=n3;
		n2.next=n3;//n3.next=n2;
		n3.next=n4;//n2.next=n1;
		
		return n1;
	}


	public static LinkList_Node<Integer> insert
	(LinkList_Node<Integer> head,int position,int data){
		
		LinkList_Node<Integer> temp=head;
		LinkList_Node<Integer> insertElement=new 
				LinkList_Node<Integer> (data);
		int i=0;
		while(temp!=null) {
			if(	i==position) {
				LinkList_Node<Integer> temp1=insertElement;;
//				head=insertElement;
//				insertElement.next=temp1;
				insertElement.next=temp;
				return insertElement;
			}else if(i==position-1){
				LinkList_Node<Integer> temp1=temp.next;
				temp.next=insertElement;
				insertElement.next=temp1;
				return head;
				
			}i++;
			
			temp=temp.next;
		}
		if(i==position) {
			temp.next=insertElement;
			return head;}
		
		
		return head;//if node no. not exist,then return entire link list means head
		
		
		
		
		
		
		
	}

	public static LinkList_Node<Integer> delet
	(LinkList_Node<Integer> head,int position){
		
		LinkList_Node<Integer> temp=head;
		int i=0;
		while(temp!=null) {
			if(	i==position+1) {
				head=temp;
				return head;
			
			}else if(i==position-1){
				 // check for deletion element exit or not.
	            if(temp.next==null){
	                return head;
	            }
		
			LinkList_Node<Integer> temp1=temp;
			temp=temp.next;//index 1 reference to get
			temp=temp.next;//index 2 reference to get
			temp1.next=temp; // index 0 give reference of index 2 
			return head;
				
			}i++;
			
			temp=temp.next;
		}

		return head;
		
		
		
		
		
		
		
	}

	public static int length(LinkList_Node<Integer> head){
		LinkList_Node<Integer> temp=head;
		int length=0;
		//int data=temp.data;
		//System.out.println(temp+" "+temp.data);
	    while(temp!=null){//not -1 it is not included check takeInput method
	        length++;
	        temp=temp.next;
	        
	    }
//	    while(temp.data!=null){// last reference will be null ,temp==null and 
//	    	//we try to get temp.data(null.data)
//	        length++;
//	        temp=temp.next;
//	        
//	    }
	return length; }




	public static LinkList_Node<Integer> 
	takeInput(){//vehicle v=head; caught reference and utilize it.
		
		Scanner inputData = new Scanner(System.in);
		
		int data=inputData.nextInt();
		LinkList_Node<Integer> head = null;//=null;
		while(data!=-1) {//terminate at data=-1
			LinkList_Node<Integer> currentNode=new 
					LinkList_Node<Integer>(data);// currentNode.data=data;
			if(head==null) {
				head=currentNode;
			}else {
				//to make head unique create new node
				LinkList_Node<Integer> tail=head;//head reference inside it 10 exist
							
//					tail = always head; 
//					loop that help us to reach out tail

				while(tail.next!=null) {//for changing tail reference 
					tail=tail.next;// head-->tail-->tail....
					
	}	tail.next=currentNode;//for tail=null first time
				
			}
			data=inputData.nextInt();
		}
		return head;// because origin of link list  linkage reference stored by head
	}



	}


