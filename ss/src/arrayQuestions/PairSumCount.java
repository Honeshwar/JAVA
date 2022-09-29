package arrayQuestions;

public class PairSumCount {
	 public static int pairSum(int arr[], int x) {
	        int count=0;
	    	int n=arr.length;
	        for (int i=0;i<=n-2;i++){
	            for (int j=i+1;j<n;j++){
	                if (arr[i]+arr[j]==x){
	                    count=count+1;
	                }
	            }
	        }
	        return count;
	    }
	public static void main(String[] args) {
int a[]= {1,2,4,5,3};
int b=5;
System.out.println(pairSum(a, b));// returning value cane directly printed or can stored some where


	}

}
