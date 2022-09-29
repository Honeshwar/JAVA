package priority_Queues_1;

public class InplaceHeapSort {

	public static void main(String[] args) {
		int a[]= {8,2,3,4,5,1};
		
		inplaceHeapSort(a);
		for(int e:a)
			System.out.print(e+" ");
	}

	private static void inplaceHeapSort(int[] a) {
		
		int n=a.length;
		for(int i=(n/2)-1;i>=0;i--) 
		built(a);
		for(int i=(n-1);i>=0;i--) 
		removeSwap(a);
		
	}

	private static void removeSwap(int[] a) {
		int n= a.length-1;
		//swap
		int el=a[0];
		a[0]=a[n];
		a[n]=el;
		 // down heapify , maintain min heap
		
		int parentIndex=0;
		int leftChildIndex= 1;  // 2*parentIndex +1;
		int rightChildIndex= 2; // 2*parentIndex +2;
		
		
		while(leftChildIndex<=n ) {
			//&& rightChildIndex<=n // possible that cbt have leftchild  alone only,
			// not possible that cbt have rightchild alone only, it voilate CBT property( 1 and 2.. ).
			// when swap
			//min heap parent priorit < its childs
			// min among them
			int minIndex=parentIndex;
			if( rightChildIndex<=n ) { // with in range
				if( a[leftChildIndex] < a[rightChildIndex])
			   minIndex=leftChildIndex;
				else
					minIndex=rightChildIndex;
			}else {
					minIndex=leftChildIndex;
			}
			
			
//			if(parentIndex == minIndex) {
//				break;
//			}
			
			
			if( parentIndex != minIndex  && a[parentIndex] > a[minIndex]) {
				
				int el2 = a[parentIndex];
				a[parentIndex]=a[minIndex];
				a[minIndex]=el2;
				
				parentIndex=minIndex;
				leftChildIndex= 2*parentIndex +1;
			     rightChildIndex= 2*parentIndex +2;
				
				
			}
			else {
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
// min heap
	private static void built(int[] a) {
		if(a.length==0)
		return ;
		
		int n=a.length;// no. of nodes
		for(int i=(n/2)-1;i>=0;i--) { // n/2 - 1  no. of non leaf nodes
			
			// down heapify
			// currenly i have parent
			int parentIndex=i;
			int leftChildIndex= 2*parentIndex +1;
			int rightChildIndex= 2*parentIndex +2;
			
			
			while(leftChildIndex<n ) {
				//&& rightChildIndex<=n // possible that cbt have leftchild  alone only,
				// not possible that cbt have rightchild alone only, it voilate CBT property( 1 and 2.. ).
				// when swap
				//min heap parent priorit < its childs
				// min among them
				int minIndex=parentIndex;
				if( rightChildIndex<n ) { // with in range
					if( a[leftChildIndex] < a[rightChildIndex])
				   minIndex=leftChildIndex;
					else
						minIndex=rightChildIndex;
				}else {
						minIndex=leftChildIndex;
				}
				
				
//				if(parentIndex == minIndex) {
//					break;
//				}
				
				
				if( parentIndex != minIndex  && a[parentIndex] > a[minIndex]) {
					
					int el = a[parentIndex];
					a[parentIndex]=a[minIndex];
					a[minIndex]=el;
					
					parentIndex=minIndex;
					leftChildIndex= 2*parentIndex +1;
				     rightChildIndex= 2*parentIndex +2;
					
					
				}
				else {
					break;
				}
				
			}
			
		}
		// it(function) will give me an udated  input array  with min heap order.
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
