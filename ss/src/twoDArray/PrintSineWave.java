package twoDArray;

public class PrintSineWave {
	public static void wavePrint(int mat[][]){
int horizontal=mat.length;
int vertical=mat[0].length;
if(mat.length==0){
    System.out.println();
return;
}
		for(int j=0;j<mat[0].length;j++) {
			if(j%2==0) {
			for(int i=0;i<mat.length;i++) {
				System.out.print(mat[i][j]+" ");}}
			else {
				for (int k=mat.length-1;k>=0;k--) {
					
			
		
				System.out.print(mat[k][j]+" ");}
			}}
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1 ,2, 3}, 
			{4 ,5, 6 },
			{7 ,8, 9 },
			{10, 11, 12 }};
		wavePrint(a);


	}

}
