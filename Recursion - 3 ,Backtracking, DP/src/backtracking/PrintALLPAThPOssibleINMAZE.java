package backtracking;

public class PrintALLPAThPOssibleINMAZE {

	
	private static void helper(int[][] maze, int[][] path, int row, int column) {
	
		int n=maze.length;
		if(row<0 || row>=n || column <0 || column >=n || maze[row][column]==0 || path[row][column]==1)
			return ;
		
		
		
		       path[row][column]=1;
		   
		       if(row==n-1&&column==n-1) {
		    	   for(int i=0;i<n;i++) {
		   			for(int j=0;j<n;j++) {
		   				
		   				System.out.print(path[i][j]+" ");
		   					   			
		   			} 
		   			}
		    	   path[row][column]=0; //reset
		    	   System.out.println();
			    return;
			    }
			
		  // Explore further in all directions
		       
		helper(maze, path, row-1, column);// top
			
		helper(maze, path, row, column+1);// right

		helper(maze, path, row+1, column); // down cell visit
		
	    helper(maze, path, row, column-1);// left
			
	    path[row][column]=0; //reset
// 	   System.out.println();
		

	}
	
	
	
	public static void main(String[] args) {
		int maze [][]= {{1,1},{1,1}};
helper(maze, new int [maze.length] [maze.length], 0, 0);				
	}
}

	
	
