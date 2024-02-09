package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Palindrome obj = new Palindrome();
		obj.inputPalindrome(121);
		obj.inputPalindrome(12345);
	}

	public void inputPalindrome(int input) {
		int i;
		int temp = input;
		int rem = 0;
	
		for (i =0; temp > 0; temp=temp/10) {
			rem = temp % 10;
			i = i * 10 + rem;
    		
		}
		
		//output = Integer.valueOf(j);
		if (input == i) {
			System.out.println("Given number is palindrome:" + i);
		} else {
			System.out.println("Given number is not palindrome:" + i);
		}
	}
}
