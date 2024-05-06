package interviewPracticeQuestion;

public class PlindromeString {

	public static void main(String[] args) {
		
		String s = "shubhamsmahbuhs";
		String rev = "";
		
		for(int i = s.length()-1;i>=0;i--) {
			rev = rev+s.charAt(i);
			
		}
		System.out.println(rev);
		if(s.equals(rev)) {
			System.out.println("string is palindrome");
		}
		else {
			System.out.println("string is not a palindrome");
		}
	}

}
