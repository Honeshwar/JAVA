package recursion_Basic;

public class GP {
	public static double findGeometricSum(int k){
		if(k==0){
            return 1.000000;
        }
		double smallestValue=findGeometricSum(k-1);
		double res=smallestValue+1/Math.pow(2,k);
//		double answer=smallestValue*1/2;
//		return answer;
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int k=3;
System.out.println(findGeometricSum(k));
	}

}
