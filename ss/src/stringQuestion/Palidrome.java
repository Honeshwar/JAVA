package stringQuestion;

public class Palidrome {
	public static boolean isPalindrome(String str) {
        //  if(str.length()==0){
        //     return false;
        // }
        int i=0,j=str.length()-1;
        
		while(i<=j){
            
            if(str.charAt(i)==str.charAt(j)){
                break;
            }else{
                return false;
            }
        }
        return true;
	}
	public static void main(String[] args) {
	String s="coding"
			;
	System.out.print(isPalindrome(s));

	}

}
