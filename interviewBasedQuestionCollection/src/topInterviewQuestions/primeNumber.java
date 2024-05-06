package topInterviewQuestions;

public class primeNumber {
	//prime number is divisible by one and itself only
	//count prime number between 1 to 100

	public static void main(String[] args) {
		
		int a  = 99;
		int count = 0;
		
		for(int i = 1;i<a;i++) {
			if (a%i == 0) {
				count++;
			}
		}
		if (count <2 ) {
			System.out.println("prime");
			
		}
		else {
			System.out.println("not prime");
		}
	}

}
