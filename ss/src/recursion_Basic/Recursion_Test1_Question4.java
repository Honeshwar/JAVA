package recursion_Basic;

public class Recursion_Test1_Question4 {
	public static void print2DArray(int input[][],int start,int end) {
	if(start==0)
		return;
	
	print2DArray(input, --start, end);
	int i=start-1;//i=0
	while(i<input.length-1) {// i<input.length-start
		for(int j=0;j<input[0].length;j++) {
			System.out.print(input[start][j]);}
		System.out.println();
			i++;
		
	}
	
	
	
			}
	

	
	public static void print2DArray(int input[][],int end) {
			if(end==0)
				return;
			
			print2DArray(input, -- end);
			int i=end-1;// i=0
			while(i<input.length-1) {//i<input.length-end
				for(int j=0;j<input[0].length;j++) {
					System.out.print(input[end][j]+" ");}
				System.out.println();
					i++;
				
			}}		
	
	
	
	public static void print2DArray(int input[][]) {
		print2DArray(input,input.length,input.length);

		}
	

	
	
	public static void main(String[] args) {
		int n[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int n1[][]= {{12}};
//		print2DArray(n, 3, 3);
		print2DArray(n1, 1, 1);
	}

}
