package StringQuestions;



public class RemoveDuplicateCharFromString {
	
	public void removeDuplicate(String s [],int a) {
		
	}

	public static void main(String[] args) {
		
		String s = "shubhamsaurabh";
	
		
		for(int i = 0;i<s.length();i++) {
			for(int j = 1 ;j<s.length();j++){
				if(s.charAt(i)== s.charAt(j)) {
					
					s.replace(s.charAt(i),' ');
				}
			}
		}
		
		
		System.out.println(s);

	}
	

}
