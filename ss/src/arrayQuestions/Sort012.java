package arrayQuestions;

public class Sort012 {

	public static void Sort(int arr[]) {
		int n=arr.length;
		int i=0,j=n-1,k=0;// i=iteration , j=for element 2 ,and k=for element 0.
	while(i<=j) {
		if (arr[i]==0) {
			int temp=arr[k];
			arr[k]=arr[i];
			arr[i]=temp;
			i++;k++;
			
		}else if (arr[i]==1) {
			i++;
		}else {
			int temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			j--;
		}
		
	}
	}
	public static void main(String[] args) {
		int a[]= {0,1,2,0,2,0,1};
		Sort(a);
		printArray(a);
	}
	public static void printArray(int []a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
