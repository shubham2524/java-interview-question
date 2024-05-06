package topInterviewQuestions;

public class ReverseOfSentence {

	public static void main(String[] args) {
		String[] s  = "my name is shubham".split(" ");
		for(int i = s.length-1;i>0;i--) {
			System.out.print(s[i]+" ");
		}

	}

}
