package topInterviewQuestions;

public class CountNoOfDigit {

	public static void main(String[] args) {
		
		int a = 56789;
		int count = 0;
		int digit =0;
		
		while(a!=0) {
			digit = 10*digit +a%10;
			count++;
			a = a/10;
			
		}
		System.out.println(count);
	}

}
