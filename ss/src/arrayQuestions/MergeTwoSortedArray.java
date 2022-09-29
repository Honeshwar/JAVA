package arrayQuestions;

public class MergeTwoSortedArray {
	public static void printArray(int []a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static int []mergeArray(int[]arr1,int[]arr2){
		int n1=arr1.length,n2=arr2.length;
		int n3=n1+n2;
		
		int arr3[]=new int[n3];// reference created memory m
		
		
		int i=0,j=0,k=0;
		while(i<n1 && j<n2) {
			if (arr1[i]<=arr2[j]) {
				arr3[k]=arr1[i];
				i++; k++;
			}else {
			arr3[k]=arr2[j];
			j++;k++;
			}
			
		}
		while(i<n1) {
			arr3[k]=arr1[i];
			i++;k++;
		}
		while(j<n2) {
			arr3[k]=arr2[j];
			j++;k++;
		}
		
		return arr3;
	}

	
	
	public static void main(String[] args) {
		int a[]= {1,5,6,10,11,13,15};
		int b[]= {2,4,6,7,9};
		int c[]=mergeArray(a, b);//  c has different reference,
		                        //returning array has different reference
							//that stored by c variable,now c has different reference
		printArray(c);
	}

}
