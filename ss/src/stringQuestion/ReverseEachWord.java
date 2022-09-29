package stringQuestion;

public class ReverseEachWord {
public static String reverseEachWord(String str) {
	String answer="";
	
	int cws=0;//current word start
	int i=0;String space=" ";
	while(i<str.length()) {
		if (space.charAt(0)==str.charAt(i)) {
			
			int  cwe=i-1;
			String reverse="";
			for(int j=cws;j<=cwe;j++) {
				
				reverse+=str.charAt(j);
				
			}
			answer=" "+reverse+answer;// hi 
			cws=i+1;
			
		}
			
			i++;
		
	}String reverse=""; // one word that not encounter with space.Space=2 then word =3
	for(int j=cws;j<str.length();j++) {
		
		reverse+=str.charAt(j);// abc
		
	}
	answer=reverse+answer;
	
	
	
	return answer;
	
	
	
	
//	String answer="";
//	
//	int cws=0;
//	int i=0;String space=" ";
//	while(i<str.length()) {
//		if (space.charAt(0)==str.charAt(i)) {
//			
//			int  cwe=i-1;
//			String reverse="";
//			for(int j=cws;j<=cwe;j++) {
//				
//				reverse=str.charAt(j)+reverse;
//				
//			}
//			answer=" "+reverse+answer;// hi 
//			cws=i+1;
//			
//		}
//			
//			i++;
//		
//	}String reverse="";
//	for(int j=cws;j<str.length();j++) {
//		
//		reverse=str.charAt(j)+reverse;
//		
//	}
//	answer=reverse+answer;
//	
//	
//	
//	return answer;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello java lover";
		System.out.println(reverseEachWord(s));

	}

}
