package tic_Tac_Toe;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Prim_s_Algo {
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();

		/* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
		
		
		// 3 things , 2 vertices  that make an edge and 3rd that edge weight
		
		int adjMatrix[][] = new int[V][V]; // adjMatrix is name given to memeory is called variable
		                                   // because get is O(1) isliya , we use alot get in prim's algo.
		
		
		for(int i=0; i<E; i++)// beause no. of edge insert in array.
		{
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			int weight=s.nextInt();
			
			adjMatrix[v1][v2] = weight; // weighted graph , edge store info.
			adjMatrix[v2][v1] = weight; // undirectional
               
		}
		
		// minimum spanning tree 
		
		createMST(adjMatrix, V);
				
		
	}

	private static void createMST(int[][] adjMatrix, int v) {
		
		boolean visited [] = new boolean[v];
		int parent [] = new int[v];
		int weight [] = new int [v];
		parent[0] = -1;
		weight[0] = 0;
		for(int i=1;i<v; i++)
		{
//			parent[i] = Integer.MAX_VALUE;
			weight[i] = Integer.MAX_VALUE;
		}
		
		
		for(int i=0;i<v; i++)
		{
			
		// first time minvertex = 0 and weight of that vertex =0; min among all see line 59
			//  1 ka parent 0 and weight =4 and 2 ka parent 0 and weight=2
			// min vertexis that have min weight among all weight ,now vertex =2 is min that have min weight;
			int minVertex = findMinVertex(visited,weight);// find min vertex in visited array and weight also min of that vertex
			visited[minVertex] = true;
			
			// explore neighbour and update parent array and weight array  .
			for(int j=0; j<v; j++)
			{
				if(adjMatrix[minVertex][j] > 0 && !visited[j] )
				{
					
					if(weight[j] > adjMatrix[minVertex][j])
					{
						weight[j] = adjMatrix[minVertex][j];
						parent[j] = minVertex;
						
					}
				}
			}
			
			
		}
		//print <St
		// our parent and weight array have all value that we need to print an minimum soanning tree.
		for(int i=1;i<v;i++)// parent[0]=-1 so that by., because that is a source vertex, sourece cannotbe an edge
		{
			if(i<=parent[i])
				System.out.println(i+" "+parent[i]+" "+weight[i]);
			else
				System.out.println(parent[i]+" "+i+" "+weight[i]);

		}
		
		
	}

	private static int findMinVertex( boolean[] visited,int[] weight) {
		
		// min vertex find out karange thatweight is less;n
		
		int minVertex=-1;
		
		for(int i=0; i<visited.length; i++)
		{                     // index out of bound if minVertex == Integer.MAX_VALUE;
			if(!visited[i] && (minVertex==-1 || weight[minVertex] > weight[i]))
				minVertex=i;
		}
		return minVertex;
	}

}
