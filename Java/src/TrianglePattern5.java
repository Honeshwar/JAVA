package fundamental;
import java.util.Scanner;
public class TrianglePattern5 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		byte n=s.nextByte();
		byte i=1;
		while(i<=n) {                      // first part
			        byte spaces=1;
			        while(spaces<=n-i) {
			        	System.out.print(" ");
			        	spaces++;
			        }
			        byte j=1;
			        while (j<=i) {
						System.out.print("*");
						j++;
						
					}                         
			                           //second part
			        byte decrease=(byte)(i-1);
			        while(decrease>=1) {
			        	System.out.print("*");
			        	decrease--;
			        }
			     System.out.println();
			     i++;
		}
	}

}
