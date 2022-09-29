package priority_Queues_1;

public class CheckMaxHeap {

	public static boolean checkMaxHeap(int arr[]) {
		
		if(arr.length==0)
			return true; // nothing > nothing , nothing true
		// max heap , parent priority > than its childs priority
		    
		    int parentIndex=0;			
			int leftChildIndex= 2*parentIndex+1;
			int rightChildIndex= 2*parentIndex+2;
			
			int n = arr.length;
			while(leftChildIndex<n) {
				
				if(arr[parentIndex] < arr[leftChildIndex]) {
					return false;
				}
				
				if( rightChildIndex < n && arr[parentIndex] < arr[rightChildIndex]) {
					return false;
				}
				
				
				
				 parentIndex++;
				 leftChildIndex= 2*parentIndex+1;
				 rightChildIndex= 2*parentIndex+2;
					
				
				
			
			
			
			
			
			
			
			
		}
			return true;
		
		
	}
	
	
	public static void main(String[] args) {
		int arr[]= {22,22,22,22,22,22};
		
		System.out.println(checkMaxHeap(arr)+" "+func(arr) );
		
	}
		
		
	static boolean func(int arr []) {	
		if(arr.length==0)
			return true; // nothing > nothing , nothing true
		// max heap , parent priority > than its childs priority
		    
		    int n=arr.length;
		    for(int i=0;i<n-1;i++) {//i=parentIndex  ,, 2 * i + 1 < n
			int leftChildIndex= 2*i+1;
			int rightChildIndex= 2*i+2;
				
				if( leftChildIndex < n&& arr[i] < arr[leftChildIndex]) {
					return false;
				}
				
				if( rightChildIndex < n && arr[i] < arr[rightChildIndex]) {
					return false;
				}
				
				
				
			}
				
			return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
