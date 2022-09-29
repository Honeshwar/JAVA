package recursion_Basic;

public class AddStars {
	public static String addStars(String s) {
		if(s.length()-1==0) {
			return s.charAt(0)+"";
		}
		if(s.charAt(0)==s.charAt(1)) {
			String s1=addStars(s.substring(2));
			return s+"*"+s.charAt(1);
		}else {
			String s2=addStars(s.substring(1));
			return ""+s2;
		}
	}
	public static void main(String[] args) {
		System.out.println(addStars("hello"));

	}

}
