package interviewPracticeQuestion;

public class CountaNoOfDigitInNumber {

	public static void main(String[] args) {
		
		int a = 56789;
		int count = 0;
		
		
		while(a!=0) {
			a = a/10;
			count ++;
		}
		
		System.out.println(count);
		

	}

}
