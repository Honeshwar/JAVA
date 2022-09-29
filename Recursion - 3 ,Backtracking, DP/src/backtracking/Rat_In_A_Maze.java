package backtracking;

public class Rat_In_A_Maze {

	
	public static boolean ratInMaze(int maze[][]) {
		int N=maze.length;
		int path[][]=new int [N][N];
		helper(maze,path,0,0);
		
		for(int ans[]:path) {
			for(int res:ans) {
				if(res==0) 
					System.out.print(" ");
				else
				System.out.print(res);
			}   System.out.println();
		}
		
		
		if(path[N-1][N-1]==1)
			return true;
		return false;
		
	}

	private static boolean helper(int[][] maze, int[][] path, int row, int column) {
		// check for path valid or not
		 // Check if i,j cell is valid or not
		
		int n=maze.length;
		
		  // top || right || left || down (condition)
		if(row<0 || row>=n || column <0 || column >=n || maze[row][column]==0 || path[row][column]==1)
			return false;
		
		
			// now cell is valid we can move
		 // Include the cell in current path
		       path[row][column]=1;// moving from (0,0) to (-1,0) {TOP};
		       // Destination cell
		       if(row==n-1&&column==n-1)
			    return true;
			
		  // Explore further in all directions
		       
		if(helper(maze, path, row-1, column))// top
			return true;
		if(helper(maze, path, row, column+1))// right
			return true ;
	    if(helper(maze, path, row+1, column)) // down cell visit
			return true;
	    if(helper(maze, path, row, column-1))// left
			return true;
	    
		return false;

	}
	public static void main(String[] args) {
		int maze [][]= {{1,1,0},{1,1,0},{1,1,1}};
		System.out.println(ratInMaze(maze));
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
	}
}
