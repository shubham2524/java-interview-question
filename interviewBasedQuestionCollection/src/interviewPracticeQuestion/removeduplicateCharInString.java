package interviewPracticeQuestion;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeduplicateCharInString {

	public static void main(String[] args) {

		String s = "shubhamsaurabh";
		//if char is not present in string then it will return  -1
		System.out.println(s.indexOf('p'));
		String rep = "";

		//Approch 1
		for (int i = 0; i < s.length(); i++) {
			
				char c = s.charAt(i);
				int index = rep.indexOf(c);
				if (index == -1) {
					System.out.print(c);
				}
				rep += c;

			
		}
		//approch 2 using inbuilt methord
		String dup ="";
		
		Set<Character> duplicate = new LinkedHashSet<Character>();
		for(int i = 0;i<s.length();i++) {
			duplicate.add(s.charAt(i));
			
		}
		
		StringBuilder sb = new StringBuilder();
		for(Character s2 : duplicate) {
			sb.append(s2);
		}
		System.out.println();
		System.out.println(sb);
		
	}

}
