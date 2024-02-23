package week3.day2;

import java.util.Arrays;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = {"HCL", "Wipro", "Aspire Systems", "CTS" };
		String str = "";
		
		//Sort given string
		Arrays.sort(arr);
		
		//Add the collection to a list
		List<String> list = Arrays.asList(arr);
	
		//Reverse string by concatenating string in end
		for (int i = 0; i < arr.length; i++) {	
			if(i == 0) {
				//to remove comma in the end
				str = list.get(i) + str;
			}else {
				//to add comma after string
				str = list.get(i) + "," + str;	
			}
		}
		System.out.println("String in descending: " + str);
	}
}
