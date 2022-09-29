package string;

public class Basic2 {
	public static String changeInHeap(String str) {
		int n=str.length();
		char s[]=new char[n];
	//	String str1[]=new String[n];
		for(int i=0;i<n;i++) {
			s[i]=str.charAt(i);
		}
		for(int i=0;i<n;i++) {
	//		str1[i]+=s[i];
		}
		
		
		for(int i=0;i<n;i++) {
	//		str=str1[i];
					}
		
		
		
		
		return str;	}
public static void print(String str) {
	
}
	public static void main(String[] args) {
//		String s="hello java";
//		String answer=""; // string is immutable that why answer empty string created to store answer 
//							// new reference
//		
//		for(int i=0;i<s.length();i++) {
//			answer=s.charAt(i)+answer;//abcd ==   a-> ba -> cba -> dcba
//		}
//		System.out.println(answer);
		String s=new String("87654ew3");
System.out.println(changeInHeap(s)); 	
//System.out.println(s.append("k"));// method is undefined because string is immutable
String s1=s.translateEscapes();
System.out.println(s1);
	
	StringBuffer b=new StringBuffer("HI there!");
	System.out.println(b.length());
	System.out.println(b.capacity());
	//System.out.println(b.reverse());
	System.out.println(b.delete(0,3));
	System.out.println(b.insert(5,"\'s is"));
	System.out.println(b.append("hujh"));
	
	
	
	
	
	
	
	
	
	
	
	}
}
