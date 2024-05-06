package interviewPracticeQuestion;

public class ReverseOfNumbers {

	public static void main(String[] args) {
		
		int a = 3456789;
		
		int rev = 0 ;
		while(a!=0) {
			rev = rev *10+ a%10;
			a = a/10;
			
		}
		System.out.println(rev);

	}

}
