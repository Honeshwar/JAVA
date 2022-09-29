package recursion_Basic;

public class ReturnIndex {

//public class Solution {
public static int indexReturn(int a[],int x,int startIndex){
    if(startIndex==a.length-1){// base case when we reach length of array= startIndex 
        if(a[startIndex]==x)// we check last time a[last]==x or not
            return startIndex;// for Yes
        else
            return -1; // for No
    }
    int answer=-1;
    if(a[startIndex]==x){ // checking start from index=0
        return startIndex;// if we got at index =0 ,our x number. we return index=0
        					// and line 16 not execute
        					// if false
    }
      answer= indexReturn(a,x,startIndex+1); // this recursion increase index and we check each time for x number
        									// from line 3 to 15 ,
    										// if  in 11 line  id condition is  false ,then again 16 line ececute
    
    return answer;// this line execute only when when our recusive function (line 16) return value;
} 
	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		int result=indexReturn(input,x,0);
        return result;
	}
	
//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
