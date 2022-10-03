package fundamental;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
//		  int x=5;
//		    int y=5;
//		    while((x=5)==y)
//		    {
//		        System.out.println("Hello");
//		        x++;
//		        y++;
//		    }
	
//	Scanner s = new Scanner(System.in);
//	int n =s.nextInt();
//	int i=1,sum=0;
//	sum = n*(n+1)/2;
//	
////	while (i<=n) {// while (i<=n);  compiler does not check block of loop because due to terminator ;, and loop run infinite times
////		sum =sum+i;
////		i=i+1;
////	}
//	System.out.println(sum);
//	
//	Scanner n = new Scanner(System.in);
//	int s=n.nextInt();
//	int e=n.nextInt();
//	int w=n.nextInt();	
//	int celsius ; 
//	while (s<=e) {
//		celsius= (s-32)*5/9;
//		System.out.println(s +" " + celsius);
//		//s=s+w;
//		s+=w;
//	}

		Scanner s = new Scanner(System.in);
	  int n=s.nextInt();
	    boolean isprime=true;
	    if(n%2==0)
	        isprime=false;
	    int i=3;
	    while(isprime&&i<n)
	    {
	        isprime=!(n%i==0);
	        i+=2;
	    }
	    if(isprime)
	    {
	        System.out.println("Prime");
	    }
	    else
	    {
	        System.out.println("Composite");
	    }
	
	
	
	
	
	
	
	}
}

