package interviewPracticeQuestion;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		
		int a = 6 ;
		int b =7000;
		int c = 50010;
		
		if(a>b && a>c) {
			System.out.println(" a is largest");
		}
		else if (b>c && c>a){
			System.out.println("b is largets");	
		}
		else if(c>b && c>a){
			System.out.println("c is largest");
		}

	}

}
