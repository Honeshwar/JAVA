package algoAnalysisQuestion;

import java.util.Arrays;

public class FindPairSum {
	public static int pairSum(int[] arr, int num) {
		int answer=0;
		Arrays.sort(arr);
		int n=arr.length;
		for(int i=0,j=n-1;i<j;) {
			int temp =arr[i]+arr[j];
			if(temp==num)
				answer++;
			if(temp>num) {
				j--;
			}else {
				i++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		int a[]= {5,8,2,5,-2,10};
		System.out.println(pairSum(a, 10));

	}

}
