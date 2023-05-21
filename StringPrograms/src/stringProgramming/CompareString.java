package stringProgramming;

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
