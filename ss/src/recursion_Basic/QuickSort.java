package recursion_Basic;

public class QuickSort {
	 public static int partition(int a[],int si,int ei){
	        int pivotElement=a[si];
	        int smallerNumCount=0;
	        for(int i=si+1;i<=ei;i++){
	            if(a[i]<pivotElement){
	                smallerNumCount++;
	            }
	        }
	        int temp=a[si+smallerNumCount];
	        a[si+smallerNumCount]=pivotElement;
	        a[si]=temp;
	        int i=si;
	        int j=ei;
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
	        return si+smallerNumCount;// i+1 index of pivot element then si=i+1, generally si=0;
	    }
	    public static void quickSort(int a[],int si,int ei){
	        if(si>=ei){
	            return;
	        }
	        int pivotIndex=partition(a,si,ei);
	        quickSort(a,si,pivotIndex-1);
	        quickSort(a,pivotIndex+1,ei);
	    }
	public static int  partition1(int a[],int start,int end) {// partition divide  one array two part ,from index temp-1 se
		int count=0;
		int i=start;
		
		while(i<=end) {// find actual position of a[0].
			if(a[start]>a[i]) {
				count++;
			}i++;
		}
		int temp=a[start];
		
		a[start]=a[start+count];
		a[start+count]=temp;
		
		//i to j swap 
		while(start<end) {
			if(a[start]>a[start+count]) {
				if(a[end]<a[start+count]) {
					int temp1 =a[end];
					a[end]=a[start];
					a[start]=temp;
					start++;end--;
				}else {
					end--;
				}
			}else {
				start++;
			}
		
		
		
		
		
	}
		return start+count;}
	public static void  quickSort1(int input[]) {
		quickSort11(input, 0, input.length-1);
		
	}
public static void  quickSort11(int input[],int start ,int end) {
	if(start>=end) {
		return;}
	int i=partition1(input,start,end);
	
	quickSort11(input,start,i-1);
	quickSort11(input, i+1, end);

	
}
	public static void main(String[] args) {
		int a[]= {3,5,4,1,2};
		quickSort1(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
	}

}
