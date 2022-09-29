package recursion_Basic;

public class Recursion_Test1_Question2 {
	public static boolean splitArray(int input[],int start,int answer1,int answer2) {
		  
		         //answer1 for sum of numbers divisible by 5 
				//and answer2 for sum of numbers divisible by 3
		  
		    	if (start == input.length) 
		        {
		            return answer1 == answer2;
		        }
		         
		    	if (input[start] % 5 == 0)
		        {
		            answer1 += input[start];
		        }
		        else if (input[start] % 3 == 0) 
		        {
		            answer2 += input[start]; 
		        }
		        else
		        {
		            return splitArray(input,start+1, answer1+input[start], answer2)  || splitArray(input,start+1,answer1,answer2+input[start]);
		        }// start +1 because we have to use start(not start+1) value in further
		         // so ++start not work it change start throughout 
		    	//start++ not work in function
		    	return splitArray(input,start+1,answer1,answer2); 
			} 
	
	
	
	
	public static boolean splitArray1(int input[],int start,int answer1,int answer2) {
		if(start==input.length) {
			return answer1==answer2;
		}
		
		if(input[start]%5==0) {
			answer1+=input[start];
			return splitArray(input, ++start, answer1, answer2);
//			 answer1=splitArray(input, ++start, answer1, answer2);
//			return answer1+input[start];
		}else if(input[start]%3==0) {
			answer2+=input[start];
		return splitArray(input, ++start, answer1, answer2);}
		 //answer2=splitArray(input, ++start, answer1, answer2);
		 //return answer2+input[start];
		
//		}else if(input[start]%5!=0&&input[start]%3!=0) {
//			if(answer1<answer2) {
//				answer1=splitArray(input, ++start, answer1, answer2);
//				return answer1+input[start];
//			}else {
//				answer2=splitArray(input, ++start, answer1, answer2);
//				return answer2+input[start];
//			}
//		}return answer1-answer2;
		
		else {
			return splitArray(input, ++start, answer1+input[start], answer2)
					||splitArray(input, ++start, answer1, answer2+input[start]);
		}
//		return splitArray(input, ++;start, answer1, answer2);
	}
		
		public static boolean splitArray(int input[]) {
			return splitArray(input, 0, 0, 0);
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]= {1,2,3,4};
System.out.println(splitArray(n));
	}

}
