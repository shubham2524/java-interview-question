package StringQuestions;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		
		String s = "listen";
		String revs = "silent";
		
		char[] sarr = s.toLowerCase().toCharArray();
		char [] revsarr = revs.toLowerCase().toCharArray();
		Arrays.sort(revsarr);
		Arrays.sort(sarr);
		
		if(Arrays.equals(sarr, revsarr)) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not anagram");
		}
	}

}
