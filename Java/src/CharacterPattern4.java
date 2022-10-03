package fundamental;
import java.util.Scanner;
public class CharacterPattern4 {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    byte n=s.nextByte();
    
    
    
    
  byte i =n;
    while(i<=n) {
    	if (i<1) {
      	  return;   // for exit , now compile can not read line above 15 quick exit
        }else
        {
    	char ch = (char) ('A'+i-1);
    	
    	byte j=1;
    	
    	                           while (j<=n-i+1) {
                                         		System.out.print(ch);
    		
                                           		ch  =(  char)(ch+1);
    		
    	                                          	j++;
    		
    	                              }System.out.println(); 
    	                            	  i--;
    	                              }
    	                              
    	
                                                     
    }
//    byte k=n;
//  
//    	
//    while(k<=n) {
//    	
//    	
//    	  byte i=1;
//    	    while (i<=n) {
//    	//	
//	byte j=1;
//	while (j<=i) {
//		char ch= (char)('A'-k+1);	
//		System.out.print(ch);
//		j++;
//    ch=(char)(ch+1);
//    
//	}
//	System.out.println();
//	i++;
//    	    }
//    	    if (k>0) 
//		k--;  }
//	
//	
//
//    
    
    
    
    
    
    
    
    
    
    
    
    
//    byte i=1;
//    while (i<=n) {
//	char ch= (char)('E'-i+1);
//	byte j=1;
//	while (j<=i) {
//		System.out.print(ch);
//		j++;
//    ch=(char)(ch+1);
//    
//	}System.out.println();
//	i++;
//	
//}

	}

}
