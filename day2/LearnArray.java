package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array literal
		int[] mark = {32,43,57,65,54,45,57,32,95};
		System.out.println(mark.length);
		
		//to show first array value
		System.out.println(mark[0]);
		
		//to show last array value
		System.out.println(mark[mark.length-1]);
		
		
		//find duplicate 
		Arrays.sort(mark);
		for (int i = 0; i < mark.length; i++) {			
//			if(mark[i] == mark[i+1]) {
//				System.out.println("Dupplicate value" + mark[i+1]);
//			}
			for (int j = i+1; j < mark.length; j++) {
				if(mark[i] == mark[j]) {
					System.out.println("Dupplicate value" + mark[i]);
				}
			}
		}
	}

}
