package recursion_3;

public class PrintSubsetOfArray {

	public static void print(int input[],int startIndex,int[]output) {
		if(startIndex>=input.length) {
			for(int value:output)
				System.out.print(value+" ");
			
			System.out.println();
			return;
		}
		
		
		// incusive and exclusive approach use here.
		
		//print(input, startIndex+1, output);// exlusive that not include i do part element// that give us subset of entire array except i do part element 
		
		
		//ii do part element work.
		int temp[]=output;
		
		output=new int [output.length+1];
		for(int i=0;i<temp.length;i++) {
			output[i]=temp[i];
		}
		output[output.length-1]=input[startIndex];
		
		print(input, startIndex+1, output);
	    print(input, startIndex+1, output);// work fine line 17 and 30
		
	}
	
	
	public static void main(String[] args) {
		int a[]= {15,20,12};
		print(a, 0, new int[0]);
	}
}
