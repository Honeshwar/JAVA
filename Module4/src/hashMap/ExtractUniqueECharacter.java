package hashMap;

import java.util.HashMap;

public class ExtractUniqueECharacter {

	public static String extract(String s) {
		
		if(s.length()==0)
			return "";
		
//		HashMap<Character,Integer> m=new  HashMap<Character, Integer>();
		HashMap<Character,Boolean> m=new  HashMap<Character, Boolean>(); 
		// 2 bits space occupy by boolean and in above 4byte = 8bits x 4 = 32 bits space ocupy 
		// Sthat 30bits is useless space for this program.
		String ans="";
		int length=s.length();
		for(int i=0;i<length;i++) {
			// already in map
			if(m.containsKey(s.charAt(i)))
			       continue;
			
			// already not in  map
			m.put(s.charAt(i), true);
			ans=ans+s.charAt(i);
			
		}
		return ans;
	}
	public static void main(String[] args) {
		System.out.println(extract("ababcad"));
	}
}
