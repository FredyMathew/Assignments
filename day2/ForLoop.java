package week1.day2;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maxRange = 10;
		int j = 0;
		for (int i = 0; i <= maxRange; i++) {
			if(i%2 == 1) {
				System.out.println("Odd number is:"+i);
				j = j+1;
			}
		}
		System.out.println("Total no. of odd numbers:"+j);
	}
}
