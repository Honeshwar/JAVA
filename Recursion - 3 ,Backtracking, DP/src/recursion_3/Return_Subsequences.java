package recursion_3;

import java.util.ArrayList;

public class Return_Subsequences {
//by array space complexity opmized rathi hai
	public static String[] subsequences(String input) {
		//base case
		if(input.length()==0) {
			 String[] output=new String[1];// string is a sequence of character ,combine differnt character to form sequence
			 output[0]="";   // empty (String)subset is also a (substribg or subsequence) subset
			return output;
		}
		 String[] smallOutput=subsequences(input.substring(1));
		 int size=smallOutput.length;
		 String[] output=new String[size*2];
		 
		 int i=0;
		 for(String s:smallOutput)
			 output[i++]=s;
	         i=0; // reset
		 for(String s:smallOutput)
			 output[size+(i++)]=input.charAt(0)+s;
		
		return output;
	}
	
// by array list space complexity  are not opmized because of 1.5 x capacity
public static ArrayList<String> subsequences2(String input) {
	if(input.length()==0) {
		ArrayList<String> output=new ArrayList<String>();// string is a sequence of character ,combine differnt character to form sequence
		 output.add("");   // empty (String)subset is also a (substribg or subsequence) subset
		return output;
	}
	ArrayList<String> smallOutput=subsequences2(input.substring(1));// array pass in it , string is a character of array
	 int size=smallOutput.size();
	 ArrayList<String> output=new ArrayList<String>();
	 
	 int i=0;
	 for(String s:smallOutput)
		 output.add(s);
        i=0; // reset
	 for(String s:smallOutput)
		 output.add(((CharSequence) input).charAt(0)+s);
	
	return output;
}
	
public static void main(String[] args) {
	String s1= "abc";
	String s[]=subsequences(s1);
	String s3[]=subsequences(s1);
//	if(s1.length()==0) {
////		String s6="mko";
//	String si=s1.charAt(0).toString();
	
	String si=s1.substring(0,9);
			
	for(String s2:s)
System.out.print(s2+" ");
	
	for(String s4:s3)
		System.out.print(s4+" ");
	
}

}
