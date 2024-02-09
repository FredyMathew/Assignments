package week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[] = {1,4,3,2,8,6,7};
		int output = 0;
		
		Arrays.sort(input);
		for (int i = 0; i < input.length; i++) {
			if((i+1) != input[i]) {
				output = i + 1;
				System.out.println("Missing value: " + output);
				break;
			}
			
		}
	}

}
