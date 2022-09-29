package recursion_3;

public class Print_Keypad {

	
	
	
	
	 class solution {

	    
	    
	    public static String[] singleDigit(int n){
	  
	        if(n<=1 || n>10){
	 
	            System.exit(0);
	  
	        }
	 
	        if(n==2){
	 
	            String output[] ={"a","b","c"};
	 
	            return output;
	  
	        }
	  
	        else if(n==3){
	  
	            String output[] ={"d","e","f"};
	  
	            return output;
	   
	        }
	  
	        else if(n==4){
	   
	            String output[] ={"g","h","i"};
	  
	            return output;
	  
	        }
	  
	        else if(n==5){
	  
	            String output[] ={"j","k","l"};
	  
	            return output;
	  
	        }
	  
	        else if(n==6){
	  
	            String output[] ={"m","n","o"};
	  
	            return output;
	  
	        }
	  
	        else if(n==7){
	  
	            String output[] ={"p","q","r","s"};
	  
	            return output;
	  
	        }
	  
	        else if(n==8){
	  
	            String output[] ={"t","u","v"};
	  
	            return output;
	  
	        }
	  
	        else{
	  
	            String output[] ={"w","x","y","z"};
	  
	            return output; 
	  
	        }
	  
	    }
	  
	    public static void printKeypad(int input, String output){
	  
	        if(input == 0){

	            System.out.println(output);
	   
	            return;

	        }
	        String singleDigitOutput[] = singleDigit(input % 10);

	        for(int i = 0; i < singleDigitOutput.length; i++){

	            printKeypad(input / 10, singleDigitOutput[i] + output);

	        }

	    }
	    

	    public static void printKeypad(int input){

	        printKeypad(input, "");
	   }

	}


	
	
	
	
	
	public static void printKeypad(int input, String ans) {
		if(input==0) {
			System.out.print(ans+" ");
			return;
		}
		String small[]=helper(input%10);
		// eg. 23
		printKeypad(input/10, small[0]+ans);
		
		printKeypad(input/10, small[1]+ans);
		
		printKeypad(input/10, small[2]+ans);
		if(small.length>3) {
			printKeypad(input/10, small[3]+ans);
		}
		
		
	}

private static String[] helper(int n) {
		
		if(n<=1 || n>10){
			System.exit(0);
		}

		if(n==2){
			String output[] ={"a","b","c"};
			return output;
		}
		else if(n==3){
			String output[] ={"d","e","f"};
			return output;
		}
		else if(n==4){
			String output[] ={"g","h","i"};
			return output;
		}
		else if(n==5){
			String output[] ={"j","k","l"};
			return output;
		}
		else if(n==6){
			String output[] ={"m","n","o"};
			return output;	
		}
		else if(n==7){
			String output[] ={"p","q","r","s"};
			return output;
		}
		else if(n==8){
			String output[] ={"t","u","v"};
			return output;	
		}
		else{
			String output[] ={"w","x","y","z"};
			return output; 
		}
	}


	public static void main(String[] args) {
		printKeypad(23, "");
	}
	
	
	
	
	
	
	}

