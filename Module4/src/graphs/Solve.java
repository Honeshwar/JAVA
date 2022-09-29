package graphs;

public class Solve {

	
	 static int solve(String[] Graph , int N, int M)
	{
		
       char Matrix [][] = new  char[N][M];// n=row m=column
        
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<M; j++)
            {
                String s = Graph[i];
                Matrix[i][j] = s.charAt(j); // Graph[i].charAt(j);
            }
                
        }
        
        int ans = find(Matrix, N,M);
        
        return ans;
        
	}
	
	
	
	
	
	
	private static int find(char[][] matrix, int n, int m) {
		 
		boolean visited [][] = new boolean[n][m];
	    for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
            	if(matrix[i][j] == 'C') {
            		
            		visited[i][j] = true;
            		 boolean ans= findIt(matrix,i,j,visited, "CODINGNINJA");
            		 if(ans) {
            			 return 1;
            			 
            		 }
            		 
            	}
            }
        }
		return m;
             
	}


   private static boolean findIt(char[][] matrix, int i, int j, boolean[][] visited, String s) {
		
	   // invalid
	   int n=matrix.length;
	   int m= matrix[0].length;
	   if(i<0 || j<0 || i>=n || j>=m ||  matrix[i][j]!=s.charAt(0) ||  visited[i][j])
		   return false;
	   
	   
	   if(matrix[i][j] == s.charAt(0) && !visited[i][j])
	   {
		   visited[i][j] = true;
		   s=s.substring(1);
	   }
	   
	   if(s == "")
		   return true;
	   
	    // 8 direction call
	   
	       findIt(matrix, i, j-1, visited,s);//left
	      
	      findIt(matrix, i, j+1, visited,s);//right
	      findIt(matrix, i-1, j, visited,s);//up
	      findIt(matrix, i+1, j, visited,s);//down
	      
	      findIt(matrix, i-1, j-1, visited,s);// up-left diagonal
	      findIt(matrix, i-1, j+1, visited,s);// up-right diag.
	      findIt(matrix, i+1, j-1, visited,s);// down-left diag
	      findIt(matrix, i+1, j+1, visited,s);//down -  right soiag
	      
	      visited[i][j] = false;
	      
		return false;
	}






	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
