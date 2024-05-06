package topInterviewQuestions;
//check given number is palindrome or not
public class palindrome {

	public static void main(String[] args) {
		int originanum = 567898765;
		int a = originanum;
		int rev = 0;
		
		while (a!=0) {
		rev = rev*10+ a%10;
		a = a/10;
		}
		System.out.println(rev);
		if(rev == originanum ) {
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("number is not palindrome");
		}
		

	}

}
