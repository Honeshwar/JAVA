package priority_Queues_1;

public class InPlaceHeap {

	
	public static void main(String[] args) {
      int a[]= {8,2,3,4,5,1};
		
		heapSort(a);
		//original min heap
		System.out.println("original min heap"+"\n");
		for(int i=0;i<=a.length-1;i++)
			System.out.print(a[i]+" ");
		
		System.out.println();
		
		System.out.println("reverse min heap"+"\n");
		// reverse min heap
		for(int i=a.length-1;i>=0;i--)
			System.out.print(a[i]+" ");
	}

	private static void heapSort(int[] a) {
	// built min heap
		int n=a.length;
		// i do only non leap node m dow heapify,n/2
		for(int i=(n/2)-1;i>=0;i--) {//  n/2 O(N) min heap 
			downHeap(a,i,n);// min heap order maintain kar k se ga
		}
		
		// remove element from start,swap first and last than remove from CBT(assume remove by changing index) not array;
		for(int i=(n-1);i>=0;i--) {// O(n*logn)
			int temp=a[0];
			a[0]=a[i];
			a[i]=temp;
			
			downHeap(a, 0, i);// i-1 can manage in downHeap func while ( < i) or <=i-1, n-1 element elementate from CBT...
			
			
			
		}
		
	}

	private static void downHeap(int[] a, int parentIndex, int LengthOfARRYtoBemaintainMinHeapOrder) {
		// Yah maintain karna
		// parent priority < its childs
		
		int parentIndex1=parentIndex;
		int leftChildIndex= 2* parentIndex+1;
	    int  rightChildIndex=2* parentIndex+2;
	    
	    
	    
	    while(leftChildIndex < LengthOfARRYtoBemaintainMinHeapOrder) {
	    	int minIndex=parentIndex;
	    	
	    	if(rightChildIndex>= LengthOfARRYtoBemaintainMinHeapOrder && a[leftChildIndex] < a[minIndex])
	    	minIndex=leftChildIndex;
	    	
	    	if(rightChildIndex< LengthOfARRYtoBemaintainMinHeapOrder && a[rightChildIndex] < a[minIndex])
	    		minIndex=rightChildIndex;
	    	
	    	
	    	if(minIndex==parentIndex)
	    		return;
	    	
	    	
	    	
	    	int temp=a[parentIndex];
			a[parentIndex]=a[minIndex];
			a[minIndex]=temp;
	    	
	    	parentIndex=minIndex;
	    	leftChildIndex= 2* parentIndex+1;
		    rightChildIndex=2* parentIndex+2;
		    
		    
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    }
		 
	}
	
	
	
}
