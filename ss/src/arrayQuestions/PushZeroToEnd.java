package arrayQuestions;

public class PushZeroToEnd {
	
	 public static void pushZerosAtEnd(int[] arr) {
	    	int n=arr.length;
	    	int i=0,j=0;// i  indexing for seen array element and condition compare and other j for 
	    				// changing array element accordingly to j position
	    			
	    	while(i<n) {
	    		if (arr[i]!=0) {//other than zero
	    			
	    				arr[j]=arr[i];//j index ma i index seen array entered
	    				i++;
	    				j++;// increase indexing for other element
	    				}else {
	    					i++;//if arr[i]=0 then no need to stored that 0 in jth index	
	    					    // move to other element to seen and check condition
	    				}
	    		
	    	}
	    	while(j<n) {
	    		arr[j]=0;
	    		j++;
	    	}
	    	
	    	
	    	
//	    	for(int i=0;i<n;i++) {
//	    		if (arr[i]==0) {
//	    			int j=i;
//	    			while(j<=n-2) {
//	    				arr[j]=arr[j+1];	
//	    				j++;
//	    				}
//	    		}
//	    		
//	    	}
//	        int i=0,j=0;
//	        while (i<n){
//	            if(arr[i]==0){
//	                i++;
//	                continue;
//	            }
//	            else{
//	                arr[j]=arr[i];
//	                arr[i]=0;
//	                j++;
//	            }
//	            i++;
//	            
//	        }
	        
	        
	    }

	public static void main(String[] args) {
		int a[]= {2,0,8,0};
		pushZerosAtEnd(a);
		printArray(a);
	}
	public static void printArray(int []a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
