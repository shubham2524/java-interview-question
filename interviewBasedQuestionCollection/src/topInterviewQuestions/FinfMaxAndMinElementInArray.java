package topInterviewQuestions;

import java.util.Arrays;

public class FinfMaxAndMinElementInArray {

	public static void main(String[] args) {
		
		int a [] = {5,6,8,2,4,1};
		int max = a[0];
		int min = a[0];
		
		for(int i = 0;i<a.length-1;i++) {
			if (a[i]>= max) {
				max = a[i];
			}
			else if(a[i]<=min) {
				min = a[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
	

	}

}
