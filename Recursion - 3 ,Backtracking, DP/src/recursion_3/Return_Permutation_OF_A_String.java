package recursion_3;

public class Return_Permutation_OF_A_String {
	
	
	// solution
	public static String[] permutationOfString(String input){
		// Write your code here
        if (input.length()==0)
            return new String[1];
        
        if (input.length()==1)
        {
            String[] arr = new String[1];
            arr[0]=input;
            return arr;
        }
        
        char c=input.charAt(0);
        String[] temp = permutationOfString(input.substring(1));
        String[] output = new String[temp.length*input.length()];
        //System.out.println("Total number of permutations till now: "+output.length);
        int k=0;
        for (int i=0;i<temp.length;i++)
        {
            String newstr=temp[i];
            for (int j=0;j<newstr.length();j++)
            {
                output[k]=newstr.substring(0,j)+c+newstr.substring(j);
                k=k+1;
            }
            output[k]=newstr+c;
            k=k+1;
            //System.out.println(output[i]);
        }
        
        return output;
		
	}
	
	// solution
	public static String [] returnPermuatation(String input) {
		if(input.isEmpty()) {
			String[]ans= new String[1];
			ans[0]="";
			return ans;}
			
				
				String smallOutput1[]=returnPermuatation(input.substring(1));
//				String smallOutString[]=returnPermuatation(input.substring(0,i)+input.substring(i+1),i,"a")
				//String smallOutput2[]=returnPermuatation(input.substring(1));
		       String output[]=new String[(smallOutput1.length)*smallOutput1.length];
		       // 3*2+2 ,3 position m a enter kar sakta hai ans x2 for 2 element of smalloutput and 
		       //+2 for entering smalloutput element first (wrong).
				
		    
		       
		       
		       
		       
		       
		       
		       return output;
		       
		       
	}

public static void main(String[] args) {
	String s="abc";
	String []a=returnPermuatation(s);
System.out.println(a[0]);
	for(String output:a)
		System.out.println(output);
	
}

}
