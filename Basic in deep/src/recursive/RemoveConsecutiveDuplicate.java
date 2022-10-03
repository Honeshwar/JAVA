package recursive;

public class RemoveConsecutiveDuplicate {
public static String removeConsecutiveDuplicate(String s) {
	String str="";
	if(s.length()==1) {
		return s;
	}
	String smallPart=removeConsecutiveDuplicate(s.substring(1));
	if(s.charAt(0)!=s.charAt(1)) {
		str=s.charAt(0)+smallPart;
	}else {
		str=smallPart;
	}
	return str;
}

static String removeX(String s) {
	String str="";
	if(s.length()==0) {
		return "";
	}
	String smallOutput=removeX(s.substring(1));
	if(s.charAt(0)!='x') {
		str=s.charAt(0)+smallOutput;
	}else {
		str=smallOutput;
	}
	return str;
}


public static void main(String[] args) {
		String d="axax";
		System.out.println(removeX(d));
		System.out.println(removeConsecutiveDuplicate(d));
		System.out.println(d.substring(2)!=null);
	}

}
