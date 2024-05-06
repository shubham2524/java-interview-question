package collectionFramework;

import java.util.Stack;

public class stacks {

	public static void main(String[] args) {
	
		Stack<String> coins = new Stack<String>();
		coins.push("2ruppe");
		coins.push("1 rupee");
		coins.push("10 rupee");
		
		System.out.println(coins);
		System.out.println(coins.peek());
		
		coins.pop();
		System.out.println(coins);
		
		

	}

}
