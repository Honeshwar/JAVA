package recursion_Basic;

public class BinarySearch {
	public static int binarySearch(int a[],int start,int end,int x) {
		if(start>end) {
			return -1; 
		}
		int mid=(start+end)/2;
		if(a[mid]==x) {
			return mid;
		}
		else if(a[mid]<x) {
			return binarySearch(a, mid+1, end, x);
		}else {
			return binarySearch(a, start, mid-1, x);
		}
		
		
	}
	public static void main(String[] args) {
		int b[]= {1,2,3,4,5,6,7,7};
		System.out.println(binarySearch(b, 0, b.length-1, 7));
	}

}
