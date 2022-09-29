package recursion_Basic;

public class CheckAB {
	
public static boolean check(String str) {	  
    if(str.length() == 0){

        return true;

    }

    if(str.charAt(0) == 'a') {

        if(str.substring(1).length() > 1 && str.substring(1, 3).equals("bb")) {

            return checkAB(str.substring(3));

        } else {

            return checkAB(str.substring(1));
}
}
return false;
}


	public static boolean checkAB(String s,int start,int end) {
		if(start==s.length()) {
			return false;
		}
if(s.charAt(start)=='a') {
	start++;
	if(s.charAt(start)==s.charAt(start+1)) {
		start+=2;
		if(s.charAt(start)=='a') {
			checkAB(s, ++start, end);
			return true;
		}return false;
	}else {
		return false;
	}
}else {
	return false;
}
	}

	public static boolean checkAB(String input) {

return 	checkAB(input,0,input.length());

	}

	public static void main(String[] args) {
		String s="abbabba";
		System.out.println(checkAB(s));

	}

}
