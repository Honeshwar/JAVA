package recursion_Basic;

public class SumOfDigit {
	public static int sumOfDigits(int input){
		if(input==0) {// base case
			return 0;}
		int small=	sumOfDigits(input/10);// recursion call for n/10 value upto zero
	int output=small+input%10;// generalized formula
	return output;
}

	
	
	public static int countZerosRec(int input){
		if(input==0) //Just to handle the case when input=0 
		{
			return 1;
		}
		if(input<10)//this is the actual base case
		{
			return 0;			
		}
		else if(input%10==0)
		{
			return 1+countZerosRec(input/10);
		}  
		// if condition is not true
		return countZerosRec(input/10);
	}
	
		//return small;
			
//	int small=	countZerosRec(input/10);
//			if(input%10==0) {
//				return small+1;
//			}else {
//		
//		return small;}
//		
		
//	}

	
	public static int multiplyTwoIntegers(int m, int n){
		if(n==0||m==0) {// base case 
			return 0;//recursion return
		}
		int smallOutput=multiplyTwoIntegers(m, --n);
		int output=smallOutput+m;// m is first value that we will add with recursion value
		return output;
	
	}



	public static void main(String[] args) {
		int n=12345;
//		System.out.println(sumOfDigits(n));
//System.out.println(multiplyTwoIntegers(3, 5));
System.out.println(001);
		//System.out.println(countZerosRec(00010204));
	}

}
