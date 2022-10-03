package fundamental;

import java.util.Scanner;

public class AllPrime {

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        byte n=s.nextByte();
        
        for(int i=2;i<=n;i++){
            byte count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count=(byte)(count+1);
                }  
                }
                
                if(count==2){
                    System.out.println(i);

                }
                
          
        }
        

	}

}
