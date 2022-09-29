package twoDArray;

public class TotalSumOfDiag_Boundaries {
	 public static void totalSum1(int[][] mat) {
	        //Your code goes here
	        int horizontal=mat.length-1;
	        if (horizontal==-1)
	        {
	            System.out.println(0);
	            System.exit(0);
	        }


	        int vertically=mat[0].length-1;
	        int sum=0;
	        for (int i = 0; i < mat.length; i++)
	        {
	            for (int j = 0; j < mat[i].length; j++)
	            {
	                if (i==0 | j==0 | i==horizontal | j==vertically |i==j | j==horizontal-i)
	                {
	                    sum+=mat[i][j];
	                }
	            }
	        }
	        System.out.print(sum);
	    }
	public static void totalSum(int[][] mat) {
		int rows=mat.length;
		int sum=0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(i==j) {
					sum+=mat[i][j];
				}
				
			}
	}int a=mat[0].length-1;
		for(int i=0;i<rows;i++) {
			int j=a;
			while(j>=0) {
				
					sum+=mat[i][j];
					a--;
					break;
				
				
			}
	}
		
		for(int i=0;i<rows;i+=rows-1) {
			for(int j=1;j<mat[i].length-1;j++) {
				
					sum+=mat[i][j];
				
				
			}
	}
		
			for(int j=0;j<mat[0].length;j+=mat[j].length-1) {
				for(int i=1;i<rows-1;i++) {
				
					sum+=mat[i][j];
				
				
			}
	}
			System.out.println(sum);
	}
	public static void main(String[] args) {
		int a[][]= {{1,2,3,4}
				   ,{1,2,3,4}
				   ,{1,2,3,4},
					{1,2,3,4}
				   };
		totalSum(a);
		
		

	}

}
