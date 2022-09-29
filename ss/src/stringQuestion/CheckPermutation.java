package stringQuestion;

public class CheckPermutation {
	public static boolean isPermutation(String str1, String str2) {
		boolean answer =true;
		int n=str1.length(),n1=str2.length(),count=0;
//		if (n==0|| n1==0)
//			return false;
		int a[]=new int[256];
		if(n==n1) {
			int b;
			for(int i=0; i<n;i++) {
				b=str1.charAt(i);
				a[b]=a[b]+1;
			}
			int c;
			for(int i=0; i<n;i++) {
				c=str2.charAt(i);
				a[c]=a[c]-1;
			}
			for(int i=97;i<=123;i++) { //all ASCII values ko i=0 to 255
				if(a[i]!=0) {
					return false;
					
				}
//				else {
//						return false;
//				}
			}

			
		}	
//		else {
//			return false; // n==0
//		}
		return answer;
		
		// this approach not work for str1="aba" and str2="bab".
//		boolean answer=true;
//		int n=str1.length(),n1=str2.length(),count=0;
//		if (n==0|| n1==0)
//			return false;
//		if(n==n1) {
//			for(int i=0; i<n;i++) {
//				for(int j=0;j <n;j++) {
//					if(str1.charAt(i)==str2.charAt(j)) {
//						count++;
//						break;
//					}
//				}
//			}
//			
//		}else {
//			return false;
//		}if(count==n) {
//			answer=true;
//		}else {
//			answer=false;
//		}
//		
//		return answer;
	}
	public static void main(String[] args) {
		String s ="aba";
		String s1="aba";
		System.out.println(isPermutation(s, s1));

	}

}
