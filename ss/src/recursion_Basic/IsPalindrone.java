package recursion_Basic;

public class IsPalindrone {
	public static boolean isStringPalindrome(String input) {
		
		return isStringPalindrome1(input, 0, input.length()-1);
		
		

	}
	public static boolean isStringPalindrome1(String input,int start,int end) {
		boolean answer=true;
		if(start==end) {
			return answer;}
		if(start<=end) {
;		if(input.charAt(start)==input.charAt(end) ){
			
			answer=isStringPalindrome1(input,++start, --end);
			if(answer==false) {
				return false;
			}
		}else {
			return false;
		}
		}
		return answer;
	}
	public static void main(String[] args) {
		String s="abca";
		System.out.println(isStringPalindrome(s));
	}

public static String isStringPalindrome2(String a,int start) {
	if(start==a.length()) {
		return "";
	}String answer="";
	String small=isStringPalindrome2(a, ++start);
	answer=answer+small;

return answer;
	
}
}
