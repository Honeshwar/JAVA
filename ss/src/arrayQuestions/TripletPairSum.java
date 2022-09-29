package arrayQuestions;

import java.util.Arrays;

public class TripletPairSum {

	 class Solution {	

		public static int tripletSum(int[] arr, int num) {
			
	        Arrays.sort(arr);
	        int numTriplets = 0;
	        
	        for(int i = 0; i < arr.length; i++){
	            int pairSumFor = num - arr[i]; // Making triplet to pair 
	            int numPairs = pairSum(arr, (i+1), (arr.length-1), pairSumFor);  // Find all pairs
	            numTriplets += numPairs; // Add all pairs to triplets
	        }
	        
	        return numTriplets;
		}
	    
	    //Pair Sum with two pointer approach
	    private static int pairSum(int[] arr, int startIndex, int endIndex, int num){
	        int pairCount = 0;
	        
	        while(startIndex < endIndex){
	            if(arr[startIndex] + arr[endIndex] > num){
	                endIndex--;
	            }else if(arr[startIndex] + arr[endIndex] < num){
	                startIndex++;
	            }else{
	                 if (arr[startIndex] == arr[endIndex]) {
	                       int totalCount = (endIndex - startIndex) + 1;
	                       pairCount += (totalCount * (totalCount - 1) / 2);
	                       break;
	                   }
	                    
	                    int tempI = startIndex + 1;
	                    int tempJ = endIndex - 1;
	                    
	                    while (tempI <= tempJ && arr[startIndex] == arr[tempI]) {
	                        tempI++;
	                    }
	                    
	                    while (tempI <= tempJ && arr[endIndex] == arr[tempJ]) {
	                        tempJ--;
	                    }
	                    
	                    int totalElementFromStart = (tempI - startIndex);
	                    int totalElementFromEnd = endIndex - tempJ;
	                    
	            		pairCount += (totalElementFromStart * totalElementFromEnd);
	                    
	                    startIndex = tempI;
	                    endIndex = tempJ;
	                    
	                }
	            }
	        return pairCount;
	    }
	}
}
