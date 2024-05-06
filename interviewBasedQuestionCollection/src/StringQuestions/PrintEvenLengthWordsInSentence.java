package StringQuestions;

public class PrintEvenLengthWordsInSentence {

	public static void main(String[] args) {
		
		String[] s = "my name is khan".split(" ");
		for(int i = 0 ;i<s.length;i++) {
			if(i%2 == 0) {
				System.out.println(s[i]);
			}
		}
		
		

	}

}
