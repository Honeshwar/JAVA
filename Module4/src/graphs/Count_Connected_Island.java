package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class Count_Connected_Island { // sub graph, connected components count ..

	
	/*
	2
	    Time complexity: O(N^2)
	3
	    Space complexity: O(N^2)
	4
	    where N is the number of vertex in the graph
	5
	*/
	public class Solution {

		public static int numConnected(int[][] edges, int n) {
	        //special cases
	        if(n < 2)
	            return n;
			//step1
	        Queue<Integer> pendingVertices = new LinkedList<>();
	        boolean visited [] = new boolean[n];
	       
	        int count = 0;
	        
	        //step2
	        
	        for(int i=0; i<n; i++){ // ith vertex  visit or not
	            
	            if(visited[i] == false){
	                 pendingVertices.add(i);// 0 =source vertex, visit
	                 visited[i] = true;
	        
	                count++; // ewe traverse in  one island , +1
	                //step3
	                
	                while(!pendingVertices.isEmpty())
	                {
	                    int currentVertex = pendingVertices.poll();// work on
	                    // neighbou find
	                    for(int col=0; col<n; col++)
	                    {
	                        if(edges[currentVertex][col] == 1 && !visited[col])
	                        {
	                            visited[col] = true;
	                            pendingVertices.add(col); // neighbour addin QUEUE
	                            
	                        }
	                        
	                    }
	                    
	                    
	                    
	                }
	                
	                
	                
	            }
	            
	            
	            
	            
	            
	        }
	        return count;
		}
	      public static int numConnected2(int[][] edges, int n) {

	        boolean[] visited = new boolean[n];

	        int count = 0;

	        for (int i = 0; i < n; i++) {

	            if (visited[i] == false) {

	                dfs(edges, i, visited, n);
	  
	                count++;
	 
	            }
	 
	        }
	 
	        return count;
	  
	    }
	 
	  
	  
	    private static void dfs(int[][] edges, int v1, boolean[] visited, int n) {
	  
	        visited[v1] = true;
	  
	 
	   
	        for (int i = 0; i < n; i++) {
	  
	            if (visited[i] == false && edges[v1][i] == 1) {
	  
	                dfs(edges, i, visited, n);
	  
	            }
	  
	        }
	  
	    }


	}
}
