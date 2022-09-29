package recursion_Basic;

public class MergeSortAwesomeAlgo {
	
	public static void mergeTwoUnSortArray(int[] a,int b[],int d[]){
	int i=0,j=0,k=0;
	while(i<a.length&&j<b.length) {// when i<=1 and j<=2
	if(a[i]<=b[j]) {
		d[k]=a[i];
		i++;k++;
	}else {
		d[k]=b[j];
		j++;k++;
		
	}
	}
	while(i<a.length) {
		d[k]=a[i];
		i++;k++;
	}
	while(j<b.length) {
		d[k]=b[j];
		k++;j++;
	}
	}
	
	public static void mergeSort(int[] input){
		
		if(input.length==1) {//because single array is sorted
			return;
		}
		int split=(input.length)/2; //split into two half
		
		int [] small_1=new int[split]; // size small
		int [] small_2=new int[(input.length)-small_1.length];// size large
		
		// fill above created split array
		int i=0,j=0;
		while( i<=input.length-1) {
			if(i<split) {
				small_1[i]=input[i];
				i++;
			}else {
				small_2[j]=input[i];
				i++;j++;
			}
		}
			// here we sort above two array.
			mergeSort(small_1);
			mergeSort(small_2);
			// here we call mergeTwoSortArray to combine this two array into our first array.
			 mergeTwoUnSortArray(small_1, small_2, input);
		//	print(input);
		
	}
	public static void print1(int a[],int start) {
		if(a.length==start) {
			return;
		}System.out.print(a[start]+" ");
		print1(a,++start);
			
		
	}public static void print(int a[]) {
		print1(a,0);
		
		
	}
	public static void main(String[] args) {
		int a[]= {2,8,6,7,3,5};
		mergeSort(a);
       //print(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
	}

}
