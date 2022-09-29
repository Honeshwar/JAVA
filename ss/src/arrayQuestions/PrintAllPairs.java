package arrayQuestions;

public class PrintAllPairs {
	public static void printPair(int inputArrray[]) {
		// System.out.print("{");
		for (int i = 0; i < inputArrray.length; i++) {// inputArrray.length-1 same
			for (int j = i + 1; j < inputArrray.length; j++) {
				// System.out.println("("+inputArrray[i]+","+inputArrray[j]+")");
				System.out.print("(" + inputArrray[i] + "," + inputArrray[j] + ")");
			}
		} // System.out.print("}");
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		printPair(a);
	}

}
