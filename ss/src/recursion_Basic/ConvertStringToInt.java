package recursion_Basic;

public class ConvertStringToInt {
	 public static int convertStringToInt(String input) {
			return convertStringToInt(input,0,input.length());
		}

	public static int convertStringToInt(String input,int start,int end){
			if(end==start) {
				return 0;
			}
			input=input.substring(start,end--);
			int recusivePart=convertStringToInt(input,start,end);
			int output =recusivePart*10+(input.charAt(end)-'0');// last element ko ma add karayuga.i will ad last element.
			// *10 is done because we need number in 10,100,1000,1000,etc....
			return output;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
