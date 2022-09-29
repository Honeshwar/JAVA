package recursion_Basic;

public class StringToInt {
public static int convertStringToInteger(String str) {
		
		
		if(str.length()==0) {
			return 0;
		}
		return (str.charAt(0)-'0')* (int)Math.pow(10, str.length()-1) + convertStringToInteger(str.substring(1));
		
		
	}
	
	
	public static int convertStringToInt(String input) {
		return convertStringToInt(input);
	}
	public static int convertStringToInt(String input,int start,int end){
		if(end==start) {
			return 0;
		}
		input=input.substring(start,end--);
		int recusivePart=convertStringToInt(input,start,end);
		int output =recusivePart*10+(input.charAt(end)-'0');
		return output;
	}
	public static void main(String[] args) {
	String s="1234";
	System.out.println(convertStringToInt(s, 0, 4));

	}

}
