package backtracking;




// solution
class Solution {

    /* Your class should be named Solution.
5
     * Don't write main() function.
6
     * Don't read input, it is passed as function argument.
7
     * Print output as specified in the question
8
     */

    public static void placeNQueens(int n){

            int board[][] = new int[n][n];

            placeQueen(board, 0, n);

}
 
   
    private static void placeQueen(int[][] board, int row, int n) {
 
            if(row == n){
 
                    for(int i = 0; i < n; i++){
 
                        for(int j = 0; j < n; j++){
 
                            System.out.print(board[i][j] +" ");
 
                        }
 
                    }
 
                    System.out.println();
 
            }

            for(int j = 0; j < n; j++){
            	
			 if(isBoardSafe(board,row, j)){
			board[row][j] = 1;
			 
			placeQueen(board, row + 1, n);
			 
			board[row][j] = 0;
 
}
 
}
 
}

private static boolean isBoardSafe(int board[][], int row, int col ) {

int n = board.length;
 
for(int i = row - 1, j = col - 1 ; i >= 0 && j >= 0; i--,j--){
 
if(board[i][j] == 1){
 
return false;
}
 
}
 
for(int i = row + 1, j = col + 1 ; i < n && j < n ; i++,j++){
 
if(board[i][j] == 1){
 
return false;
 
}
  
}
   

  
for(int i = row - 1, j = col + 1 ; i >= 0 && j < n; i--,j++){
  
if(board[i][j] == 1){
  
return false;
  
}
  
}
  

  
for(int i = row + 1, j = col - 1 ; i < n && j >= 0; i++,j--){
  
if(board[i][j] == 1){
  
return false;
  
}
  
}
  

  
for(int i = row -1; i >= 0; i--){
  
if(board[i][col] == 1){
  
return false;

}

}
for(int i = row +1; i < n; i++){
  
if(board[i][col] == 1){
  
return false;
  
}
  
}
  

  
return true;
  
}
}











public class Print_ALL_Possible_Place_where_We_Can_Placed_Queen_in_NxN_Matrix {

	public static void printALLQueenPaced(int n) {//size of matrix
		
		placeQueen(n,0,0,new int [n][n]);
		
	}

	private static void printQueen(int a[][]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
			System.out.print(a[i][j]+" ");	
			}  System.out.println();
			}
	}

	
	private static void placeQueen(int n, int row,int col,int placedQueen[][]) {
	if(row==n) {
		printQueen(placedQueen);
		
	}
	// check board sade to place queen
	for(int i = row - 1, j = col - 1 ; i >= 0 && j >= 0; i--,j--){
		 
		if(placedQueen[i][j] != 1){
		 return;
		
		}
		 
		}
		 
		for(int i = row + 1, j = col + 1 ; i < n && j < n ; i++,j++){
		 
			if(placedQueen[i][j] != 1){
				 return;
				
				}
				 
		  
		}
		   

		  
		for(int i = row - 1, j = col + 1 ; i >= 0 && j < n; i--,j++){
		  
			if(placedQueen[i][j] != 1){
				 return;
				
				}
				 
		  
		}
		  

		  
		for(int i = row + 1, j = col - 1 ; i < n && j >= 0; i++,j--){
		  
			if(placedQueen[i][j] != 1){
				 return;
				
				}
				 
		}
		  
		
		  

		  
		for(int i = row -1; i >= 0; i--){
		  
			if(placedQueen[i][col] != 1){
				 return;
				
				}
				 

		}

		
		for(int i = row +1; i < n; i++){
		  
		if(placedQueen[i][col] == 1){
		  
		return ;
		  
		}
		  
		}
		
		placedQueen[row][col]=1;
		
		  
	
	//
	placeQueen(n, row, col+1, placedQueen);
	placeQueen(n, row+1, col, placedQueen);
	placedQueen[row][col]=0;
	
	
	
	
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static void printer(int[][]arr, int n)
	{
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				System.out.print( arr[i][j] + " ");
			}
		}
	}
	static boolean checker(int[][] arr, int i, int j, int n)
	{
		for (int p = 0; p < n; p++)
		{
			if (arr[p][j] == 1 && p!=i)
			{
				return false;
			}
		}
		for (int row = i - 1, col = j + 1; row >= 0 && col < n; row--, col++)
		{
			if (arr[row][col] == 1)
			{
				return false;
			}
		}
		for (int row = i - 1, col = j - 1; row >= 0 && col >= 0; col--, row--)
		{
			if (arr[row][col] == 1)
			{
				return false;
			}
		}

		return true;
	}
	static void zero_converter(int [][]arr, int n, int row)
	{
		for(int i=row; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				arr[i][j] = 0;
			}
		}
	}
	void placer(int[][] arr, int row, int col, int n)
	{
		if (row == n)
		{
			printer(arr, n);
			
			return;
		}
		int i = col;
		for (; i < n; i++)
		{
			zero_converter(arr, n, row);
			if (checker(arr, row, i, n))
			{
				arr[row][i] = 1;
				placer(arr, row + 1, col, n);
				continue;
			}
		}
	}
	void placeNQueens(int n)
	{
		int[][] arr = new int[n] [n];
		
		for (int i = 0; i < n; i++)
		{
			arr[i] = new int[n];
			for (int j = 0; j < n; j++)
			{
				arr[i][j] = 0;
			}
		}
		placer(arr, 0, 0, n);
	   
	}
	
	
	

	
}














