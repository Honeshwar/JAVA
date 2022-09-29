package twoDArray;

public class rowWiseSum {
	public static void rowWiseSum(int[][] mat) {
		
        int rows=mat.length;
      //  int cols=mat[0].length; if n1=0,n2=0 error occur so don't define any array index length
        for (int i=0;i<rows;i++){
            int sum=0;
           for (int j=0;j<mat[i].length;j++){
               sum+=mat[i][j];
               
           }System.out.print(sum+" ");

        }
        
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][]b=new int [0][0];
System.out.println(b);
System.out.println(b.length); // length = 0 because master array has zero array of references
//System.out.println(b[0]);// no reference error occur because we have zero array of references (rows| array)
System.out.println(b[0].length);// no one is their to hold that reference
	}

}
