package StringQuestions;

public class CountOccurenaceOfCharInString {

	public static void main(String[] args) {
		String s = "jaimatadi";
		int count = 0;
		for(int i = 0;i<s.length();i++) {
			
			if(s.charAt(i)== 'a') {
				count++;
			}
		}
		System.out.println(count);

	}

}
