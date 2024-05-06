package interviewPracticeQuestion;

import javax.security.auth.callback.ConfirmationCallback;

public class InteriewQuestion {

	public static void main(String[] args) {
		
//		String s = "Senior Associate Engineer";
//		
//		String word [] = s.split(" ");
//		String temp = word[1];
//		 word[1] = word[2];
//		 word[2] = temp;
//		 StringBuilder sb = new StringBuilder();
//		 for(String words :word) {
//			 sb.append(words).append(" ");
//			 
//		 }
//		 System.out.println(sb);
//		
		
		
//		String title = "senior associate engineer";
//		// Find the indices of the spaces
//		int firstSpaceIndex = -1;
//		int secondSpaceIndex = -1;
//		for (int i = 0; i < title.length(); i++) {
//			if (title.charAt(i) == ' ') {
//				if (firstSpaceIndex == -1) {
//					firstSpaceIndex = i;
//				} else {
//					secondSpaceIndex = i;
//					break;
//				}
//			}
//		} // Extract the words
//		String firstWord = title.substring(0, firstSpaceIndex);
//		String secondWord = title.substring(firstSpaceIndex + 1, secondSpaceIndex);
//		String thirdWord = title.substring(secondSpaceIndex + 1);
//		// Construct the new title
//		String newTitle = firstWord + " " + thirdWord + " " + secondWord;
//		System.out.println("Converted title: " + newTitle);


		
		
		String s = "shubham saurabh singh";
		
		int firstspaceIndex = 0;
		int secondsoaceIndex = 0;
		
		for(int i = 0;i<s.length();i++) {
			if (s.charAt(i) == ' ') {
				if(firstspaceIndex == 0) {
					firstspaceIndex = i;
				}
				else {
					secondsoaceIndex = i;
					break;
				}
			}
		}
		String w1 = s.substring(0,firstspaceIndex);
		String w2 = s.substring(firstspaceIndex+1,secondsoaceIndex);
		String w3 = s.substring(secondsoaceIndex +1);
		System.out.println(w1);
		System.out.println(w1+" "+w3+" "+w2);
		
	}

}
