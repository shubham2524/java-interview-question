package interviewPracticeQuestion;

public class CheckNumberIsPrimeOrNot {

	public static void main(String[] args) {
		
		int a = 31;
		int count = 0;
		
		for(int i = 1;i<a;i++) {
			 
			if (a%i == 0) {
				 count++;
				
			}
			
		}
		System.out.println(count);
		if(count <= 1 ) {
			System.out.println(a+" number is prime number");
		}
		else {
			System.out.println(a+" not prime number");
		}
		

	}

}
