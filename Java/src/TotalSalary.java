package fundamental;
import java.util.Scanner;
public class TotalSalary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int basic=s.nextInt();
		char grade = s.next().charAt(0);
		int allow=0;
		if (grade=='A') {
			allow=1700;
		}else if (grade=='B') {
			allow=1500;
		}else {
			allow=1300;
		}
		double totalSalary=basic+basic*(double) 20/100+basic*(double) 50/100+allow-basic*(double) 11/100;
//		System.out.println(totalSalary);
		int answer = (int )totalSalary;
		double decimal=totalSalary-answer;
		if (decimal>=.5) {
			answer=answer+1;
			System.out.println(answer);
		}else {
			System.out.println(answer);
		}
		
		
	}

}
