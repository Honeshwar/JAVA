package priority_Queues_1;

public class HeapSortInplace {
	public class Solution {

//	 	public static void inplaceHeapSort(int a[]) {
		
//	 	// built min heap
//	 		int n=a.length;
//	 		// i do only non leap node m dow heapify,n/2
//	 		for(int i=(n/2)-1;i>=0;i--) {//  n/2 O(N) min heap 
//	 			downHeap(a,i,n);// min heap order maintain kar k se ga
//	 		}
			
//	 		// remove element from start,swap first and last than remove from CBT(assume remove by changing index) not array;
//	 		for(int i=(n-1);i>=0;i--) {// O(n*logn)
//	 			int temp=a[0];
//	 			a[0]=a[i];
//	 			a[i]=temp;
				
//	 			downHeap(a, 0, i);// i-1 can manage in downHeap func while ( < i) or <=i-1, n-1 element elementate from CBT...
				
				
				
//	 		}
			
//	 	}

//	 	private static void downHeap(int[] a, int parentIndex, int LengthOfARRYtoBemaintainMinHeapOrder) {
//	 		// Yah maintain karna
//	 		// parent priority < its childs
			
//	 		int parentIndex1=parentIndex;
//	 		int leftChildIndex= 2* parentIndex+1;
//	 	    int  rightChildIndex=2* parentIndex+2;
		    
		    
		    
//	 	    while(leftChildIndex < LengthOfARRYtoBemaintainMinHeapOrder) {
//	 	    	int minIndex=parentIndex;
		    	
//	 	    	if(rightChildIndex>= LengthOfARRYtoBemaintainMinHeapOrder && a[leftChildIndex] < a[minIndex])
//	 	    	minIndex=leftChildIndex;
		    	
//	 	    	if(rightChildIndex< LengthOfARRYtoBemaintainMinHeapOrder && a[rightChildIndex] < a[minIndex])
//	 	    		minIndex=rightChildIndex;
		    	
		    	
//	 	    	if(minIndex==parentIndex)
//	 	    		return;
		    	
		    	
		    	
//	 	    	int temp=a[parentIndex];
//	 			a[parentIndex]=a[minIndex];
//	 			a[minIndex]=temp;
		    	
//	 	    	parentIndex=minIndex;
//	 	    	leftChildIndex= 2* parentIndex+1;
//	 		    rightChildIndex=2* parentIndex+2;
			    
			    
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
//	 	    }
			 
//	 	}
	// }
		
	    
	    

	    
	  	public static void inplaceHeapSort(int arr[]){
	        //Build the heap
	        int n= arr.length;
	        for(int i=(n/2)-1; i>=0;i--){
	            downHeapify(arr,i,n);
	        }
	        //Remove elemts from starting one by one, and put them at respective last position
	        for(int i=n-1;i>=0;i--){
	          int temp= arr[i];
	          arr[i]= arr[0];
	          arr[0]= temp;
	          downHeapify(arr, 0,i);
	        }
	    }
	  
	    
	    
	    public static void downHeapify(int arr[],int i,int n){
	    
	    int parentIndex=i;
	    int leftChildIndex= 2*parentIndex+1;
	    int rightChildIndex= 2*parentIndex+2;

	    while(leftChildIndex<n){
	        int minIndex= parentIndex;
	        if(arr[leftChildIndex] <arr[minIndex]){
	            minIndex=leftChildIndex;
	        }

	        if(rightChildIndex<n && arr[rightChildIndex]<arr[minIndex]){
	            minIndex= rightChildIndex;
	        }
	        if(minIndex==parentIndex){
	            return ;
	        }
	        int temp= arr[parentIndex];
	        arr[parentIndex] = arr[minIndex];
	        arr[minIndex]= temp;
	        parentIndex= minIndex;
	        leftChildIndex= 2*parentIndex+1;
	        rightChildIndex= 2*parentIndex+2;

	    }

	}
	    
	}
	
	
	
	
	public class Solution2 {
		/*
		 * Time complexity: O(log(N)) 
		 * Space complexity: O(1)
		 * 
		 * where N is the size of the input array
		 */
		public static void inplaceHeapSort(int arr[]) {
			// Build Heap
			for (int i = 1; i < arr.length; i++) {
				int childIndex = i;
				int parentIndex = (childIndex - 1) / 2;

				while (childIndex > 0) {
					if (arr[childIndex] > arr[parentIndex]) {
						break;
					}
					int temp = arr[childIndex];
					arr[childIndex] = arr[parentIndex];
					arr[parentIndex] = temp;
					childIndex = parentIndex;
					parentIndex = (childIndex - 1) / 2;
				}
			}

			// Remove min
			for (int i = arr.length - 1; i >= 0; i--) {
				int min = arr[0];
				arr[0] = arr[i];
				arr[i] = min;

				int parentIndex = 0;
				int leftChildIndex = 2 * parentIndex + 1;
				int rightChildIndex = leftChildIndex + 1;
				while (parentIndex < i) {
					int minIndex = parentIndex;
					int minValue = arr[minIndex];

					if (leftChildIndex < i) {
						int leftChild = arr[leftChildIndex];
						if (leftChild < minValue) {
							minIndex = leftChildIndex;
							minValue = arr[minIndex];
						}
					}
					if (rightChildIndex < i) {
						int rightChild = arr[rightChildIndex];
						if (rightChild < minValue) {
							minIndex = rightChildIndex;
							minValue = arr[minIndex];
						}
					}
					if (parentIndex == minIndex) {
						break;
					} else {
						arr[minIndex] = arr[parentIndex];
						arr[parentIndex] = minValue;
					}
					parentIndex = minIndex;
					leftChildIndex = 2 * parentIndex + 1;
					rightChildIndex = leftChildIndex + 1;
				}
			}
		}
	}
}
