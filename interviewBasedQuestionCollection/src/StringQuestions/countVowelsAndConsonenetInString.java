package StringQuestions;

public class countVowelsAndConsonenetInString {

	public static void main(String[] args) {
		
		String s = "shubhamsaurabhsingh";
		
		String Vowels = "aeiou";
		
		int vowelcount = 0;
		
		
		
		for(int i = 0;i<s.length();i++) {
			for(int j = 0;j<Vowels.length();j++) {
				if(s.charAt(i)== Vowels.charAt(j)) {
					vowelcount++;
				}
				
			}
			
		}
		System.out.println(vowelcount);
		System.out.println(s.length());
		int constcount = s.length()-vowelcount;
		System.out.println(constcount);

	}

}
