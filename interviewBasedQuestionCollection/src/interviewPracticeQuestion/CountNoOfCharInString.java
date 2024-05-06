package interviewPracticeQuestion;

public class CountNoOfCharInString {

	public static void main(String[] args) {
		
		String s = "myname is shubham";
		
		System.out.println(s.length());
		int count = 0;
		
		for(int i = 0;i<s.length();i++) {
			System.out.println(s.charAt(i));
			count ++;
		}
		
		System.out.println(count);

	}

}
