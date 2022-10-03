import java.util.Scanner;


public class Random_LL<T> {
T data;
Random_LL<T> next;
Random_LL<T> previous;
Random_LL<T> random;
public Random_LL(T data) {
	this.data=data;
	this.next=null;
	this.previous=null;
	this.random=null;
}
public static Random_LL<Integer> input(){
	
	Scanner s=new Scanner(System.in);
	int firstElement;//=s.nextInt();
	Random_LL<Integer> head=null,tail=null;
	while((firstElement=s.nextInt())
			!=-1) {
		Random_LL<Integer> currentElement=new 
				Random_LL<Integer>(firstElement);
		if(head==null) {
			head=currentElement;
			tail=currentElement;
}else {

		/* now make it big oh if n -->O(n) */
			tail.next=currentElement;
			Random_LL<Integer> a=tail;
			tail=currentElement;
			tail.previous=a;
				}
				
			}return head;
			
}



void printRandom(Random_LL<T> head) {
	if(head==null)
		return;
	Random_LL<T> temp=head;
	while(temp!=null) {
		System.out.print(temp.data+" ka random m "+temp.random.data+" ");
		System.out.println();
		temp=temp.next;
	}
	System.out.println();
}
void print(Random_LL<T> head) {
	if(head==null)
		return;
	Random_LL<T> temp=head;
	while(temp!=null) {
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
	System.out.println();
	temp=head;
	
}
}
