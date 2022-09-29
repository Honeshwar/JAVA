package recursion_Basic;
import java.util.*;
public class MergeSort {
	
	public static void mergeTwoUnSortArray(int[] a,int b[],int i,int j,int k){
	int n[]=new int[a.length+b.length];
		if(j>=b.length) {
			return;//	return n;
			}
		if(i<a.length) {
		
		
			mergeTwoUnSortArray(a, b, ++i, j,++k);
			if(a[i]<=b[j]) {n[k]=a[i]; return ;
		}else {
			
			mergeTwoUnSortArray(a, b, i, ++j,++k);
			n[k]=b[j];
			
			while(j>a.length&&j<b.length) {
				n[k++]=b[j++];
		}
			return ;
		}
		}
//	return n;
		print(n);
	}
	
	public static void mergeSort(int[] input){
		int split=(input.length)/2; //split into two half
		
		int [] small_1=new int[split]; // size small
		int [] small_2=new int[(input.length)-split];// size large
		
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
			
			// here we sort above two array.
			Arrays.sort(small_1);
			Arrays.sort(small_2);
			// here we call mergeTwoSortArray to combine this two array into our first array.
			mergeTwoUnSortArray(small_1, small_2, -1,-1,-1);
		//	print(input);
		}
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
      // print(a);
	}

}
