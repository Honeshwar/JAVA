package stringQuestion;

public class CountWords {
	public static int countWords(String str) {	
		int sum=1;
		String space=" ";
		for(int i=0;i<str.length();i++) {
			System.out.println("space"+str.charAt(i)+"hi");// space error
			if (space.charAt(0)==str.charAt(i)) {// str== space nahi kiya hai because str and space stored reference
													// we want to equal character( in this case that is space)
				sum+=1; 
			}
		}
		
		return sum;
	}
	public static void main(String[] args) {
		String str=new String("   ");
		System.out.println(str);
		//str.trim();
		int a=countWords(str);
		System.out.println(a);
		
//		String s =new String ("abc");
//		String s1 =new String ("abc");
//		System.out.println(s==s1);// false not space optimized because of large size.
//		
//		String str1="cod";
//		String str2="cod";
//		System.out.println(str1==str2);//true string pool has space optimized two string with same value have same references
//		
		
		
		
		
		
		
	}

}
