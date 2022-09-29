package recursion_Basic;

import java.util.Scanner;

public class QuickSort1 {
public static int partition(int a[],int start,int end) {
	int pivotElement=a[start];
	int count=0;
	for(int i=start+1;i<=end;i++) {
		if(pivotElement>a[i]) {
			count++;
		}
	}
	int temp1=a[start+count];
	a[start+count]=pivotElement;
	a[start]=temp1;
	 int i=start;
     int j=end;
     int temp;
     while(i<j){
         if(a[i]<pivotElement){
             i++;
         }else if(a[j]>=pivotElement){
             j--;
         }else{
              temp=a[i];
             a[i]=a[j];
             a[j]=temp;
             i++;
             j--;
         }
     }
//	while(start<end33) {
//		if(a[start]>pivotElement&&a[end]<=pivotElement) {
//			int temp2=a[end];
//			a[end]=a[start];
//			a[start]=temp2;
//			start++;end--;
//		}else if(a[start]<pivotElement&&a[end]<=pivotElement) {
//			start++;
//		}else {
//			start++;
//			end--;
//		}
//	}
//	return count+start;// index error because start getting change after becoming false in while loop
	
     return count+start;
}
public static void quickSort(int a[],int start,int end){
    if(start>=end){
        return;
    }
    int index=partition(a,start,end);
    quickSort(a,start,index-1);
    quickSort(a,index+1,end);
}
public static void quickSort(int[] input) {
//	int i=partition(input, 0, input.length-1);
	quickSort(input, 0, input.length-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]= new int [n];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		quickSort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
	}

}
