package algoAnalysisQuestion;

import java.util.Arrays;

public class FindUniqueElement {
	public static int findDuplicate(int[] arr) {
		Arrays.sort(arr);
		int n=arr.length;
			if(n==1)
        return arr[0];
int answer=0;
for(int i=0;i<n-1;i++) {

	 if (arr[i]==arr[i+1]) {
		return arr[i];
		
	}else {
		continue;
	}
	
}return -1;
}
	public static int findUnique(int[] arr) {
        int n=arr.length;
        if (n==1){
            return arr[0];
        }
		int answer=0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;) {
			if(arr[i]==arr[i+1]) {
				i+=2;
				continue;
			}else {
				answer=arr[i];
				break;
			}
		}
        if(answer==0)
            answer=arr[n-1];
		return answer;
	}
	
	public static int findDuplicate2(int []arr) {
		
		int n=arr.length-2;
		int sum=0;
		for(int i : arr) {
			sum+=i;
		}
		return sum-(n*(n+1)/2);
		
	}
	
	public static int findUnique2(int[] arr)
	{
		int n=arr.length;
		int answer=0;
		for(int i=0;i<n;i++) {
			answer=answer^arr[i];// xor are associative and commutative
			/*   This code is working but how is it even working because the explanation given is

Let ^ be xor operator as in C and C++.

res = 7 ^ 3 ^ 5 ^ 4 ^ 5 ^ 3 ^ 4

Since XOR is associative and commutative, above expression can be written as:

res = 7 ^ (3 ^ 3) ^ (4 ^ 4) ^ (5 ^ 5)

= 7 ^ 0 ^ 0 ^ 0

= 7 ^ 0

= 7                      */
		}
		return answer;
	}
	public static void main(String[] args) {
//		int a[]= {2,4,7,2,7};
//		int b[]= {2,3,1,6,3,6,2};
//		System.out.println(findUnique(a));
//		System.out.println(findUnique(b));
		
//		 for (int i = 0; i < 5; ++i,++i) {
//			 System.out.print(i+" ");
//	        }
		 
			int b1[]= {2,5,1,1};
			int a1[]= {};
			System.out.println(findDuplicate2(b1));

//			int a[]= {2,4,7,2,7};
//			int b[]= {2,3,1,6,3,6,2};
//			System.out.println(findUnique2(a));
//			System.out.println(findUnique2(b));
	}

}
