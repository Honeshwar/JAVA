package fundamental;
import java.util.Scanner;																								
public class NameAndAverage {

	public static void main(String[] args) {
		Scanner s =new Scanner (System.in);
		String nameOfStudent;
          int m1 , m2 , m3;
          
       nameOfStudent = s.nextLine();//	    "s.next()" scans and returns the next token as String. A token is part of entered line that 
//	    is separated from other tokens by space, tab or newline. So when input line is - “abc def 10” then s.next()
//	    returns the first token as String i.e. “abc” and s.nextInt() tries to convert the next token i.e. “def” into an int,
//	    which gives InputMismatchException.===
	    
      char firstLetterOfName=nameOfStudent.charAt(0);
         
         m1=s.nextInt();
         m2=s.nextInt();
         m3=s.nextInt();
        int averageMarks= (m1+m2+m3)/3;
//         
//   byte marksInSubject_1 , marksInSubject_2 , marksInSubject_3;
//        nameOfStudent = s.nextLine();
//        marksInSubject_1=s.nextByte();
//        marksInSubject_2=s.nextByte();
//        marksInSubject_3=s.nextByte();
//      byte averageMarks= (byte) ((marksInSubject_1+marksInSubject_2+marksInSubject_3)/3);
        /* not happen because byte = 8 bits 
         * formula range of n bits = -2^n-1 to (2^n-1) -1
         *  range 8 bits = -128 to 127 
         *  m1 +m2 +m3 > this range
         *  100 + 100+ 100 =300 > range -128 to 127 */
        
        System.out.println(firstLetterOfName+"\n"+averageMarks);
	}

}
