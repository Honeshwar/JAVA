package function;

import java.util.Scanner;

public class Function {
//	   public static void func(int a, int b){
//		    System.out.println(a + b);
//		    }
//
//		    public static void main(String[] args) {
//		    int a = 7;
//		    func(a, 12);
//		  
//		    public static double add(int a,int b)
//		    {
//		        float c=a+b;  //    There is no problem in converting float to double.
//		        return c;
//		    }
//		    public static void main (String[] args) {
//		        System.out.print(add(10,3));
//		    }
//		              
//		    }
	
	
	
	
	
//	 public static void convertToCelsius(int start,int end ,int gap ){
//		 int result;
//	        for(int i=start;i<=end;i+=gap){
//	            result=(i-32)*5/9;
//	            System.out.println(i+"\t" +result);
//	        }
//	        return ;
//	    }
//
//
//	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//        int s=scanner.nextInt();
//        int e=scanner.nextInt();
//        int g=scanner.nextInt();
//        convertToCelsius(s, e, g);
//        
//	}

	public static boolean checkMember(int n){
int firstNumber=0,secondNumber=1,answer=0;

        for(int i=0;i<=n;i++) {
        if ((i==0)) {
        	if(i==n) {
        	return true;
        }else {
        	continue;
        }}
	answer=firstNumber+secondNumber;
            if(answer==n){
                return true;
            }
			firstNumber=secondNumber;
			secondNumber=answer;
            
        }return false;
}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(Function.checkMember(n));
	}
}