package algoAnalysisQuestion;

import java.util.Scanner;

public class HHH {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println(1/10);
	 int number=s.nextInt();
     // boolean answer =true;
      int temp,answer=0;
      int n=number;
    while(n>0){
        temp=n%10;
        
        answer=answer*10+temp;
      //  System.out.println( answer);
        n=n/10;// n changes decrease
    }
    //System.out.println(answer+" " +n); // n changing n
      if(answer==number){
        System.out.println("true");

    }else{
        System.out.println("false");

    }
	
	
	
//	Scanner s=new Scanner(System.in);
//	 int n=s.nextInt();
//     for(int i=1;i<=n;i++){
//    	 int j=i;
//         for(;j<=n;j++){ 
//         int    k=2*j-1;
//                 System.out.print(k);
//                 }
//        		j=1;
//                     while(j<=i-1){
//                         System.out.print(2*j-1);
//								j++;
//                     }
//               
//         
//         System.out.println();
//
//     }
}
}
