package linklist;

import java.util.Scanner;

 
public class LinkListUse {
	
	public static void print(LinkList_Node<Integer> head) {
		LinkList_Node<Integer> temp=head;//better way
		while(temp!=null) {
		//	head.data++;
			System.out.print(temp.data+" ");
			temp=temp.next;
		}System.out.println();
		
		temp=head;// benefit
		while(temp!=null) {
			//	head.data++;
				System.out.print(temp.data+" ");
				temp=temp.next;
			}System.out.println();
			
	}
   public static void printLinklist() {
	 LinkList_Node<Integer> head=createLinkList();
		while(head!=null) {
			head.data++;
			System.out.print(head+" "+head.data+" "+ head.next);
			head=head.next;
		}
	}
	public static LinkList_Node<Integer> createLinkList(){
		LinkList_Node<Integer> n1=new LinkList_Node<>(10);
		LinkList_Node<Integer> n2=new LinkList_Node<>(20);
		LinkList_Node<Integer> n3=new LinkList_Node<>(30);
		LinkList_Node<Integer> n4=new LinkList_Node<>(40);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		return n1;
	}

	public static void main1(String[] args) {
		LinkList_Node<Integer> head=createLinkList();
		head.printLinklist();
		
//		
		
		System.out.println();
		head.print(head);
	    print(head);
//		Node<Integer> n=new Node<>(29);
//		System.out.println(n.data);
//		System.out.println(n.next);
	}

		           /* Take input from user in link list */
			
			private static Scanner inputData;// best way
		
			public static LinkList_Node<Integer> 
			takeInput(){//vehicle v=head; caught reference and utilize it.
				
				inputData = new Scanner(System.in);
				
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
									
		//				tail = always head; 
		//				loop that help us to reach out tail
		
						while(tail.next!=null) {//for changing tail reference 
							tail=tail.next;// head-->tail-->tail....
							
			}	tail.next=currentNode;//for tail=null first time
						
					}
					data=inputData.nextInt();
				}
				return head;// because origin of link list  linkage reference stored by head
			}
		
			public static void main(String[] args) {
				LinkList_Node<Integer> head=takeInput();
				//head.print(head);
//				LinkList_Node<Integer> head2=input();
//				head.print(head2);
				
//				head=LinkList_Node.insert(head, 0,100);
//				head.print(head);
//				     LinkList_Node.insert(head, 3, 100);
//				head.print(head);
//				head=LinkList_Node.insert(head, 5, 100);
//				head.print(head);
//				head=LinkList_Node.delet(head, 0);
//				head.print(head);
				head=LinkList_Node.delet(head, 5);
				head.print(head);
				System.out.println(LinkList_Node.length(head));
			}
			public static LinkList_Node<Integer> input(){
				
				Scanner s=new Scanner(System.in);
				int firstElement;//=s.nextInt();
				LinkList_Node<Integer> head=null,tail=null;
				while((firstElement=s.nextInt())
						!=-1) {
					LinkList_Node<Integer> currentElement=new 
							LinkList_Node<Integer>(firstElement);
					if(head==null) {
						head=currentElement;
						tail=currentElement;
			}else {
		//				// second input of scanner se start hoga
		//				LinkList_Node<Integer> tail=head;
		//				//3th input come
		//				if(tail.next!=null) {
		//					tail=tail.next;
		//				}
		//				tail.next=currentElement;
				
					/* now make it big oh if n -->O(n) */
						tail.next=currentElement;
						tail=currentElement;
							}
							
						}return head;
						
			}
		}
