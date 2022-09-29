package graphs2;

import java.util.Arrays;
import java.util.Scanner;

// Comparable<Edge> , this interface is used when we have to sort object in array;
// generally when Arrays.sort(edge); we can sort only int,Integer,Boolean,boolean ,String..etc
class Edge implements Comparable<Edge>{// <Edge> because i have to compare,sort Edge class object in array when i use to store in array
	int v1;
	int v2;
	int weight;
	public Edge(int v1,int v2 , int weight) {
		this.v1=v1;
		this.v2=v2;
		this.weight=weight;
	}
	@Override
	public int compareTo(Edge o) {
		int a = this.weight - o.weight; // when Arrays.sort(edge); compare weight and if weight -ve 
		//                            than sort otherwise same position m rakhage.
		return a;
	}
}

public class Kruskal_Algo {
	
	public static void main(String[] args) {
		
	
		Scanner s= new Scanner(System.in);
		int V=s.nextInt();
		int E=s.nextInt();
      
		
		Edge edge[] = new Edge[E];

		for(int i=0;i<E;i++)
		{
			int v1=s.nextInt();
			int v2=s.nextInt();
			int weight=s.nextInt();
			
			Edge obj = new Edge(v1, v2, weight);
			edge[i] = obj;
			
		}
		
		
		
		
		Edge mst[] = kruskalAlgo(edge, V);// mst = minimum spanning tree


		for(int j=0;j<mst.length;j++)
			if(mst[j].v1 < mst[j].v2) // just for left ma small vertex and right large vertex.
			System.out.println(mst[j].v1 +" " +mst[j].v2+" "+ mst[j].weight);
			else
		   System.out.println(mst[j].v1 +" " +mst[j].v2+" "+ mst[j].weight);
	}
/*
 * 9 13

0 3 1
0 1 4
0 2 9
1 2 2
1 5 6
1 6 11
2 3 3
2 6 3
5 6 12
5 7 13
5 8 5
6 8 10
7 8 7
 */
		private static Edge[] kruskalAlgo(Edge[] edge, int n) {
			// step2
			Arrays.sort(edge);
			Edge output [] = new Edge[n-1];// min edges n - 1
			int parent[] = new int[n];//  total vertices in entire graphs
			for(int j=0;j<n;j++)
				parent[j] = j;
			
			int count = 0 , i=0;// count = 1 so k =0 index for entring value in array
			//see line 77 size array ,condition line 85 whhile loop
			
			while(count < n-1)// min edges = total vertices - 1.
			{
				Edge currentEdge = edge[i];// find v1,v2
				int v1Parent = findParent(currentEdge.v1 , parent);// parent
				int v2Parent = findParent(currentEdge.v2 , parent);
				
				if(v1Parent != v2Parent)
				{
					output[count]=currentEdge;
					count++;
				}
				i++;
			}
			return output;
			
		}




		private static  int findParent(int v, int[] parent) {
			//iterative
		    int i=v;
					while(i < parent.length)
					{
						
						if(parent[i] == i)
							return i;
						i = parent[i]; // i = parent of i
					}
					
					return -1;
	      // recusive
//					
//					if(v == parent[v])
//						return v;
//					
//					return findParent(parent[v], parent);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


}
/*
import java.util.Scanner;
import java.util.Arrays;

class Edge implements Comparable<Edge>{// <Edge> because i have to compare,sort Edge class object in array when i use to store in array
	int v1;
	int v2;
	int weight;
	public Edge(int v1,int v2 , int weight) {
		this.v1=v1;
		this.v2=v2;
		this.weight=weight;
	}
	@Override
	public int compareTo(Edge o) {
		int a = this.weight - o.weight; // when Arrays.sort(edge); compare weight and if weight -ve 
		//                            than sort otherwise same position m rakhage.
		return a;
	}
}

public class Solution {

	public static void main(String[] args) {
		
	
		Scanner s= new Scanner(System.in);
		int V=s.nextInt();
		int E=s.nextInt();
      
		
		Edge edge[] = new Edge[E];

		for(int i=0;i<E;i++)
		{
			int v1=s.nextInt();
			int v2=s.nextInt();
			int weight=s.nextInt();
			
			Edge obj = new Edge(v1, v2, weight);
			edge[i] = obj;
			
		}
		
		
		
		
		Edge mst[] = kruskalAlgo(edge, V);// mst = minimum spanning tree


		for(int j=0;j<mst.length;j++)
            if(mst[j].v1 < mst[j].v2)
			System.out.println(mst[j].v1 +" " +mst[j].v2+" "+ mst[j].weight);
	       else
               System.out.println(mst[j].v2 +" " +mst[j].v1+" "+ mst[j].weight);
	
    
    
    }
/*
 * 9 13

0 3 1
0 1 4
0 2 9
1 2 2
1 5 6
1 6 11
2 3 3
2 6 3
5 6 12
5 7 13
5 8 5
6 8 10
7 8 7
 
		private static Edge[] kruskalAlgo(Edge[] edge, int n) {
			// step2
			Arrays.sort(edge);
			Edge output [] = new Edge[n-1]; // minimum edges
			int parent[] = new int[n]; // total vertices = parent
			
            for(int j=0;j<n;j++)
                parent[j]=j;
            
			int count = 0 , i=0;
			
			while(count != n-1 && i < edge.length)// min edges = total vertices - 1.
			{
				Edge currentEdge = edge[i];// find v1,v2
				int v1Parent = findParent(currentEdge.v1 , parent);// parent
				int v2Parent = findParent(currentEdge.v2 , parent);
				
				if(v1Parent != v2Parent)
				{
					output[count]=currentEdge;
					count++;
                    // update parent
                    parent[v1Parent] = v2Parent;
				}
				i++;
			}
			return output;
			
		}




		private static  int findParent(int v, int[] parent) {
			//iterative
// 		    int i=v;
// 					while(i < parent.length)
// 					{
						
// 						if(parent[i] == i)
// 							return i;
// 						i = parent[i]; // i = parent of i
// 					}
					
// 					return -1;
	      // recusive
					
					if(v == parent[v])
						return v;
					
					return findParent(parent[v], parent);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	
}









// class Edge implements Comparable<Edge> {
// int v1; 
// int v2; 
// int weight;

// Edge(int v1, int v2, int weight) {
// this.v1 = v1; 
// this.v2 = v2; 
// this.weight = weight;
// }

// @Override
// public int compareTo(Edge o) {
// return this.weight - o.weight;
// }

// }
// public class Solution {

// private static int findParent(int v, int parent[]) {
// if(v == parent[v]){
// return v;
// }
// return findParent(parent[v], parent);
// }

// public static Edge[] kruskalAlgorithm(Edge[] edges, int n) {
// Arrays.sort(edges); 
// Edge mst[] = new Edge[n - 1]; 
// int parent[] = new int[n]; 
// for(int j = 0; j<n; j++){
// parent[j] = j;
// }

// int count = 0, i = 0; 
// while(count != n - 1){
// Edge curentEdge = edges[i++]; 
// int v1Parent = findParent(curentEdge.v1, parent); 
// int v2Parent = findParent(curentEdge.v2, parent); 
// if(v1Parent != v2Parent){
// // Including currentEdge 
// mst[count] = curentEdge; 
// count++; 
// parent[v1Parent] = v2Parent;
// }
// }
// return mst;
// }

// public static void main(String[] args) {
// Scanner s = new Scanner(System.in); 
// int n = s.nextInt(); 
// int e = s.nextInt();

// Edge edges[] = new Edge[e]; 
// for(int i = 0; i <e; i++){
// int v1 = s.nextInt(); 
// int v2 = s.nextInt(); 
// int weight = s.nextInt(); 
// Edge edge = new Edge(v1, v2, weight); 
// edges[i] = edge;
// }
// Edge mst[] = kruskalAlgorithm(edges, n); 
// for(int i = 0; i < mst.length; i++){ 
// if(mst[i].v1 < mst[i].v2){
// System.out.println(mst[i].v1 + mst[i].v2 +" " + mst[i].weight); 
// }else{
// System.out.println(mst[i].v2 + mst[i].v1 +"  " + mst[i].weight);
// }
// }
// }
// }
*/

