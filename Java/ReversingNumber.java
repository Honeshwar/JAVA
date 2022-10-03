package function;

import java.util.Scanner;

public class ReversingNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
       if (n==0) {
    	   System.out.print(n);
    	   return;
       }
        while(i>0) {

  	        int temp =n%10;
  	        
  	        if(temp!=0) {
  	        	break;
  	        }
        	n=n/10;
        }
        
       // int answer=n;while(answer>0) {
        		  while(n>0) {
        		         int answer =n%10;
        			//int result=answer%10;
//        			System.out.print(result);
//        			answer=answer/10;
        		         System.out.print(answer);
             			n=n/10;
        		  }
	}}
       











//        while(i>0) {
//        	int count =0;
//        	if(n==0) {
//        		break;
//        	}
//        	=n%10;
//        	count=count+1;
//        	if(i==i && answer==0) {
//        	
//        		n=n/10;
//        	}else {
//        	
//        	System.out.print(answer);
//        	n=n/10;
//        	i++;}
//        }
//	}

//}
