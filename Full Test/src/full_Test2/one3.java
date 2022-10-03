package full_Test2;

//soart an array
import java.util.*;
public class one3{
	
	
	public class Solution { 
	    
	    
	   static class Pair{
	    int first;
	    int second;
	    Pair(int first,int second)
	    {
	        this.first=first;
	        this.second=second;
	    }
	    Pair()
	    {
	        
	    }
	}

	static void Sortelementsbyfreq(int arr[], int n)
	{
	  HashMap<Integer, Integer> map=new HashMap<>();
	  for (int i = 0; i < n; i++)
	  {
	      
	    map.put(arr[i],map.getOrDefault(arr[i],0)+1);
	  }
	  ArrayList<Pair> vec=new ArrayList<>();
	  for (int x:map.keySet())
	  {
	    vec.add(new Pair(x,map.get(x)));
	  }
	    Collections.sort(vec,(a,b)->{
	        if(a.second==b.second)
	        return a.first-b.first;
	        else
	        return b.second-a.second;
	    });
	  for (int i = 0; i < vec.size(); i++)
	  {
	    while (vec.get(i).second > 0)
	    {
	      System.out.print(vec.get(i).first+" ");
	      vec.get(i).second--;
	    }
	  }
	  
	}
	public static void main(String args[])
	{
	    Scanner s= new Scanner (System.in);
	        
	        int N= s.nextInt();
	        int arr[] =new int [N];
	        int i=0;
	        while(i<N){
	            
	           arr[i]=s.nextInt(); 
	            
	            i++;
	        }
	        
	        
	        
	       
	        
	  Sortelementsbyfreq(arr, N);
	 
	}
	}
	     
	
	
	
	public static void main(String args[])
	{
	    Scanner s= new Scanner (System.in);
	        
	        int N= s.nextInt();
	        int arr[] =new int [N];
	        int i=0;
	        while(i<N){
	            
	           arr[i]=s.nextInt(); 
	            
	            i++;
	        }
	        
	        
	        
	       
	        
	  Sortelementsbyfreq(arr, N);
	 
	}




	private static void Sortelementsbyfreq(int[] arr, int n) {
		
		
	}
	   
}