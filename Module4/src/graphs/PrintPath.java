package graphs;
import java.io.IOException;
import java.util.*;
public class PrintPath {
	public class Solution {

		public static void main(String[] args) throws NumberFormatException, IOException {
	        
   
	      Scanner s = new Scanner(System.in);
	        
	        int v = s.nextInt();
	        int e = s.nextInt();
	        
	        
	        int adjMatrix [][]= new int [v][v];
	        
	        for(int i=0;i<e; i++)
	        {
	             int v1 = s.nextInt();
	             int v2 = s.nextInt();
	            // unidirectional
	            adjMatrix[v1][v2] = 1;
	            adjMatrix[v2][v1] = 1;
	            
	        
	        }
	        
	        int source=s.nextInt();
	        int destination = s.nextInt();
	        ArrayList<Integer> ans = getPath(adjMatrix,source,destination,new ArrayList<>(),new boolean [v]);
	        ArrayList<Integer> ans2 = getPath(adjMatrix,source,destination);
	        
	        
	        if(ans==null)
	            return;
	        
	        for(int a: ans)
	            System.out.print(a+" ");
	        
	        if(ans2==null)
	            return;
	        
	        for(int a: ans2)
	            System.out.print(a+" ");

	        
	        
		}
	    
	    
	    // due to cyclic  0 -- >1 -->5 -->0// visited arry use
	    // static class common memiry belong
	    private  static ArrayList<Integer> getPath(int [][]adjMatrix,int source,int destination, 
	                                       
	                                       ArrayList<Integer>ans,boolean visited[])
	    {
	        int n=adjMatrix.length;
	         visited[source] = true;
	        // all col explore, row source +1
	        for(int col = 0; col<n; col++)
	        {
	            if(source == destination)
	            {
	            ans= new ArrayList<>();
	            ans.add(source);
	            return ans;
	            }
	            // neighbour find in 2D ARRAY
	            else if(adjMatrix[source][col] == 1 && visited[col]==false)
	            {
	               
	               ans  =  getPath(adjMatrix,col,destination,ans,visited);
	                
	                if(ans != null)
	                {
	                    
	                ans.add(source);
	                  return ans;
	                }
	                    
	                
	                
	            }
	                
	        }
	        
	        
	        
	        
	        return null;
	        
	    }
	    
	    
	    
	    
	    
	    
	    private  static ArrayList<Integer> getPath(int [][]adjMatrix,int source,int destination)
	    {
	    	 return getPath(adjMatrix, source, destination, new boolean [adjMatrix.length]);
	    }
	              
	    private  static ArrayList<Integer> getPath(int [][]adjMatrix,int source,int destination, 
                
                boolean visited[])
{
				int n=adjMatrix.length;
				
				if(source == destination)
				{
				ArrayList<Integer> ans= new ArrayList<>();
				ans.add(source);
				return ans;
				}
				
				visited[source] = true;
				
				// all col explore, row source +1
				for(int col = 0; col<n; col++)
				{
				//if(source == destination)
				//{
				//ArrayList<Integer> ans= new ArrayList<>();
				//ans.add(source);
				//return ans;
				//}
				// neighbour find in 2D ARRAY
				 if(adjMatrix[source][col] == 1 && visited[col]==false)
				{
				
				ArrayList<Integer> ans  =  getPath(adjMatrix,col,destination,visited);
				
				if(ans != null)
				{
				
				ans.add(source);
				return ans;
				}
				
				
				
				}
				
				}




        return null;

}



	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
}
