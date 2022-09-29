package algoAnalysisQuestion;

import java.util.*;


public class Intersection {
	

	public static void intersection(int[] arr1, int[] arr2) {
	
		
		 Arrays.sort(arr1);
         Arrays.sort(arr2);
        int n=arr1.length;
        int k=arr2.length;
        if(n>=k) {
      	  int i=0,j=0;
      	  while(i<n&&j<k) {
      		  if(arr1[i]==arr2[j]) {
      			  System.out.print(arr1[i] +" ");
      			  j++;i++;
      		  }else {
      			  if(arr1[i]<arr2[j])
                         i++;
                    else
                        j++;
      				 
      		  }
      	  }
      	  }else {
      		  int i=0,j=0;
      		  while(i<k&&j<n) {
                    
      			  if(arr1[j]==arr2[i]) {
      				  System.out.print(arr2[i] +" ");
      				  j++;i++;
      			  }else{
                        
                     if(arr2[i]<arr1[j])
                         i++;
                    else
                        j++;
      				 
                            
                        }
      			  }
      		  
      	  }
        
        
//        int temp=0;
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<k;j++)
//            {
//                
//            if(arr1[i]==arr2[j])
//            {
//                //temp=arr[i];
//                System.out.print(arr1[i]+" ");
//                arr2[j]=Integer.MIN_VALUE;
//                break;
//            }
//        }
//    }
		
		
		
		
		
//	  	  int n1=arr1.length,n2=arr2.length;
//        //sorting first array
//	  for(int i=1;i<n1;i++) {
//		  for(int j=i-1;j>=0;j--) {
//			  if(arr1[j]>arr1[j+1]) {
//				  int temp=arr1[j];
//				  arr1[j]=arr1[j+1];
//				  arr1[j+1]=temp;
//			  }else {
//				  break;
//			  }
//		  }
//	  }
//        
//        //sorting second array
//        
//	  for(int i=1;i<n2;i++) {
//		  for(int j=i-1;j>=0;j--) {
//			  if(arr2[j]>arr2[j+1]) {
//				  int temp=arr2[j];
//				  arr2[j]=arr2[j+1];
//				  arr2[j+1]=temp;
//			  }else {
//				  break;
//			  }
//		  }
//	  }
//        
//     // printing equals in both array
//        
//	  if(n1>=n2) {
//	  int i=0,j=0;
//	  while(i<n1&&j<n2) {
//		  if(arr1[i]==arr2[j]) {
//			  System.out.print(arr1[i] +" ");
//			  j++;i++;
//		  }else {
//			  if(arr1[i]<arr2[j])
//                   i++;
//              else
//                  j++;
//				 
//		  }
//	  }
//	  }else {
//		  int i=0,j=0;
//		  while(i<n2&&j<n1) {
//              
//			  if(arr1[j]==arr2[i]) {
//				  System.out.print(arr2[i] +" ");
//				  j++;i++;
//			  }else{
//                  
//               if(arr2[i]<arr1[j])
//                   i++;
//              else
//                  j++;
//				 
//                      
//                  }
//			  }
//		  
//	  }
//          
	
	}


	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();	
		int a[]= new int [n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		
		int m=s.nextInt();
		int b[]= new int [m];
		for(int i=0;i<m;i++) {
			b[i]=s.nextInt();
		}
		intersection(a, b);
	}

}
