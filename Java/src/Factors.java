package fundamental;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		short n=s.nextShort();
		short i=2,factor;
	boolean count =true;//int count=0;
	if (n>0) {
		while(i<n)
		{
			
if (n%i==0) {
	factor=i;
	count=false;//count= count+1;
	
	System.out.print(factor+" "); 
}
i++;
}
	if (count) {
		System.out.println(i+" is prime,only divisible by 1 and "+i);
	
		
	}}else {
		System.out.println(n);
	}
		
		
		
		
		
		
		
		
		
		
//		Scanner s = new Scanner(System.in);
//		short n=s.nextShort();
//		short i=2,factor;
//while (i<=n/2) {
//	if (n%i==0) {
//		System.out.print(i+" ");
//	}i++;;
//}
		
		
		
		
		
//		Scanner s = new Scanner(System.in);
//		short n=s.nextShort();
//		short i=2,factor;
//	int count=0;
//	if (n>0) {
//		while(i<n)
//		{
//			
//if (n%i==0) {
//	factor=i;
//	count= count+1;
//	
//	System.out.print(factor+" "); 
//}
//i++;
//}
//	if (count==0) {
//		System.out.println(i+" is prime,only divisible by 1 and "+i);
//	
//		
//	}}else {
//		System.out.println(n);
//	}
		
		
		
		
		
		
		

//else if () {
//	System.out.println(i+" is prime,only divisible by 1 and "+i);


//else {
//	int j=2;
//	if (j<n) {
//		if(n%j==0) {
//			count=count+1;
//		j++;	
//		}else {
//			j=j+1;}}
//	
//		
//		else {
//			if (count==2) {
//				System.out.println(j+" is prime,only divisible by 1 and "+j);
//				i++;
//			}else {
//				i++;
//			}
//		}
//		
	
	
}
//i++; 
		}
	

//}
