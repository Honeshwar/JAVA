package graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class ISConnected {
	
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
		        
		    System.out.println(isConnected(adjMatrix));


		}
	    private static boolean isConnected(int [][] adjMatrix)
	    {
	        if(adjMatrix.length == 0)
	            return true;
	        
	        int n = adjMatrix.length;
	        
	        Queue<Integer> pendingVertices = new LinkedList<>();
	        boolean visited [] = new boolean [n];
	        
	        // start anywhere your choice
	        pendingVertices.add(0);
	        visited[0] = true;
	        
	        while(!pendingVertices.isEmpty())
	        {
	            int currentVertex = pendingVertices.poll();// work
	            
	            for(int col =0; col<n; col++)// all adjacent vertices find in neighbour(2D column)
	            {
	                
	                if(adjMatrix[currentVertex][col] == 1 && !visited[col])
	                {
	                    pendingVertices.add(col);
	                    visited[col] = true;
	                }
	            }
	            
	            
	            
	            
	            
	        }
	        
	        
	          for(int i =0; i<n; i++)
	          {
	              if(visited[i] == false)
	                  return false;
	              
	          }
	        
	        
	        return true;
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	    }

	}
}
