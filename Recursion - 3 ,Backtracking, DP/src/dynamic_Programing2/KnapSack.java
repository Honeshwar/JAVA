package dynamic_Programing2;

public class KnapSack {

	//recusively
	public static int maxSteal(int value[],int weight[],int totalWeightCanSteal,int i) {//i=index start of weight
		if(i==weight.length)
			return 0;
		
		
		int myAns=Integer.MIN_VALUE;
		if(weight[i]>totalWeightCanSteal) {
			myAns= maxSteal(value, weight, totalWeightCanSteal, i+1);// i=0 not possible check further.
			
		}
		
		else { // weight[i]  <=  totalWeightCanSteal
			//i=0 sare subet dekh sum kar if <=totalWeightCanSteal ,max in value == ans
			
			// return value is present in returning matrix.
			int ans1=value[i]+maxSteal(value, weight, totalWeightCanSteal-weight[i], i+1);//included
			int ans2=maxSteal(value, weight, totalWeightCanSteal, i+1);     //excluded  
	   //why excluded and included            //entire subset check kar sakah for close sum to totalWeightCanSteal
			
			
			myAns=Math.max(ans1, ans2);
		}
		
		return myAns;
	}
	
	
	//iterative
	public static int knapSack(int price[],int wt[],int W) {
		
		
		int dp[][]=new int [wt.length+1][W+1]; 
		// matrix created that (ith,jth) cell denote max. prive(value) given to weighted thing .
		//entire no. from 0 to W ,  weight price  for all weight from 0 to W .
		//ans[0][W]  where aactual weight W present that cell that cell give us max prixce.
	
	//base case fill=0, by deault already zero
	//dp[i][j] denotes max. price cell for 0 to W weight.
		for(int i=wt.length-1;i>=0;i--) {
			for(int wIndex=0;wIndex<=W;wIndex++) {
				
				int ans;
				if(wt[i]<=wIndex) {
				// ans=ans+1;// re-initilize only possible when ans already initillize,;
					int ans1= price[i]// imp.
							+dp[i+1][wIndex-wt[i]];
					int ans2= dp[i+1][wIndex];
					ans=Math.max(ans1, ans2);// declare ,not re-initilize 
					
					
				}else {
					ans=dp[i+1][wIndex];
				}
				dp[i][wIndex]=ans;
			}
		}
	
	return dp[0][W];
	
	
	
	}
	
	public static void main(String[] args) {
		int value[]= {200,300,100};
		int weight[]= {20,25,30};
		System.out.println(maxSteal(value, weight, 50, 0));
		System.out.println(knapSack(value, weight, 50));
	}
}
