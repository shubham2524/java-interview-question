package interviewPracticeQuestion;

public class PlaindromeNumber {

	public static void main(String[] args) {
		int originalnumber = 567876675;
		int a = originalnumber;
		
		int rev = 0;
		while(a!=0) {
			rev = rev*10+ a%10;
			a = a/10;
		}
		if(rev == originalnumber) {
		System.out.println("number is palindrome");
		
		}
		else {
			System.out.println("number is not palindrome");
		}

	}

}
