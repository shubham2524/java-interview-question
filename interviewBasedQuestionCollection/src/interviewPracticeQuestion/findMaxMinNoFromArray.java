package interviewPracticeQuestion;

public class findMaxMinNoFromArray {

	public static void main(String[] args) {
		
		int arr [] = {1,3,6,2,5,7};
		
		int max =  arr[0];
		int  min = arr[0];
		
		
		for(int i = 0;i<arr.length;i++) {
			
			if(arr[i]>= max) {
				max = arr[i];
				
				
			}
			else if(arr[i]<= min) {
				min = arr[i];
				
			}
			
			
		}
		System.out.println("max element in array:-"+max);
		System.out.println("min element in array:-"+min);

	}

}
