package recursion_Basic;

public class PairStar {
	public static String addStars(String s,int start,int end) {
		if(start==end) {// base case
			
			return s.charAt(end)+"";// return last element
		}
if(s.charAt(start)==s.charAt(start+1)) {//compare for equal
	String output=s.charAt(start)+"*";//if equal then add star
	String small=addStars(s,++start,end);//recursion call
	return output +small;//my value + recursion (call) value
}else {
	String output=s.charAt(start)+"";//if false don't add star
	String small=addStars(s, ++start, end);//recursion call
	return output+small;//my value + recursion (call) value
}
	}
	public static String addStars(String s) {
		// Write your code here
 return addStars(s, 0, s.length()-1);
	}
	public static void main(String[] args) {
		String s="aaaa";//"hello"
			System.out.println(addStars(s));
	}

}
