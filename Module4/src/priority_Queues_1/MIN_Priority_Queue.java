package priority_Queues_1;

import java.util.ArrayList;

public class MIN_Priority_Queue<V> {//value = PASSANGER , PATIENT , STUDENT , ETC..

	private ArrayList<Element<V>> heap; // intarnally maintain hoge , user can visualize by CBT
	
	public MIN_Priority_Queue() {
   heap=new ArrayList<Element<V>>();
	
	
	}
	public V delete()
	{
		// swap to delet min, we know min is at i=0th index and due to CBT property we know deletion only happen at last level in right to let direction.
		
		//index
		int parentIndex=0;
		int lastIndex=heap.size()-1;
		
		Element<V> temp1=heap.get(parentIndex); // min
		heap.set(0, heap.get(lastIndex)); // replace
		heap.set(lastIndex, temp1);
		Element<V> e = heap.remove(lastIndex); // can also do in one line , line 59,60.
		
		
		// min heap order voilate  max priority is at first parent i=0th that we need  always min priority
		// down heapify /  re-heap
		
		while(parentIndex<=heap.size()-1) {
			// possible top to bottom we will traverse and when we went last index we stop loop nbecause that index is belong to that current elemt that come from top to bottom
		
		int leftChildIndex= (2*parentIndex) +1;
		int rightChildIndex= (2*parentIndex) +2;// rightChildIndex<heap.size() 
           int minPriorityOfTwoChildsIndex=parentIndex;
           // min among them
		if( rightChildIndex<heap.size() && heap.get(leftChildIndex).priority<heap.get(rightChildIndex).priority)
		{// rightChildIndex<heap.size()  condition because in CBT deletion r to left hota hai so right ma be delete some time .
			minPriorityOfTwoChildsIndex=leftChildIndex;// any number se initilize nahi kar sakta other wise indexoutofbond error come.
		}else {
			if(rightChildIndex<heap.size())
			minPriorityOfTwoChildsIndex=rightChildIndex;
		}
		//swap when
		if(parentIndex!=minPriorityOfTwoChildsIndex &&heap.get(parentIndex).priority>heap.get(minPriorityOfTwoChildsIndex).priority)
		{// current i=0th index priority> its childs , so its voiate minheap order property, we hae to swap /replace to corect order
		
			//swap
			Element<V> temp=heap.get(parentIndex);
			heap.set(parentIndex,heap.get(minPriorityOfTwoChildsIndex) );
			heap.set(minPriorityOfTwoChildsIndex, temp);
			
			parentIndex=minPriorityOfTwoChildsIndex;
			
		
		
		
		
		}
		else
			break;
		
		}
		
	return e.value;	
		
		
	}
	
	// only priority 
//	void insert1(int element) {
//		heap.add(element);
//		int childIndex = heap.size() - 1;
//		int parentIndex = (childIndex - 1) / 2;
//
//		while (childIndex > 0) {
//			if (heap.get(childIndex) < heap.get(parentIndex)) {
//				int temp = heap.get(childIndex);
//				heap.set(childIndex, heap.get(parentIndex));
//				heap.set(parentIndex, temp);
//				childIndex = parentIndex;
//				parentIndex = (childIndex - 1) / 2;
//			} else {
//				return;
//			}
//		}
//	}

	
	public void insert(V value, int priority) {
		// add woh ek node hai class hai 
		Element <V> e=new Element<V>(value, priority);
		heap.add(e);
		
		// possibility hai it will voilate min heap order, to maintain that we do --> Up heapify process(re heap),
		// just maintain order that every node(parent) prority is < its child priority
		// min heap = min parent priority
		
		// index find out karna padeage
		
		int childIndex=heap.size()-1; // Cbt ma  last ma insert karta hai.
		int parentIndex=(childIndex-1)/2;
		
		while(childIndex<=0) 
		// worst case m top will swap, new top =chiledIndex (Value,Priority) further no other parent he is first parent index=0.
		{
			// swap when
			if( heap.get(parentIndex).priority  > heap.get(childIndex).priority  )//heap.get(childIndex).priority 
			{
				// (store) make it before break it.
				Element<V> temp=heap.get(parentIndex);
				
				heap.set(parentIndex, heap.get(childIndex)); // template/class/node add
				heap.set(parentIndex, temp);
				
				// may possible current child is again min its parent , again up heapify(re heap)
				// index;
				childIndex=parentIndex;
				parentIndex=(childIndex-1)/2;
			}
			else {
				return; // if order is already maintain
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
		public  V getMin() throws PriorityQueueException {// V return tyoe because who is that whose prority is minimum. V = PASSANGER , PATIENT , STUDENT , ETC..
		
		// edge case
		if(isEmpty()) {
			// array list empty no element no min.
			throw new PriorityQueueException();
		}
		
		return heap.get(0).value;
		
	}
	
	
	
	
		
	
	public int size() {
		return heap.size();
	}

    public boolean isEmpty() {
	// heap size =0 array list
	if(size()==0) {
		return true;
	}
	return false;
}

}

