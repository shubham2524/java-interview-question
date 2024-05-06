package topInterviewQuestions;

public class countPrime0To100 {

	public static void main(String[] args) {
		int totalcount = 0;
		
		for(int i = 1;i<=100;i++) {
			int count = 0;
			for(int j = 1;j<=i;j++) {
				if (i%j == 0) {
					count ++;
				}
			}
			if (count ==2) {
				totalcount ++;
				System.out.print(i+" ,");
				
			}
			
		}
		System.out.println();
		System.out.println("total prime no "+totalcount);

	}

}
