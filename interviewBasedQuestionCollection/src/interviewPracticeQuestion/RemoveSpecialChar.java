package interviewPracticeQuestion;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		
		String s = "sh76890@#$%";
		String remove = s.replaceAll("[^0-9a-zA-Z]","");
		System.out.println(remove);
		
		

	}

}
