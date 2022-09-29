package recursion_3;

public class PrintPermutationOfString {
	public static void permutationOfString(String input,String ans1){
		// Write your code here
        if (input.isEmpty())
          return;
     
       
       
       //root work
       
       char first=input.charAt(0);
       
       for(int i=1;i<=2;i++) {
    	   String s=input.substring(1);
    	   if(i==2) {
    		  s=  reverse(input.substring(1));
    	   }
    	   
    	   for(int j=0;j<s.length();j++) {
    		 String  ans=s.substring(0,j)+first+s.substring(j);
    		 if(ans.length()==input.length())
    		   System.out.println(ans);
    	   }
    	   String ans=s+first;
    	   if(ans.length()==input.length())
 	           System.out.println(ans);
       }
      
//       permutationOfString(input.substring(1), ans1);
	}

	
	private static String reverse(String substring) {
		if(substring.isEmpty()) {
			return "";
		}
		
		String smallOutput=reverse(substring.substring(1));
		return smallOutput+substring.charAt(0);
		
		
	}

	
	
	
	public static void permutations(String s,String ans) {
		if(s.isEmpty())
			System.out.println(ans);
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			
//			permutations(s.substring(1), ans+c); // not work
			permutations(s.substring(0,i)+s.substring(i+1), ans+c);
		
		}
		
		
		
	}

	public static void main(String[] args) {
		permutations("abc", "");
	}
}
