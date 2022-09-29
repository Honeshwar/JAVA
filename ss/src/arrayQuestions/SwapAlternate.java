package arrayQuestions;

public class SwapAlternate {
	public static void swapAlternate(int arr[]) {
		int n = arr.length;
		if (n % 2 != 0) {
			n = n - 1;
		}
		for (int start = 0; start < n; start += 2) {
			int temp = arr[start];
			arr[start] = arr[start + 1];
			arr[start + 1] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5 };
		int n = a.length;
		swapAlternate(a);
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}