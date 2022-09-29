package arrayQuestions;

public class IntersectionOfTwoArray {
	public static void printArray(int []a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
    public static void intersections(int arr1[], int arr2[]) {
    int a=arr1.length,b=arr2.length;
  //  if (a<b) {
    
    for (int i=0;i<a;i++) {
    	
    	for (int j=0;j<b;j++) {
    		if (arr1[i]==arr2[j]) {
    			
    			System.out.print(arr2[j]+" ");
    			arr2[j]=Integer.MAX_VALUE;
    			break;
    		}
    	}
    }
    
    	
//    }	else {
        
//        for (int i=0;i<b;i++) {
//        	
//        	for (int j=0;j<a;j++) {
//        		if (arr2[i]==arr1[j]) {
//        			System.out.print(arr2[i]+" ");
//        			break;
//        		}
//        	}
//        }
//        	
//        }	
//    	
//    	for(int i=0;i<arr2.length;i++) {
//    		
//    	}
//
   }
    
	public static void main(String[] args) {
		int a[] = {9, 9 ,8, 5};
		int a1[] = { 9, 2, 4, 1, 8 };
		intersections(a, a1);
int a3=Integer.MAX_VALUE;
System.out.println(a3);
System.out.println(a3=Integer.MIN_VALUE);
	}

}
