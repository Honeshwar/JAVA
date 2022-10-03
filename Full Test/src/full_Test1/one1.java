package full_Test1;

import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
public class one1 {
	
	
	
	private static void showJumpingNos(int x) {

		for(int i=0; i<=x; i++)// i denote No's
		{
			
			boolean isJumpingNos=false;
			if(i<10) {
				System.out.print(i+" ");
				continue; // all single digit no. are jumping no's
			}
			
			else if(i>=10) {
				
				HashMap <Integer , Integer > m = new HashMap<Integer, Integer>();
				// key = one digit value adjacent digit.
				
				int temp = i;
				
				while(temp>=10) {
					int key = temp%10;
					temp=temp/10;
					int value=temp%10;
					
					if(Math.abs(key-value) != 1) {
						isJumpingNos=false;
						break;
					}else {
						isJumpingNos=true;
					}
						
						
					
					
				}
				if(isJumpingNos)
				System.out.print(i+" ");
				
			}
		}
		
	}
	
	
	public static void bfs(int x, int num)
    {
        
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(num);
 
      
       while(!q.isEmpty()){
	        num = q.remove();
           // System.out.println(num);

	        if(num <= x){
	        	System.out.print(num + " ");
	            int last = num%10;
	            if(last == 0){
	                q.add((num*10) + (last+1));
	            }
	            else if(last == 9){
	                q.add((num*10) + (last-1));
	            }
	            else{
	                q.add((num*10) + (last+1));
	                q.add((num*10) + (last-1));
	            }
	        }
	    
        }
    }
 
  public static void showJumpingNos2(int x)
    {
        System.out.print("0 ");
 
        for (int i = 1; i <= 9 && i <= x; i++) {
            bfs(x, i);
        }
    }
 


	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		int x = s.nextInt();
		showJumpingNos(x);
	}

		
		
	
}
