package arrayQuestions;

public class SumOfTwoArray {
	  public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
		  
		  int carry=0;
	        int n1=arr1.length;
	        int n2=arr2.length;
	        int n3=0;
	        if(n2>n1){
	            n3=n2;
	        }
	        if(n1>n2){
	            n3=n1;
	        }
	        if(n1==n2){
	            n3=n1;
	        }
	        //n3--;
	        n2--;
	        n1--;
	        //int n3=Math.max(n1,n2)+1;
	        while(n3>0){
	            int sum=carry;
	            if(n1>=0){
	                sum+=arr1[n1--];
	            }
	            if(n2>=0){
	                sum+=arr2[n2--];
	            }
	            //carry=sum/10;
	            output[n3--]=sum%10;
	          //  n3--;  // THIS can be anywhere.
	            carry=sum/10;
	           // System.out.println(carry);// loop run all line before curly bracket "}".
	            							// then go back to check condition.
	        }
	        output[0]=carry;
	    	

		  
		  

	       //	    int i=arr1.length-1
//	    		,j=arr2.length-1,
//	    		k=output.length-1,carry=0;
//	    while(k>=0) {
//	    	if(i>=0&&j>=0) {
//	    	int temp=arr1[i]+arr2[j]+carry;
//	    	carry=temp/10;
//	    	output[k]=temp%10;
//	    	i--;j--;k--;}
//	    	else if(j<0&&i>=0) {
//	    		int temp2 = arr1[i]+carry;
//	    		carry=temp2/10;
//	    		output[k]=temp2%10;
//	    		i--;k--;
//	    	}else {
//	    		output[k]=carry;
//	    	}
//	    }
	    }

	public static void main(String[] args) {
		int a[]= {9,7,6,5,4};
		int b[]= {6,5,6};
		
		int c[]=new int [6];
	sumOfTwoArrays(a, b, c);
		printArray(( c));
	}
	public static void printArray(int []a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
