package recursion_3;

public class Print_SubSequence_IMPORTANT {

	
	public static void printSubSequence(String input, String ans) {// ans = soFarString
		
		if(input.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		
		//String small=input.substring(1);
		printSubSequence(input.substring(1), ans);  
		// empty sring ka liya recusion call because wwe know "" + a=a// create to so that line 15 can print his ans that is a, b, c...
		
		//ans=ans+input.charAt(0);
		printSubSequence(input.substring(1), ans+input.charAt(0)); // create to so that we can print ans that is ab, ac, abc  ...
	}
	
	
	
	
	
	public static void main(String[] args) {
		printSubSequence("abc", "");
	}
}
