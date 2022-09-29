package stringQuestion;

public class ReverseEWord {
public static String reverseEachWord(String str) {
String answer="";
	
	int cws=0;//current word start
	int i=0;String space=" ";
	while(i<str.length()) {
		if (space.charAt(0)==str.charAt(i)) {
			
			int  cwe=i-1;//current word end
			String reverse="";
			for(int j=cws;j<=cwe;j++) {
				
				reverse=str.charAt(j)+reverse;// a--> ba--> cba--> dcba
				
			}
			answer+=reverse+" ";// hi 
			cws=i+1;
			
		}
			
			i++;
		
	}
	String reverse="";     // one word left after space encounter
	for(int j=cws;j<str.length();j++) {
		
		reverse=str.charAt(j)+reverse;
		
	}
	answer+=reverse;
	
	
	
	return answer;
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello java lover";String s1="";
		System.out.println(reverseEachWord(s1));

	}

}
