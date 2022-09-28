package test5;

public class Mat{
	
	 int [][] matrix;
	int row;
	int col;
	public Mat(int [][] mat)
	{
		matrix=mat;
	//	this.row=mat.length;	
	//.col=mat[0].length;

	}
	
	
	 public static Mat add(Mat a,Mat b)
	    {
	    	int row=a.matrix.length;
	    	int col=a.matrix.length;
	    	int [][] newADDM=new int[row][col];
	    	 for(int i=0;i<row;i++)
		        {
		            for(int k=0 ,j=0;j<col;j++)
		            {
		      newADDM[i] [j]=  a.matrix[i][j]+b.matrix[i][j];
		            }
		            
		        }
	    	 Mat result=new Mat(newADDM);
	    	return result;
	    }
	
	
	
	
	
	    public static Mat multiply(Mat a,Mat b)
	    {
	    	int row=a.matrix.length;
	    	int col=a.matrix[0].length;
	    	int [][] multy=new int[row][col];
	    	int ans=0;
	    	 for(int i=0,s=0;i<row;i++,s++)
		        {
		            for(int k=0, j=0;j<col;j++,k++)
		            {
		    ans  =  ans+a.matrix[i][j]*b.matrix[k] [s];
		   
		            }int n=0,m=0;
		            multy[n][m]=ans;
		            
		        }
	    	 Mat result=new Mat(multy);
	    	return result;
	    }
	    public static Mat transpose(Mat m)
	    {
	    	int row=m.matrix.length;
	    	int col=m.matrix.length;
	    	int [][]trans=new int[row][col];
	    	 for(int i=0,s=0;i<row;i++,s++)
		        {
		            for(int k=0, j=0;j<col;j++,k++)
		            {
		      trans[i] [j]=  m.matrix[j][i];
		            }
		            
		        }
	    	 Mat result=new Mat(trans);
	    	return result;
	    	
	    }
	    public static Mat rotate(Mat m)
	    {
	    	return m;
	    }
	    public  void print()
	    {
	        for(int i=0;i<matrix.length;i++)
	        {
	            for(int j=0;j<matrix[0].length;j++)
	            {
	                System.out.print(matrix[i][j]+" ");
	            }
	            System.out.println();
	        }
	    }




}




















//class Student{
//    String name;
//    int rollNo;
//    Student(int n){
//    rollNo = n;
//    }   
//    void print(){
//    System.out.print(rollNo +" " + name+" ");
//    }
//}
//
//public class Use {
//    public static void main(String[] args) {
//    Student s = new Student(56);
//    s.print();
//    }
//}   