package recursion_Basic;

public class Recursion_Test1_Question1 {
public static int minCount1(int n) {
	if(n==0)
		return 0;
	if(n==1)
		return 1;
	int answer=0;
	for(int i=1;i<n;i++) {
		if(i*i<n) {
		answer=	i*i+minCount1(--n);
		
		}else {
			return 0;
		}
	}return answer;
}

public static int minCount2(int n){
	
	 if (n <= 3)
       return n;

   int result = n;
   for (int i = 1; i <= n; i++)
   {
       
       if (i*i > n)
           break;
       else
           result = Math.min(result, 1 + minCount2(n - i*i));
       //FIRST n-1 work until base case execute; 3 +1 (=4) +1 (=5) +1+1+1+1..n-3times  == result
       //next time new  result compare  with n-2 work u call
      // n-2 work,n-3.....;  i*i<n
   }
   return result;
}


public static void main(String[] args) {
		System.out.println(minCount2(9));

	}
public static int minCount3(int n) {
	 if (n <= 3)// 1^2=1,N=3,2,1, ANY SQUARE expect 1x1=1 not give value<=N
         return n;

     // getMinSquares rest of the
     // table using recursive
     // formula
     // Maximum squares required is
     int res = n;
     // n (1*1 + 1*1 + ..)

     // Go through all smaller numbers
     // to recursively find minimum
     for (int x = 1; x <= n; x++)
     {
         int temp = x * x;
         if (temp > n)
             break;
         else
             res = Math.min(res, 1 +
                      minCount3(n - temp));
     }
     return res;
 }

	
	
}

