package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring inputs in List
		List<Integer> list1 = Arrays.asList(3, 2, 11, 4, 6, 7);
		
		//declaring inputs in ArrayList
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(8);
		list2.add(4);
		list2.add(9);
		list2.add(7);
		
		String str = "";
		for (int i = 0; i < list1.size(); i++) {			
			for (int j = 0; j < list2.size(); j++) {
				if(list1.get(i) == list2.get(j)) {
					str = str + "\n" + list1.get(i);
				}
			}
		}
		System.out.println("Intersection values are:" + str);
	}
}
