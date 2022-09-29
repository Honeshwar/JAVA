package graphs2;

import java.util.Scanner;

public class dijkstra_s_Algo {

	
	
 /*
	Time complexity: O(E * log(V))
	Space compleity: O(V^2)
	
	where E is the number of edges in the graph and
	V is the number of vertices in the graph
 */

		public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();

        int adjMatrix[][] = new int[V][V];
		for(int i=0;i<E;i++)
        {
        int v1 = s.nextInt();
		int v2 = s.nextInt();
        int weight = s.nextInt();
            
            adjMatrix[v1][v2] = weight;
            adjMatrix[v2][v1] = weight;
            
        }
        
        
        minDistanceMST(adjMatrix);
        
        
        
	}

	private static void minDistanceMST(int[][] adjMatrix) {
		int n = adjMatrix.length;
		
		boolean visited[] = new boolean [n];
		int distance [] = new int [n];// store min distance upto to  vertex( = index ).
		//source verex set distance=0
		distance[0]=0;
		for(int i=1;i<n;i++)
			distance[i]=Integer.MAX_VALUE;
		
		
		
		
		// to pick vertex one by one taotal = n
		// start with count 0
		
		for(int i=0;i<n;i++)
		{
			int minVertex = findMinvertexThatHaveMinWEight(distance,visited);
			visited[minVertex] = true;
			
			
			// explore all neighbour and update upto distance.
			for(int j=0;j<n;j++) {
				
                // j is unvisited neighbour of currentVertex
				
				if(adjMatrix[minVertex][j]>0 && !visited[j] && distance[minVertex]!=Integer.MAX_VALUE)//>0 non postive not allowed this algo. ma, >0 also represent an edge
				{
					// check kya boh min distance hai
					
						int newDistance = distance[minVertex] + adjMatrix[minVertex][j];// source se ek aaja cjhala gayaga, neighbour to neighbour link
				// distance[minVertex] means upto minVertex  min distance,
                    
                    
                    if( newDistance  < distance[j] )
                       distance[j] = newDistance;
                        
				}
				/*
               5 1
               3 4 2
               
               o/p 
               Result
                Your Output
                0 0
                1 2147483647
                2 2147483647
                3 2147483647
                4 -2147483647

                Expected Output
                0 0
                1 2147483647
                2 2147483647
                3 2147483647
                4 2147483647

                */
				
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(i+" "+ distance[i]);
		}
		
	}

	private static int findMinvertexThatHaveMinWEight(int[] distance, boolean[] visited) {
		
		
		// not in entire distance array because start source vertex 0 and that go to forward bich ma visited = true bhe karange ,
		// change with time , se in notebook.
		// total edge by one vertex  time  this condition work " (minVertex == Integer.MAX_VALUE || distance[minVertex] > distance[i] ) "
		int minVertex=Integer.MAX_VALUE;
		for(int i=0;i<distance.length;i++)
		{
			if(!visited[i] &&  (minVertex == Integer.MAX_VALUE || distance[minVertex] > distance[i] ))
					minVertex=i;
		}
		return minVertex;
	}
}