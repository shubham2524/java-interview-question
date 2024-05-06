package inheritenec;
//it is process in which we can inherit all the property from parent to child 
public class Test {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		System.out.println(p.accountBal);
		System.out.println(p.propertyValue);
		p.parentJob();
		
		Child c = new Child();
		System.out.println(c.childAccBal);
		System.out.println(c.childJobSallry);
		System.out.println(c.accountBal);
		System.out.println(c.propertyValue);
		c.ChildJob();
		c.parentJob();
		
		
		
		

	}

}
