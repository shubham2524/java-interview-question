package StringQuestions;

public class PrintEvenLengthWord {

	public static void main(String[] args) {
		
		String s = "shubham";
		for(int i = 0;i<s.length();i++) {
			if(i%2 == 0) {
				System.out.println(s.charAt(i));
			}
			
		}
		

	}

}
