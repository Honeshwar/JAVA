package arrayQuestions;

import java.util.Scanner;

public class Ap {
	public static int probability(int n, int x) {
		int nFactorial = 1;
		for (int i = 1; i <= n; i++) {
			nFactorial = nFactorial * i;
		}
		int xFactorial = 1;
		for (int i = 1; i <= x; i++) {
			xFactorial = xFactorial * i;
		}
		int n_xFactorial = 1;
		for (int i = 1; i <= x; i++) {
			n_xFactorial = n_xFactorial * i;
		}
		int fourMinusX = 1;
		for (int i = 1; i <= x; i++) {
			fourMinusX = fourMinusX * i;
		}
		int fourMinusNMinusX = 1;
		for (int i = 1; i <= x; i++) {
			fourMinusNMinusX = fourMinusNMinusX * i;
		}
		int four = 1;
		for (int i = 1; i <= 4; i++) {
			four = four * i;
		}

		int eight = 1;
		for (int i = 1; i <= 8; i++) {
			eight = eight * i;
		}
		int eight_N = 1;
		for (int i = 1; i <= 8 - n; i++) {
			eight_N = eight_N * i;
		}
		int answer1 = four / (fourMinusX * xFactorial);
		int answer2 = four / (fourMinusNMinusX * n_xFactorial);
		int answer3 = eight / (eight_N * nFactorial);
		int result = (answer1 * answer2) / answer3;
		return result;
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int n2 = s.nextInt();
		int answer = probability(n, n2);
System.out.println(answer);
	}
}

//	Scanner s=new Scanner(System.in);
//	int n=s.nextInt();
//	for(int i=1;i<=n;i++) {
//		for(int j=n;j>=1;j--) {
//			if (j==i) {
//				System.out.print("*");
//			}else {
//				System.out.print(j);
//			}
//		}System.out.println();
//	}}}

//	int n=s.nextInt();
//	if (n==0) {
//		return;
//	}
//	int a=s.nextInt();
//	int temp;
//	int i=1;
//	while(i<=n-1) {
//		int b=s.nextInt();
//		temp=b-a;
//		if ((b-a)==temp) {
//			System.out.println("true");
//			a=b;
//			b=s.nextInt();
//			if(i==n-2) {
//				if((b-a)==temp)
//				System.out.println("true");
//				else 
//					System.out.println("false");
//			}
//			i++;
//			
//		}else {
//			System.out.println("false");
//		}
//	}
//	// Write your code here
//    Scanner s = new Scanner(System.in);
//    int n = s.nextInt();
//    
//    if(n<3){
//        System.out.print(true);
//    }
//    else{
//        int prev = s.nextInt();
//        int curr = s.nextInt();
//        
//        int flag = 0;
//
//        int diff = curr - prev;
//
//        for(int i = 1; i<n-1; i++){
//            if(curr - prev != diff){
//                System.out.print(false);
//                flag++;
//                break;
//            }
//            else{
//                prev = curr;
//                curr = s.nextInt();
//            }
//        }
//        if(flag==0){System.out.print(true);}
//        
//    }
//}
//}
