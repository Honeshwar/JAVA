package twoDArray;

public class LargestRowOrColumnSum {
public static void largestRowOrColumnSum(int[][] mat) {
	int rL=Integer.MIN_VALUE;
	int cL=Integer.MIN_VALUE;
	int count1=-1;
	int num1=0,num2=0;
        if(mat.length==0){
            System.out.println("row 0 "+rL);

        }else{
	for(int i=0;i<mat.length;i++) {
		int sum1=0;
		for(int j=0;j<mat[i].length;j++) {
			sum1 += mat[i][j];
		}
		if(sum1>rL) {
		num1=i;
			rL=sum1;
		}
	}
	int count2=-1;
for(int j=0;j<mat[0].length;j++) {
	int sum2=0;
	for(int i=0;i<mat.length;i++) {
			sum2 += mat[i][j];
		}
		if(sum2>cL) {
			num2=j;
			cL=sum2;
		}
	}
if (rL>=cL) {
	System.out.print("row "+num1+" "+rL);
}else {
	System.out.print("column "+num2+" "+cL);
}
        }
	}
	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		largestRowOrColumnSum(a);
	}

}
