package full_Test2;

	import java.io.*; 
	import java.util.*;
	public class one4{
	
	 public static void main(String[] args) 
	
	    { 
	 
	        Scanner s=new Scanner(System.in);
	 
	        
	 
	            int n=s.nextInt();
	  
	            int k=s.nextInt();
	  
	            System.out.println(find(n,k));
	  
	        
	 
	    }
	  
	    public static int find(int n,int k){
	  
	        if(n==1)
	  
	            return 1;
	  
	       return (find(n-1,k)+k-1)%n+1;
	  
	    }   
		 
		
	} 


 