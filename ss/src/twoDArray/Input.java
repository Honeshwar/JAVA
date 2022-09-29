package twoDArray;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
int row=s.nextInt();
int col =s.nextInt();
int arr2D[][]=new int [row][col];// row signify 1D array 1st ,2nd etc. (in indexing 0,1,etc.)
							     // col=index give us value that stored in 1D array
								// col index of 1D array (that row index) value woh hama deta hai	

//int arr2D[][]= {{1,2,2,3,4,4,4},{3,4,5,4,3,2,1},{1,2,3,4,5,6,7}};
for (int i=0;i<row;i++) {
	for(int j=0;j<col;j++) {
		System.out.println(" Enter value at i="+i+" and j="+j);
		arr2D [i][j]=s.nextInt(); // {{1,3,6},{5,7,9}} right
								  // 1 3 6  \/         wrong
	}						      // 5 7 9  /\
	//System.out.println();
}
System.out.println("Your 2D array of size "+row*col);
for (int i=0;i<row;i++) {
	for(int j=0;j<col;j++) {
		
		System.out.print(arr2D [i][j]+" ");
	}
	System.out.println();// for next row
}

	}
}
