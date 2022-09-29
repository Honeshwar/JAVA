package arrayQuestions;

public class FindDuplicate {
	public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        if (arr.length==0){
            return -1;
        }
        int answer = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count = count + 1;
				}
			}
			if (count == 1) {
				answer = arr[i];
			}
            
		}
		return answer;//reference goes back
        
        
    }
	public static void main(String[] args) {
		int a[] = { 5,4,6,5 };
		System.out.println(duplicateNumber(a));//reference(address) goes up
											//then print inside things(in reference)

	}

}
