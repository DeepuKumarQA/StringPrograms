package stringProgramming; // this is the code for string and also checking comparison between two string.

public class CompareString {

	public static void main(String[] args) {
		String s1 = "test1";
		String s2 = "test2";
		if (s1.contentEquals(s2)) { // contentEquals method is used for comparison
			System.out.println("String is Equal");
		} else {
			System.out.println("String is not Equal");
		}
	}
}
