package stringQuestion;

public class RemoveAllOccurrencesOfChar {
	public static String removeAllOccurrencesOfChar(String str, char ch) {
		String s="";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if (str.charAt(i)==ch) {
				count++;
			}else {
				s+=str.charAt(i);
			}
				
				
		}
		if(count==0) {
			return str;
		}
		return s;
	}
	public static void main(String[] args) {
		String s="sswd";
		char ch='a';
		System.out.println(removeAllOccurrencesOfChar(s, ch));

	}

}
