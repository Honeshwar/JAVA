package algoAnalysisQuestion;

public class Test3 {
	public static long pattern(int input1[],int input2[]) {
		int a[]=new int['a'];
		System.out.println(a.length);
			int n1=input1.length;
		    int n2=input2.length; 
		      long maxsum=0;
		 int s1=0,s2=0;
		 int i=0,j=0;
		 
		 while(i<n1 && j<n2){
		     if(input1[i]<input2[j]){
		         s1+=input1[i];
		         i++;
		     }
		     else if(input1[i]>input2[j]){
		         s2+=input2[j];
		         j++;
		     }}
//		     else{
//		         maxsum+=int(max(s1,s2)+a[i];
//		         s1=0;s2=0;
//		         i++;
//		         j++;
//		     }
//		 }
//		 //Adding remaining elements
//		 int m=
//		 while (i<m){
//		     s1+=input[i++];}
//		 while (j<n){
//		     s2+=input2[j++];}
//		 maxsum+=max(s1,s2);
	 return maxsum;
			}
	
	public static void main(String[] args) {
	}

	

}
