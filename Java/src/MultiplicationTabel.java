package fundamental;
import java.util.Scanner;
public class MultiplicationTabel {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int i=1, multiplicativeAnswer;
		while (i<=10) {
			multiplicativeAnswer=n*i;
			System.out.println(multiplicativeAnswer);
			i++;
		}
		

	}

}
