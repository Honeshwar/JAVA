package dynamic_Programing2;

public class Min_Edit_Distance {

	//recusively
	//T(n)=(3^n+m)  due to 3 for entire string in3 possible path recursion call
	public static int minEdit(String str1,String str2,int i,int j) {
		
		//base case
		if(i==str1.length())
			return str2.substring(j).length();
		
		if(j==str2.length())
			return str1.substring(i).length();// edit entire substring add length=3 edit=3;
		
		int myAns=0;
		if(str1.charAt(i)==str2.charAt(j)) {
			// no edit
			return minEdit(str1, str2, i+1, j+1);//tell about futher substring edit.
			
		}
		else {
			//actual delete nahi karna hai just assume
			int ans1=minEdit(str1, str2, i+1, j);//delete
			int ans2=minEdit(str1, str2, i+1, j+1);//replace
			int ans3=minEdit(str1, str2, i, j+1);//insert
			
			return 1+Math.min(ans1, Math.min(ans2, ans3));//+1 due to else
			
			
			
			
			
		}
		
	}
	
	
	
	//memoization
public static int minEdit(String str1,String str2,int i,int j,int dp[][]) {
		
		//base case
		if(i==str1.length()) {
			dp[i][j]=str2.substring(j).length();
			return str2.substring(j).length();
		}
		if(j==str2.length()) {
			dp[i][j]=str1.substring(i).length();
			return str1.substring(i).length();// edit entire substring add length=3 edit=3;
		}
		
		
		
		int myAns=Integer.MAX_VALUE;
		if(str1.charAt(i)==str2.charAt(j)) {
			// no edit
			if(dp[i+1][j+1]==0) {
			myAns= minEdit(str1, str2, i+1, j+1,dp);//tell about futher substring edit.
			dp[i+1][j+1]=myAns;}
			else
				myAns=dp[i+1][j+1];
		}
		else {
			//actual delete nahi karna hai just assume
			int ans1=Integer.MAX_VALUE,ans2=Integer.MAX_VALUE,ans3=Integer.MAX_VALUE;
			if(dp[i+1][j]==0) {
				ans1=minEdit(str1, str2, i+1, j,dp);//delete
				dp[i+1][j]=ans1;
			}else
				ans1=dp[i+1][j];
			
			if(dp[i+1][j+1]==0) {
				 ans2=minEdit(str1, str2, i+1, j+1,dp);//replace
				dp[i+1][j+1]=ans2;
			}else
				ans2=dp[i+1][j+1];
			
			if(dp[i][j+1]==0) {
				 ans3=minEdit(str1, str2, i, j+1,dp);//insert
				dp[i][j+1]=ans3;
			}else
				ans3=dp[i][j+1];
			
			
			
			
			myAns= 1+Math.min(ans1, Math.min(ans2, ans3));//+1 due to else
			
		}
			
			return myAns;
			
		}



//iterative
class Solution1{

/*
2
    Time Complexity : O(M * N)
3
    Space Complexity : O(M * N)
4

5
    Where M and N are the lengths of string 's' and 't' respectively
6
*/

public class Solution {

    private static int editDistanceHelper(String s, String t, int[][] subProblems) {

        if(s.length() == 0) {

            return t.length();

        }

        if(t.length() == 0) {

            return s.length();
        }

        int m = s.length();

        int n = t.length();


        if (subProblems[m][n] != -1) {

            return subProblems[m][n];

        }
        if (s.charAt(0) == t.charAt(0)) {

            int smallAns = editDistanceHelper(s.substring(1), t.substring(1), subProblems);

            subProblems[m - 1][n -1] = smallAns;
            subProblems[m][n] = 0 + smallAns;

        } else {
            int remove = editDistanceHelper(s.substring(1), t, subProblems);
            subProblems[m - 1][n] = remove;

            int insert = editDistanceHelper(s, t.substring(1), subProblems);

            subProblems[m][n - 1] = insert;

            int substitute = editDistanceHelper(s.substring(1), t.substring(1), subProblems);

            subProblems[m - 1][n -1] = substitute;

            subProblems[m][n] = 1 + Math.min(remove, Math.min(insert, substitute));

        }

        return subProblems[m][n];

    }

    public static int editDistance(String s, String t) {

        int m = s.length(); 

        int n = t.length();
        int[][] subProblems = new int[(m + 1)][(n + 1)];

        //Assigning all the values with -1

        for (int i = 0; i <= m; i++) {

            for (int j = 0; j <= n; j++) {

                subProblems[i][j] = -1;

            }

        }

        return editDistanceHelper(s, t, subProblems);

    }
}}
	public static void main(String[] args) {
	    
		System.out.println(minEdit("abcd", "abcd", 0, 0));
		 System.out.println(minEdit("abcd", "abcd", 0, 0, new int[5][5]));
	}
}
