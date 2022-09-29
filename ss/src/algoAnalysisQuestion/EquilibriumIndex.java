package algoAnalysisQuestion;

public class EquilibriumIndex {
public static int equilibriumIndex(int [] arr) {
	// O(n)
	
	int n=arr.length,totalSum=0;
	for(int i=0;i<n;i++) {
		totalSum+=arr[i];
	}
	
	int i=1,leftSum=0,rightSum=totalSum-arr[0];
	while(i<n) {
		leftSum+=arr[i-1];
		rightSum-=arr[i];
		if (leftSum==rightSum) {
			return i;
		}
		i++;
	}
	
	
	
	
	return -1;// -1 define no index
	
    // O(n*m)  if m=n O(n^2) else <n^2
    
//		int n=arr.length;
//      int  mid=1;
//        while(mid<n){
           
//            int temp1=0,temp2=0;
//            for(int i=0;i<n;i++){
               
//                if(i<mid){
//                    temp1+=arr[i];
                   
//                }else if(i>mid){
//                    temp2+=arr[i];
//                }
//            }
//                     if(temp1==temp2)
//                         return mid;
                    
//                            else
//                                mid++;

                    
       
       
//	}return -1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
