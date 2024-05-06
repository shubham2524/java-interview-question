package polymorphism;

class Parent{
	
	public void property() {
		System.out.println("parent Propertys");
	}

	
}

class Child extends Parent{
	
	public void property() {
		System.out.println("child property");
	}
}

public class Overridding{
	
	public static void main(String [] arg) {
		Child c = new Child();
		c.property();
		Parent p = new Child();//upcasting :-stroring child class in to parent class ref variable
		p.property();
	}
	
	
	
}

