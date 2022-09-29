package backtracking;

public class PrintAllSubsetEqualTOK {

	public static void print(int input[],int k) {
		printHelper(input, k, 0, new int [0]);
	}
	public static void printHelper(int input[],int k ,int startIndex,int output []) {
		if(startIndex>=input.length||k<=0) {// k<=0 and return in line 39 do same work
			if(k==0) {
				for(int i=0;i<output.length;i++)
					System.out.print(output[i]+" ");
				     
				System.out.println();
			}
			return;
			
		}

		
		printHelper(input, k, startIndex+1, output);
		// so that we don't traverse until last index,condition use here also
		
		//int s=k;
		if(input[startIndex]<=k) {
			// output already some element present.
			int temp[]=output;
			// new size output create kiya.
			output=new int [output.length+1];
			// filled previous element
			int i=0;
			for(;i<temp.length;i++) {
				output[i]=temp[i];
			}
			output[i]=input[startIndex];//output.length-1 we can also used this.
			//s=k-input[startIndex];
			
		}else{
            return;// root element > k , and that does not create subsets sum = k
        }
		
//		printHelper(input, k, startIndex+1, output);
		printHelper(input, k-input[startIndex], startIndex+1, output);
		
	
		
	
	}

	
	
	public static void main(String[] args) {
		int a[]={5,12,3,1,15,3};
		print(a,6);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
