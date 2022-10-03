package test7;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int T =s.nextInt();
         s.next();// /n in int fectch execute
      

        
     for(int i=0;i<T;i++){
         
         String str=s.nextLine();
         System.out.println(str);

         System.out.println(maxCharacterBetweenTwoSameCharacter(str));

     }  
        
       
        
    }
    
    
    public static int maxCharacterBetweenTwoSameCharacter(String str){
        
        // if(str.length()==0)
        //     return -1;
        
    int n=str.length();
        
        int count=0;
           for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               
               if(str.charAt(i) == str.charAt(j))
                 break;
               
               
                   count++;
           }
           }
        
        
        // if(count==0)
        //     return -1;
        
        return count;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

}
