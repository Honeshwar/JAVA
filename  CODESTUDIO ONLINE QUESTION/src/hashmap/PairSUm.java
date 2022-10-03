package hashmap;

import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 


public class PairSUm {

	
	    public static int[][] pairSum(int[] arr, int s) {
	        
	    	Arrays.sort(arr);
	        int output [][] = new int[0][2];
	        HashMap<Integer,Integer> h = new  HashMap<Integer,Integer>();//key is arr element , value == frquency
	        
	        //add all array to hashmap
	        for(int i=0;i<arr.length;i++)
	        {
	            if (h.containsKey(arr[i]))
	                h.put(arr[i],h.get(arr[i])+1);
	            else
	                 h.put(arr[i],1);
	            
	        }
	        
	        // check for pair
	        boolean flag = true;
	        int i=0;
	        int row=0;
	        while(i<arr.length){
	            int pair_Part1 = arr[i];
	            int pair_Part2 =  s - arr[i];
	            if(h.containsKey(pair_Part2) && h.get(pair_Part2)!=0 )//&& h.get(pair_Part1)!=0
	            {
	                int frq_p1 = h.get(pair_Part1);
	                int frq_p2 = h.get(pair_Part2);
	                int no_Of_Pair = frq_p1 * frq_p2;
	              
	                for(int j=0; j<no_Of_Pair;j++){
	                	
	                int temp[][] = output;
	                output = new int [row+1][2];
	                
	                for(int k=0;k<temp.length;k++) {
	                	for(int l=0;l<2;l++) {
	                		output[k][l] = temp[k][l]; 
	                	}
	                }
	                
	                    output[row][0] = pair_Part1; 
	                    output[row][1] = pair_Part2; 
	                    row++;
	                    h.put(pair_Part1,0);
	                    h.put(pair_Part2,0);
	                }
	            }
	            i++;
	            
	            
	        }
	        
	     
	        return output;
	    }
	        
	    
	    public static void main(String[] args) {
			
	    Scanner s= new Scanner(System.in);
	    
	    int n=s.nextInt();
	    int y = s.nextInt();
	    int a[]=new int[n];
		for(int i=0;i<n;i++) {
	    	a[i]=s.nextInt();
	    }
	    	int ans[][] = pairSum(a, y);
	    	
	    	   
			for(int i1=0;i1<ans.length;i1++){
	    			 for(int j=0;j<2;j++){
	    				 if(ans[i1]==null)
	    					 System.out.println(i1);
	    			        System.out.print(ans[i1][j]);
	    			 }
	    			            System.out.println();
	    			        }
	    	
	    	
	    	
	    	
		}
	}





-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15
-15