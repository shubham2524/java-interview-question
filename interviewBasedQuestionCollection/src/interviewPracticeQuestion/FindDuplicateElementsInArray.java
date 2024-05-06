package interviewPracticeQuestion;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {
		
		int arr [] = {2,4,5,9,6,8,9,2};
		//approch 1
		int duplicate = arr[0];
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == duplicate) {
				duplicate = arr[i];
			}
		}
		
		
		System.out.println(duplicate);
		
		
		//approch 2 
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
		
		
 
	}

}
