package recursion_3;

public class PrintFactorial {
	// one way after returning value multply karna and return.
public static int factorialHelper(int input) {
	if(input==0)
		return 1;
	
	return factorialHelper(input-1)*input;
}

public static void factorial(int input) {
	System.out.println(factorialHelper(input));
}

// second way while calling store multiply value at ans so when base case hit then we print output and return all call.
public static void factorial2Helper(int input,int ans) {
	if(input==0) {
		System.out.println(ans);
	       return;
	}
	
	      ans=ans*input;// store karta hua chale ga value ko.
	factorial2Helper(input-1, ans);
}

public static void factorial2(int input) {
	factorial2Helper(input, 1);
}
public static void main(String[] args) {
	factorial(5);
	factorial2(5);
}
}
