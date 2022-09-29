package dynamic_Programing2;

public class Loot_Houses {

	
    /*
	Time Complexity : O(n)
	Space Complexity : O(n)

	Where 'n' is the total number of houses
*/

public class Solution {

	public static int maxMoneyLooted(int[] houses) {
		int n = houses.length;

		//Special case
		if (n == 0) {
			return 0;
		}

		if (n == 1) {
			return houses[0];
		}


		int[] maxMoneyCanBeLooted = new int[n];

		maxMoneyCanBeLooted[0] = houses[0];
		maxMoneyCanBeLooted[1] = Math.max(houses[0], houses[1]);

		for (int currHouse = 2; currHouse < n; currHouse++) {
			maxMoneyCanBeLooted[currHouse] = Math.max(maxMoneyCanBeLooted[currHouse - 1], (houses[currHouse] + maxMoneyCanBeLooted[currHouse - 2]));
		}

		return maxMoneyCanBeLooted[n - 1];
	}

}



public class Solution1 {

	public static int maxMoneyLooted(int[] houses) {
        
        
        
        if(houses.length==0)
            return 0;

            if(houses.length==1)
                return houses[0];
            
        
        
		int dp[]=new int [houses.length];
        
        dp[0]=houses[0];
        dp[1]=Math.max(houses[1],dp[0]); // how much he can loot include(max house[1]) or not include upto this cell
	
    for(int i=2;i<dp.length;i++){
        
        
        dp[i]=Math.max(houses[i]+dp[i-2] , dp[i-1]);
        // possible that loot  sum at i=0,i=2   < loot sum at i=0 at i=2 max sum= i=1 sum because loot high in i=1 than two houses ,
        // i=0,i=2 maxum than neighbour
    
    
    
    
    }
    
    return dp[houses.length-1];
    
    }

}

}
