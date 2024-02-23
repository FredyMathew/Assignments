package week3.day2;

import java.util.Arrays;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//input array
		Integer[] list = { 3, 2, 11, 4, 6, 7, 15};

		// Sort an array
		Arrays.sort(list);
		
		//take length of array
		int count = list.length;
		
		//get second largest value by index
		int num = list[count-2];
		System.out.println("Second largest number is: " + num);
	}
}
