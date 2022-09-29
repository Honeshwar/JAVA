package graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Path_Between_Two_Vertices {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// total vertices and edges give
		int V =s.nextInt();// vertices 0 to V-1 
		int E =s.nextInt();
		
		
		int [][]adjM =new int[V][V];
		
		for(int i=0 ; i<E;i++)
		{
			// edges vertices and  adjacent vertices to each other
			int V1 =s.nextInt();
			int V2 =s.nextInt();
			
			adjM[V1][V2] = 1; // 1 means there is edge between them , both adjacent (vertices) to each other
			adjM[V2][V1] = 1;
			
		}
		
		int source=0;
		int destination=4;
//		boolean ans = pathIsValid(adjM,source,destination);
		boolean ans2 = pathIsValid2(adjM,source,destination);
		System.out.println(ans2+" "+ans2);

	}
 // find path firstly with the help of DfTraversal we search (find) (DFS) 
	private static boolean pathIsValid(int[][] adjM, int source, int destination) {
		
		int currentVertex = 0;
		boolean visited [] = new boolean [adjM.length];
		return pathIsValid(adjM, currentVertex , source, destination,visited,false);
	}
	private static boolean pathIsValid(int[][] adjM, int currentVertex, int source, int destination, boolean[] visited,boolean ans) {
	
		//simple find
		
		visited[currentVertex] = true;
		
		for(int col=0;col<adjM.length; col++)
		{
			
			if(adjM[currentVertex][col] == 1 && visited[col]==false)// adjacent vertices
			{
				if(col==source )
					source=-1;;
					
				if(col==destination )
					destination=-1;
				if(source==-1 && destination==-1)
					return true;
				
				  ans= pathIsValid(adjM, col, source, destination, visited,ans);
				
			}
		}
		
		
		return ans;
		
		
		
		
		
}
	//  find path secondly with the help of bfTraversal we search (find) (BFS) 
	private static boolean pathIsValid2(int[][] adjM, int source, int destination) {
		
		int n = adjM.length;
		
		Queue<Integer> pendingVertices = new LinkedList<>();
		boolean visited [] = new boolean [n];
		
		pendingVertices.add(0);
		visited[0]=true;
		
		while(!pendingVertices.isEmpty() )
		{
			int currentVertex = pendingVertices.poll();
			
			if(currentVertex == source)
				source=-1;
			if(currentVertex == destination)
				destination=-1;
			
			
			for(int col=0;col<n;col++)
			{
				if(adjM[currentVertex][col] ==1 && !visited[col]) {
				pendingVertices.add(col);
				visited[col] = true;
				}
				if(source == -1 && destination==-1)
					return true;
				
				
				
				
				
				
			}
		}
		
		return false;
	}
/*
 * 4 5
0 1
0 3
1 3
2 3
1 2
 */
	
	
	
	
	
	
}
