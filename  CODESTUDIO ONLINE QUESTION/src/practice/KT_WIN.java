package practice;

public class KT_WIN {
	
		
		
	    static char whoWins(String t) {
	        return whoWinsHelper(t,-1,-1);
	    }
	    static char whoWinsHelper(String s, int k, int t) {
	        if(s.length()==0)
	        	 if(k>t)
	 	            return 'K'; 
	 	        else if(k<t) 
	 	            return 'T';
	 	        else
	 	        	return 'D';
	        if(s.charAt(0)%2==0) {
	        	//ans='K';
	        	k++;
	        }
	        else {
	        	//ans='T';
	        	t++;
	        }
	        
	        char ch=whoWinsHelper(s.substring(1),k, t);
	       
		
	        return ch;
	        
	       
	        
	    }
	  
	    public static void main(String[] args) {
	    	String s="234";
			System.out.println(whoWins("212343"));
			System.out.println(s.charAt(1)%2);
		}
	    
	    
	
}
