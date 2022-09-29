package stringQuestion;

public class RemoveDuplicate {
public static String  removeDuplicate(String str) {
	String answer="";
	int n=str.length();
	
	for(int i=0;i<n-1;i++) {
		if (str.charAt(i)==str.charAt(i+1)) { // equal character skip
			continue;
		}else {
			answer=answer+str.charAt(i);// add to empty string
		}
	}
	//if(n%2==1||n%2==0) {
		answer=answer+str.charAt(n-1); // last n-1 element 
	//}
	return answer;
}
	public static void main(String[] args) {
		String s="aaabdddaa";
		System.out.println(removeDuplicate(s));
	}

}
