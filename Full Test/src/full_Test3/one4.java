package full_Test3;

import java.util.Scanner;
import java.util.Stack;

public class one4{
	 static int result(String str){
	        if(str.length()==0)
	            return 0;
	        
	      Stack<Character> s = new Stack<>();
	        int n = str.length();
	        
	        while(--n>=0){
	            if(str.charAt(n) == ')') {
	                s.add(str.charAt(n));
	                continue;
	                
	            }
//	             if(str.charAt(n) == '+' || str.charAt(n) == '-'|| str.charAt(n) == '0'|| str.charAt(n) == '1'|| str.charAt(n) == '2'|| str.charAt(n) == '3'||
//	            		 str.charAt(n) == '4'|| str.charAt(n) == '5'|| str.charAt(n) == '6'|| str.charAt(n) == '7'|| str.charAt(n) == '8'|| str.charAt(n) == '9') {
//	            	 
	            if(Character.isDigit(str.charAt(n))) {
	            	// same thing like we do above;// this func. tell us this character is digit or not
	            	// static func. belong to class
	            s.add(str.charAt(n));
		                continue;
	            	 
	             }
	             
	             if( str.charAt(n) == '(') {
	            	 
	            	 char ch = s.pop();
	            	int symbol  =0;  // 43 '+' , and 45 '-'
	            	 int number = 0;
	            	 if(ch == '+')
	            		 symbol =43;
	            	 else if(ch == '-')
	            		 symbol=45;
	            	 else// number hoga
	            	 number  = s.pop()- '0';// '0' = 48
	            	 int sum=0;
	            	 
	            	 if(sum==0) {
	            		 sum=number;
	            	 }
//	            	 else
	            		 
	            	 
	            	 
	            	 
	            	 
	            	 
	            	 
	            	 
	            	 
	            	 
	            	 
	            	 
	            	 
	            	 
	            	 
	            	 
	            	 
	            	 
	            	 
	            	 
	            	 
	             }
	            
	            
	            
	            
	           
	        }
	        return 0;
	    }



	 public class Solution {
			public static void main (String[] args) {
			  Scanner s = new Scanner(System.in);
		        String str = s.next();
		        
		        System.out.println(findSum(str));

			}
		    
		    
		//  static int result(String str){
//		 	        if(str.length()==0)
//		 	            return 0;
			        
//		 	      Stack<Character> s = new Stack<>();
//		 	        int n = str.length();
			        
//		 	        while(--n>=0){
//		 	            if(str.charAt(n) == ')') {
//		 	                s.add(str.charAt(n));
//		 	                continue;
			                
//		 	            }
//		 	            if(str.charAt(n) == '+' || str.charAt(n) == '-'||
//		                     str.charAt(n) == '0'|| str.charAt(n) == '1'||
//		                     str.charAt(n) == '2'|| str.charAt(n) == '3'||
//		 	                str.charAt(n) == '4'|| str.charAt(n) == '5'|| 
//		                     str.charAt(n) == '6'|| str.charAt(n) == '7'||
//		                     str.charAt(n) == '8'|| str.charAt(n) == '9') 
//		                 {
			            	
//		                     s.add(str.charAt(n));
//		 		                continue;
			            	 
//		 	             }
			             
//		 	             if( str.charAt(n) == '(') {
			            	 
//		                       char ch = s.pop();
//		                       int sum=0;
//		                      while(ch!=')' || !s.isEmpty()){
			            	
//		 	            	int symbol  =0;  // 43 '+' , and 45 '-'
//		 	            	 int number = 0;
		                         
//		 	            	 if(ch == '+')
//		 	            		 symbol =43;
		                         
//		 	            	 else if(ch == '-')
//		 	            		 symbol=45;
		                         
//		 	            	 else// number hoga
//		 	            	 number  = s.pop()- '0';// '0' = 48
			            	 
		                  
			            	 
//		 	            	 if(sum==0) {
//		 	            		 sum=number;
//		 	            	 }else
			            	 
			            	 
//		 	             }
			            
			            
//		                  }
			            
			           
//		 	        }
//		 	        return 0;
//		 	    }
		  static int findSum(String str)
		    {
		        // A temporary string
		        String temp = "0";
		 
		        // holds sum of all numbers present in the string
		        int sum = 0;
		 
		        // read each character in input string
		        for (int i = 0; i < str.length(); i++) {
		            char ch = str.charAt(i);
		 
		            // if current character is a digit
		            if (Character.isDigit(ch))
		                temp += ch;
		 
		            // if current character is an alphabet
		            else {
		                // increment sum by number found earlier
		                // (if any)
		                sum += Integer.parseInt(temp);
		 
		                // reset temporary string to empty
		                temp = "0";
		            }
		        }
		 
		        // atoi(temp.c_str()) takes care of trailing
		        // numbers
		        return sum + Integer.parseInt(temp);
		    }
		 
		}

}