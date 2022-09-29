package arrayQuestions;

public class FindUniqueNumberInArray {
	public static int findUnique(int[] arr) {
		
		int answer = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count = count + 1;
				}
			}
			if (count == 1) {
				answer = arr[i];
			}
		}
		return answer;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 5,2 };
		
		
		System.out.println(findUnique(a));

	}

}
