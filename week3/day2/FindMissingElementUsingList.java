package week3.day2;

import java.util.Arrays;

public class FindMissingElementUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr = { 1, 2, 3, 4, 10, 6, 8 };
		int count = 1;
		
		//Sort given numbers
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {		
			if (arr[i] == count) {
				count++;
			} else {
				break;
			}
		}
		System.out.println("Gap is detected. Missing number: " + count);
	}
}
