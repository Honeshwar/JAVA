package graphs;

import java.util.*;

public class BFS_Traversal {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
				
		int totalVertices = s.nextInt();
		int totalEdges =s.nextInt();
		
		
		
		int adjMatrix[][] = new int [totalVertices][totalVertices];
		
	
		for(int i =0 ; i<totalEdges ;i++) {
			// indes as a vertices le kar chalage 
			int v1=s.nextInt();
			int v2=s.nextInt();
			
			adjMatrix[v1][v2] =1;
			adjMatrix[v2][v1] =1;
			
			
			
		}
		
		breadthFirstSearchTravesal(adjMatrix);
		

	}

	
	
	/*
	 * 8 10
		0 2
		0 3
		0 6
		2 1
		1 4
		4 3
		3 5
		5 6
		5 7
		6 7
	 */
	private static void breadthFirstSearchTravesal(int[][] adjMatrix) {
		
		Queue<Integer> pendingVertices = new LinkedList<>();
		boolean visited [] = new boolean [adjMatrix.length];
		
		pendingVertices.add(0);
		visited[0] = true;
		
		
		// O(V) times
		while(!pendingVertices.isEmpty()) 
		{
           int currentVertex = pendingVertices.poll();
           
           System.out.print(currentVertex+" ");
			//  while loop O(V) times x O(V) times for loop
           // baki all O(1)
           //overall  O(1 x V x V) = O(V^2)
           for(int col=0;col<adjMatrix.length; col++) 
           {
        	   if(adjMatrix[currentVertex][col] == 1 && visited [col] == false)
        	   {
        
        		   pendingVertices.add(col);
        			visited[col] = true;
        	   }
        	   
        	   
        	   
           }
           
			
			
		}
		
	}

}






