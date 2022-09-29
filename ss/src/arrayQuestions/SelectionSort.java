package arrayQuestions;

public class SelectionSort {
	public static void sorting(int a[]) {
		int n = a.length;
		for (int i = 0; i <= n - 2; i++) {// <=n-2 or <n-1
											// || <n when some number are same.
			for (int j = i; j <= n - 1; j++) {// because check karna hai all element.
				if (a[i] < a[j]) {
					a[i] = a[i];
				} else {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	
	public static void main(String[] args) {
		int a[] = { 1, 99, 3, 6, 7, 61, 7 };
		sorting(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
