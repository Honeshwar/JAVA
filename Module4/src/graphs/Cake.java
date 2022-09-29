package graphs;

import java.util.LinkedList;
import java.util.Queue;


class Node<T>{
	
	T data1;
	T data2;
	boolean isVisited;
	public Node(T data1,T data2, boolean b) {
		this.data1=data1;
		this.data2=data2;
		this. isVisited = b;
	}
	
}
public class Cake {

	
	 static int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

		public static void main(String[] args) {
			
		int adjMatrix[][]= {{1,1},{0,1}};
		
	        
	      System.out.println( bfs(adjMatrix ,2 ));
		}


	   
		 private static int bfs(int [][] adjMatrix, int sizeOfAdjMatrix )
		    {
		        
		        //1
		        Queue<Node<Integer>> pendingcell = new LinkedList<>();
		       boolean visited [][] = new boolean[sizeOfAdjMatrix][sizeOfAdjMatrix];
		        
		       
		       int count=0;int max=0;
	         // System.out.println("hi");

		       for(int i=0;i<sizeOfAdjMatrix;i++) {
		    	   for(int i1=0;i1<sizeOfAdjMatrix;i1++) {
			    	   
		    		  
		    		   if(adjMatrix[i][i1] == 1 ) {
		    			   count++;
	                         
		    			   visited[i][i1] = true;
		    			   Node<Integer> node = new Node<Integer>(i,i1,true);
		    			   pendingcell.add(node);
		    			   
		    			   
		    			   
		    			   while(!pendingcell.isEmpty())
		    			   {
		    				   // first work
		    				   int row = pendingcell.peek().data1;
		    				   int column = pendingcell.peek().data2;
		    				   pendingcell.poll();
		    				   
		    				   
		    				   
		    				   for(int j=column;j<sizeOfAdjMatrix; j++)
		    				   {
		    					   
		    					   if(adjMatrix[row][j]==1 && !visited[row][j])
		    					   {
		    						   Node<Integer> node2 = new Node<Integer>(row,j,true);
		    						   pendingcell.add(node2);
		    						   
		    						   visited[row][j] = true;
		    					   }
		    				   }
		    				   
		    				   
		    				   
		    			   }
		    			   
		    			   
		    		   }
			    	   
			       }
		    	   
		    	   if(max<count)
		    		   max=count;
		    	   
		       }
		        return max;
		    }

	}
	
	

























