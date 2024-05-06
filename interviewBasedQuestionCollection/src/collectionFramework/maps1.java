package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class maps1 {

	public static void main(String[] args) {
		
		Map<String, Integer> students = new HashMap< >();
		students.put("shubham", 101);
		students.put("saurabh",102);
		students.put("singh",103);
		
		System.out.println(students);
		
		students.put("singh", 104);
		
		System.out.println(students);
		
		

	}

}
