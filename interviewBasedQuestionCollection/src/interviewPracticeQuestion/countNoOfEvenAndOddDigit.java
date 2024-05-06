package interviewPracticeQuestion;

public class countNoOfEvenAndOddDigit {

	public static void main(String[] args) {
		
		int a =6789788;
		
		int evenCount = 0;
		int oddcount = 0;
		int count;
		
		while(a!=0) {
			count =a%10;
			if(a%2==0) {
				evenCount++;
				
			}
			else {
				oddcount++;
			}
			a = a/10;
			
		}
		
		
		System.out.println(evenCount);
		System.out.println(oddcount);
		

	}

}
