package fundamental;
import java.util.Scanner;
public class SumOfOddAndEven {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int sum_Of_Even_Digits=0, sum_of_Odd_Digits=0;
		
		
	while (n>0) {
			int remainder = n%10;
			if (remainder%2==0) {
				sum_Of_Even_Digits =sum_Of_Even_Digits+remainder;
			}else {
				sum_of_Odd_Digits=sum_of_Odd_Digits+remainder;
			}
			n=n/10;
		}
		
		System.out.println(sum_Of_Even_Digits+" "+sum_of_Odd_Digits);

	}

}
