package full_Test2;

public class one1 {
	
	
	// not work for all cases
	 public static void israinbow(int [] arr){
	       
	        int n=arr.length-1;
	        boolean flag=false;
	        for(int i=0;i<arr.length;i++)
	        {
	            if(arr[i]>7){
	                System.out.println("no");
	            return;}

	            if(arr[i]==arr[n--] && arr[i]<7)
	                flag=true;
	            
	            else
	                flag=false;
	        }
	        
	        if(flag)
	            System.out.println("yes");
	  else
	      System.out.println("no");

	        
	    }

	
}
