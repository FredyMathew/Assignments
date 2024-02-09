package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int givenNum = 8;
		int num1 = 0;
		int num2 = 1;
		String output = "0"; 
		
		for (int i = 0; i < givenNum-1; i++) {
			int fibo = num1 + num2;
			num1 = num2;
			num2 = fibo;
			output = output + ", " + num1;
		}
		System.out.println("Fibonacci Series for " + givenNum + " is :" + output);
	}

}
