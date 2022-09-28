package test5;

public class Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
     Mat a=new Mat(arr);
     a= Mat.transpose(a);
     a.print();
     for(int i=0;i<a.matrix.length;i++)
     {
         for(int j=0;j<a.matrix.length;j++)
         {
  System.out.print(a.matrix[i][j]+" ");
         }
         System.out.println();
     }
	}

}
