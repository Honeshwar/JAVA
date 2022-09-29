package stringQuestion;

public class HighestOccuringCharacter {

	public static char highestOccuringChar(String str) {
		char answer='a';
		int a[]=new int[256];
		int b;
		for(int i=0;i<str.length();i++) {
			b=str.charAt(i); // implicit type casting\
			//System.out.print(b+" ");
			a[b]+=1;
			
		}
		//System.out.print(a[97]+"");
		int l=Integer.MIN_VALUE;
		
		
		for(int i=97;i<=123;i++) { //all ASCII values ko i=0 to 255
			if(a[i]>=l) {
				l=a[i];
				answer=(char)i;
				
			}}
	
		return answer;
	}

	public static void main(String[] args) {
		String s="aaabbbabbaa";
		char ch=highestOccuringChar(s);
		System.out.println(ch);

	}

}
