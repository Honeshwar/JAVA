package priority_Queues_1;

import java.util.ArrayList;

public class MAX_Priority_Queue<V> {
	
// if i create class with generic symbol MAX_Priority_Queue<V>,
	// so it (<V>) will be generic not class name.

	
	private ArrayList<Element<V>> heap; // internal use ka liya , visualization in for of CBT.
	
	
	public MAX_Priority_Queue() {
		heap=new ArrayList<Element<V>>();
		
	}
	
	
	
	public void insert(V value,int priority) {// value = object , person , passenger..etc..
		
		Element <V> e=new Element<V>(value,priority);
		heap.add(e);
		
		int childIndex=heap.size()-1;// newely added element .
		int parentIndex= (childIndex-1)/2 ;
		
		
		while(childIndex<=0) { // re-heap or up heapify.
		// swap when
		if(heap.get(childIndex).priority>heap.get(parentIndex).priority) {
			Element <V> temp=heap.get(parentIndex);
			// swap // replace 
			heap.set(parentIndex, heap.get(childIndex));
			heap.set(childIndex, temp);
			childIndex=parentIndex;
			parentIndex= (childIndex-1)/2;
		}else {
			return;
		}
		
		}
		
		
		
	}

	void insert1(V value,int elem) {
		Element<V> element=new Element<V>(value,elem);
		heap.add(element); // last
        
        int childIndex=heap.size()-1;
        int parentIndex=(childIndex-1)/2;
        
        while(childIndex>0){// up heapify
        if(heap.get(parentIndex).priority<heap.get(childIndex).priority){
        	Element<V> temp=heap.get(parentIndex);
            heap.set(parentIndex,heap.get(childIndex));
            heap.set(childIndex,temp);
                     
                     childIndex=parentIndex;
                     parentIndex=(childIndex-1)/2;
                     
            
            
        }else{
            return;
        }
                     }
	}
                     

	int removeMax() {
        
	if(heap.isEmpty())
         return Integer.MIN_VALUE;
        
        
        //swap to delete
       int ans=heap.get(0).priority;
        heap.set(0,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        
        // voilate maxheap order property
        
        int parentIndex=0;
        int leftChildIndex=1;
        int rightChildIndex=2;
        
        
        
        while(leftChildIndex<heap.size()){
        int minIndex=parentIndex;
        
            if( rightChildIndex<heap.size() && heap.get(leftChildIndex).priority>heap.get(rightChildIndex).priority)
		{
           minIndex=leftChildIndex;
		}else {
			if(rightChildIndex<heap.size())
			minIndex=rightChildIndex;
		}
//         if(heap.get(leftChildIndex)>heap.get(minIndex));
//            minIndex=leftChildIndex;
        
//         if(rightChildIndex<heap.size() && heap.get(rightChildIndex)>heap.get(minIndex));
//            minIndex=rightChildIndex;
        
            if(parentIndex==minIndex)
                break;
           else{     
       Element<V> temp=heap.get(minIndex);
        heap.set(minIndex,heap.get(parentIndex));
        heap.set(parentIndex,temp);
        
        parentIndex     = minIndex;
        leftChildIndex  = 2*parentIndex +1;
        rightChildIndex = 2*parentIndex +2;}
	}
        return ans;
        
}




	
	
	
	
	
	
	
	
	
	
	
	
	
	// max heap order , evwey node(Parent) priority is > its childs priority
	public V getMAX() throws PriorityQueueException {
		if(isEmpty())
			throw new PriorityQueueException();
		
		return heap.get(0).value;
	}
		public boolean isEmpty() {
		if(size()==0)
			return true;
		return false;
	}
	public int size() {
		return heap.size();
	}
}
