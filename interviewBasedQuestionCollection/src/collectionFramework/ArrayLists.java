package collectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ArrayLists {

	public static void main(String[] args) {
		
//		String arr [] = new String[3];
//		arr[0] = "shubham";
//		arr[1] = "saurabh";
//		arr[2] = "singh";
//		for(String name :arr) {
//			System.out.print(name+" ");
//		}
//		
//		
		
		
		//Array list
		ArrayList<Integer> list = new ArrayList<>();
		list.add(45);
		list.add(56);
		list.add(67);
		list.add(456);
		
		System.out.println(list);
		
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("shhubham");
		nameList.add("saurabh");
		nameList.add("singh");
		
		System.out.println(nameList);
		
		nameList.remove(2);
		System.out.println(nameList);
		
		
		ArrayList<Object> name =  new ArrayList<Object>();
		name.add("name");
		name.add(nameList);
		name.add(245);
		name.add(56789);
		System.out.println(name);
		
		
		
		
		
		
		
		
		
		
		
		}

}
