package graphs;

import java.util.HashMap;
import java.util.Scanner;

public class Adjacency_Matrix_Implementation {

	
	// better
	private static void dft(int [][] adjMatrix , int currentVertex , boolean []visited)
	{
		// currentVertex == row indexes , vertices that is adjacent to someOne.
		System.out.print(currentVertex+" ");
		visited[currentVertex] = true;
		
		for(int i=0; i<adjMatrix.length; i++) // i = column
		{
			// i is neighbour of currentVertex
			if(adjMatrix[currentVertex][i] ==1 && visited[i] == false)
			{
				dft(adjMatrix, i, visited);
				// same work recursion do for us, moving in entire 2D array.
			}
		}
	}
	
	
	private static void dft(int [][] adjMatrix )
	{
		dft(adjMatrix, 0, new boolean [adjMatrix.length]);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// bractravking /recursion help solve
	public static void dFTraversal(int [][]adjMatrix)// dft = depth first traversal
	
	{
		int sourceVertex = adjMatrix[0][0]; //  0 0 to traverse
		System.out.print(0+" ");// print 0
		HashMap<Integer, Boolean> m = new HashMap<>();
		m.put(0, true); // column =0;
		
		// hashmap ka jaza 2D array hepler
		printDFT(adjMatrix,0,0,m);
		
		
	}
	
	
	// simple traverse and vertice print karna gai
	// fail some cases/
	
	
	
	
	private static void printDFT(int[][] adjMatrix, int i, int j, HashMap<Integer, Boolean> m) {// i=row , j=column
		
		// vertex already printed ,contain in map 0--2 , column == 2 contain or not
		
		/*
		 * 4 5
			0 3
			2 2
			3 3
			1 3
			2 3
		 */
		if(j<=adjMatrix.length)
			return;
		

		 if(adjMatrix[i][j] == 1 && !m.containsKey(j)) 
		{
			System.out.print(j+" ");
			m.put(j, true);
			printDFT(adjMatrix, j, 0, m);
		
			
		}
		 if(m.containsKey(j))
			 printDFT(adjMatrix, i, j+1, m);
	}







	// assumption
	// vertices = Integer no.
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// user give me totalVertices and  totalEdges in graph
		int totalVertices = s.nextInt();
		int totalEdges =s.nextInt();
		
		
		// storage create adjacency matrix 2D , V x V matrix , V = totalVertices 
	
		
		int adjMatrix[][] = new int [totalVertices][totalVertices];
		
		// one by one edges(0--1,[0][1] =1 and [1][0] =1 ,storage unidirection) = 1 in 2D array
		// other = 0 by default in 2D array
		// totalEdges = total add(1)
		for(int i =0 ; i<totalEdges ;i++) {
			//user give two vertices that are adjacent to each other(create edges directly with one another)
			int v1=s.nextInt();
			int v2=s.nextInt();
			
			adjMatrix[v1][v2] =1;
			adjMatrix[v2][v1] =1;
			
			
			
		}
		
		for(int i=0; i<totalVertices;i++) {
			for(int j=0; j<totalVertices;j++) {
//				
//				if(adjMatrix[i][j] != 0) {
//		     System.out.print(adjMatrix[i][j]+" ");
//				}
				
		   System.out.print(adjMatrix[i][j]+" ");
		
			}
			System.out.println();
			}
		
		System.out.println();
		dFTraversal(adjMatrix);
		
		System.out.println();
		dft(adjMatrix);
	}
	
	
	
}
