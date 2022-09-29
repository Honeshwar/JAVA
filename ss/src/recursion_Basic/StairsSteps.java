package recursion_Basic;

public class StairsSteps {
	
	  public static int staircase(int n){
			
		  if(n==1)
	        return 1;
	    if(n==2)
	        return 2;
	    if(n==3)
	        return 4;
	    int output=0;
	    if(n>3){
	    
	         output= staircase(n-1)+staircase(n-2)+staircase(n-3);}
	    
	    return output;
	
	  }
public static int staircase1(int n) {
	if(n<1) {
		return 0;
	}
	if(n==1) {
		return 1;
	}
//	if(n==2)// this is base case
//		return 2;
//		if(n==3)
//			return 4;
	int a=staircase(n-1);//for 1 step
	int b=staircase(n-2);//for two step
	int c=staircase(n-3);//for three step
	int output =a+b+c;
	return output;
}

//ideal
public static long staircase2(int n) {
		//Your code goes here
     if(n<0)
         return 0;
     if(n == 0){
         return 1;
     }
    
     long ans1 = staircase(n-1);
     long ans2 = staircase(n-2);
     long ans3 = staircase(n-3);
    
     return ans1+ans2+ans3;
    
	}



public static void main(String[] args) {
		System.out.println(staircase1(4));// 7 z 15
		
		
	}

}
