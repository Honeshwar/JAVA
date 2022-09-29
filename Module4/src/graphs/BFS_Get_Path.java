package graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//public class BFS_Get_Path {
//
////	public static void main(String[] args) throws IOException {
////		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////		   String a= br.readLine();
////
////		   System.out.println(a);
////	}
//}

public class BFS_Get_Path{
	
	/*
	 * 8 8
		0 1
		0 2
		0 3
		1 4
		4 5
		2 6
		5 6
		3 7
		0 6
	 */
	public static void main(String[] args) {
		
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
	        ArrayList<Integer> ans = BFSgetPath(adjMatrix,source,destination);
	        
	        
	        if(ans==null)
	            return;
	        
	        for(int a: ans)
	            System.out.print(a+" ");
	        
	}

	private static ArrayList<Integer> BFSgetPath(int[][] adjMatrix, int source, int destination) {
		
		int n=adjMatrix.length;
		
		Queue<Integer> pendingVertices = new LinkedList<>();
		HashMap<Integer,Integer>  m = new HashMap<>(); // vertics child vertics =key , parent vertics =value
		boolean visited [] = new boolean[n];
		
		pendingVertices.add(source);
		m.put(source, -1); // -1 indicator indicate thats there is no parent above this is last children= root parent ho ga
		visited[source] = true;
		
		// boolean isPathValid =false;
		while(!pendingVertices.isEmpty())
		{
			
			int currentVertex = pendingVertices.poll(); // row represent
			
			// 2D array find in column   its adjacent vertices.
			
			for(int col=0;col<n;col++)
			{
				// currentVertex visited in line  66 and 68 and 74.
				if(adjMatrix[currentVertex][col] == 1 && !visited[col])
				{
					
					
					// work on currentVertex and visit next time {col} neighbour add in pending 
					pendingVertices.add(col);
					m.put(col, currentVertex);
					visited[col] = true;
					
					
					
					if(col == destination) {
						
						
						// isPathValid =true;
//						break;// all loop bahar nikal de ga
						
						
						
						ArrayList<Integer> ans = new  ArrayList<Integer>();
						int i =col;
						while(i != -1) // -1 indicator ,stop point
						{
							ans.add(i);
							 i=m.get(i);
						}
						return ans;
						
						
						
						
					}
						
					
				}
			}
			
			
		
			
			
		}
//		if(isPathValid) {
//			
//			ArrayList<Integer> ans = new  ArrayList<Integer>();
//			int child = destination; // not source // ASSUME child=parent starting ma bad m to parent ho he gayaga.
//			while(child != -1) // -1 indicator ,stop point
//			{
//				ans.add(child);
//				child=m.get(child);// child = parent
//				 
//			}
//			return ans;
//			
//			
//			
//			
//			
//			
//			
//		}
//			
//			
//			
//		else	
		return null;
	}
}


