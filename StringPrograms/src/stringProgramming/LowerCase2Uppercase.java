package stringProgramming;

public class LowerCase2Uppercase {

	public static void main(String[] args) {
		String s1 = "test1";
		String s2 = "TEST2";

		String lwrcse = s2.toLowerCase();
		System.out.println("Lowercase string: " + lwrcse);
		System.out.println("-----------------------");
		String uprcse = s1.toUpperCase();
		System.out.println("Uppercase string: " + uprcse);
	}
}
