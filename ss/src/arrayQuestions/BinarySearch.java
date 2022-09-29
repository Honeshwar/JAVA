package arrayQuestions;

import java.util.Scanner;

public class BinarySearch {

	public static int binarySearch(int a[], int x) {
		int s = 0;
		int e = a.length;
		int mid;
		while (s <= e) {
			mid = (s + e) / 2;
			if (a[mid] < x) {
				s = mid + 1;
			} else if (a[mid] > x) {
				e = mid - 1;
			} else {
				// if(mid==x) {
				return mid;
				// {
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// int n=s.nextInt();

		int a[] = {};
		int x = 6;
		// binarySearch(a, x);
		System.out.println(binarySearch(a, x));
	}

}
