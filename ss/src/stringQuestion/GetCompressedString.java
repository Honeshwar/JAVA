package stringQuestion;

public class GetCompressedString {
	public static String getCompressedString(String str) {
		String s="";
		int count=0;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)!=str.charAt(i+1)) {
				if(count==0) {
					s=s+str.charAt(i);
					count=0;
				}else {
					
				s=s+str.charAt(i)+(++count);
				count=0;}
			}else {
				count++;
			}
		}if(count==0) {
			s=s+str.charAt(str.length()-1);
			count=0;
		}else {
		s=s+str.charAt(str.length()-1)+(count);
		count=0;}
		//s=s+str.charAt(str.length()-1);
		return s;
	}

	public static void main(String[] args) {
		String str="aaabbdaaa";
		System.out.println(getCompressedString(str));

	}

}
