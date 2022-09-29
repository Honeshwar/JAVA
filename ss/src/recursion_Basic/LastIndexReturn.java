package recursion_Basic;

public class LastIndexReturn {

//public class Solution {
public static int indexReturnFromEnd(int a[],int x,int endIndex){
    if(endIndex==0){// base case when we reach endIndex =0
        if(a[endIndex]==x)// we check last time a[0]==x or not
            return endIndex;// for Yes
        else
            return -1; // for No
    }
    int answer=-1;
    if(a[endIndex]==x){ // checking start from endindex=input.length-1;shown in line 30.
        return endIndex;// if we got at index =input.length-1 ,our x number. we return index=input.length-1
        					// and line 16 not execute
        					// if false
    }
      answer= indexReturnFromEnd(a,x,--endIndex); // this recursion decrease index and we check each time for x number
        									// from line 3 to 15 ,
    										//  in 11 line , if condition is  false ,then again 16 line ececute untill recusion complete
    
    return answer;// this line execute only when when our recusive function (line 16) return value;
} 
	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
    
        return indexReturnFromEnd(input,x,input.length-1 );
	}
	
//}
	
	
	public static int indexReturnFromEnd1(int a[], int x,int startIndex) {
		if(startIndex==a.length-1) {
			if(a[startIndex]==x)
				return startIndex;
			else
				return -1;
		}
		int answer=indexReturnFromEnd1(a,x,++startIndex); // we did not pass any value to the function when we   call to callee.
   													 // we pass value to the function when we return from callee to call.
                                      				//but when our function meet if condition in line 4, then we start returning to function.
		if(answer== -1) {
			
			if(a[--startIndex]==x){// these condition for returning value after all calla and line 4
				return startIndex;// this will return  index of x;
			} else {
		 	return -1;
		 }
		}
		
		return answer;// this will return -1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
