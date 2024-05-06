package polymorphism;
//method overlaoding :-same name with different argumants 
//compile time polymorphism
public class overloading {
	
	
	public void m1() {
		System.out.println("m1 with zero arguments");
	}
	
	public void m1(int a) {
		System.out.println("m1 with 1 arguments");
	}

	public static void main(String[] args) {
		
		overloading o = new overloading();
		o.m1();
		o.m1(0);
		
		
	

	}
	
	

}
