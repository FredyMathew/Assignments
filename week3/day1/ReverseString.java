package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String companyName= "TestLeaf";
		char[] ch = companyName.toCharArray();
		for (int i = companyName.length()-1; i >=0 ; i--) {
			System.out.print(ch[i]);
			
		}
	}

}
