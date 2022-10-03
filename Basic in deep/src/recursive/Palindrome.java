package recursive;

public class Palindrome {
	public static boolean palindrome(String s) {
		String str=reverse(s);
		System.out.println(str);
   return s.equals(str);
		
	}
public static String reverse(String s) {
	String str="";
	if(s.length()==0) {
		return "";
	}
	str=reverse(s.substring(1))
	+s.charAt(0);
	return str;
}

// another way.
public static boolean isStringPalindrome1(String s,int start,int end) {
    if(start>=end){
        return true;
    }
    if(s.charAt(start)!=s.charAt(end)){
        return false;
   
    }else{
         return isStringPalindrome1(s,start+1,end-1 ); 
        
        
    }
    
}
	public static void main(String[] args) {
		String s="racecar";
		String str="hello World";
		System.out.println(palindrome(s)+""+palindrome(str));
		
	}

}
