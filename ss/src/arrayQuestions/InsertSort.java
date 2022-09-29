package arrayQuestions;
public class InsertSort {
	public static void printArray(int []a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
public static void insertSort(int []arr) {// sort have void return type
	int n=arr.length;
	for (int i=0;i<=n-2;i++) {
		for(int j=i;j>=0;j--) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			else {
				break;
			}
		}
	}
}
public static void  insertSort2(int arr[]) {
	for (int i=1;i<arr.length;i++) {// i is consider as unsorted array part		
	int temp=arr[i]; 
	int j=i-1;
	while (j>=0&&arr[j]>temp) {
		arr[j+1]=arr[j];
		j--;
	}arr[j+1]=temp;
//		for (int j=i-1;j>=0;j--) {// j=i-1 is consider as sorted part
//		if (arr[j]>temp) {
//			arr[j+1]=arr[j];
//			
//		}
//	}arr[j+1]=temp;
	
	}
}
	public static void main(String[] args) {
		int a[]= {9,7,2,8,5,1};
		//insertSort(a);
		insertSort2(a);
		printArray(a);
		insertSort(a);
		printArray(a);
	}

}
