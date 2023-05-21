
package stringProgramming;

public class ReverseString {

	public static void main(String[] args) {

		String s1 = "TESTING", rev = "";
		int Lngth = s1.length();
		for (int i = Lngth - 1; i >= 0; i--) {
			rev = rev + s1.charAt(i);
		}
		System.out.println("Reverse is: " + rev);

	}

}
