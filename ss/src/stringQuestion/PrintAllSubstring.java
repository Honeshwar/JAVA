package stringQuestion;

public class PrintAllSubstring {
public static void printSubstrings(String str) {
	int n=str.length();
	for(int startIndex=0;startIndex<n;startIndex++) {//n*(n+1)/2
		for (int endIndex=startIndex+1;endIndex<=n;endIndex++) {
			System.out.println(str.substring(startIndex, endIndex));
		}
		
	}
}
	public static void main(String[] args) {
		String s=" co";
printSubstrings(s);
	}

}
