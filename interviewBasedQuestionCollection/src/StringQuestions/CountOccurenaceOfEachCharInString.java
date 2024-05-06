package StringQuestions;

public class CountOccurenaceOfEachCharInString {

	public static void main(String[] args) {
		
		String s = "JorSeBoloJaiMataDi";
	
		//int count = 0;
		
		for(int i = 0 ;i<s.length();i++) {
			int count = 0;
			for(int j = 1;j<s.length();j++) {
				
				if(s.charAt(i)==s.charAt(j)) {
					s.trim();
					
					count++;
				}
			}
			
			
			System.out.println(s.charAt(i)+"="+count);
		}
		

	}

}
