package interviewPracticeQuestion;

import java.util.*;

public class OccurenceOfEachWordsInString {

	public static void main(String[] args) {

		String s = "jai mata di jai mata di jai jai shiya ram ";

		String sarr[] = s.split(" ");

		Map<String, Integer> map = new LinkedHashMap<String, Integer>();

		for (String s1 : sarr) {
			if (!map.containsKey(s1)) {
				map.put(s1, 1);

			} else {
				int i = map.get(s1);
				map.put(s1, i + 1);

			}
		}

		System.out.println(map);

	}

}
