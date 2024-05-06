package collectionFramework;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class Queues1 {

	public static void main(String[] args) {
		//linked list 
		Queue<String> tickets = new LinkedList<>();
		tickets.offer("shubham");
		tickets.offer("raubinsh");
		tickets.offer("shekhar");
		System.out.println(tickets);
		
		System.out.println(tickets.poll());
		System.out.println(tickets);
		
		System.out.println(tickets.peek());
		
		
		//priority Queue
		
		PriorityQueue<Integer> elements = new PriorityQueue<Integer>();
		elements.offer(561);
		elements.offer(67);
		elements.offer(78);
		
		System.out.print(elements);
		elements.poll();
		System.out.println(elements);
		
		
		
				

	}

}
