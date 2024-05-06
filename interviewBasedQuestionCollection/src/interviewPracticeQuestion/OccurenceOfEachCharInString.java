package interviewPracticeQuestion;
import java.util.*;

public class OccurenceOfEachCharInString {

	public static void main(String[] args) {
		
		String s ="shubhamsaurabh";
		
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		
		
		char[] c = s.toCharArray();
		for(char c1 :c) {
			if(!map.containsKey(c1)) {
				map.put(c1,1);
			}
			else {
				int i = map.get(c1);

					map.put(c1,i+1);
				}
			
		}
		
		System.out.println(map);

	}

}
