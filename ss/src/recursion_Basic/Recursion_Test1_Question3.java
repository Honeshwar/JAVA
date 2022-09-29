package recursion_Basic;

import java.util.Arrays;

public class Recursion_Test1_Question3 {
	public static int maximumProfit(int budget[]) {
		// Write your code here
		Arrays.sort(budget);
        int answer=Integer.MIN_VALUE;
        for(int i=0;i<budget.length;i++){
            answer=Math.max(answer,budget[i]*(budget.length-i));
            // i increase budget decrease once so that time
            //we get our profit
           // answer=Math.max
        }
        return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
