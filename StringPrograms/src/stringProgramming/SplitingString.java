package stringProgramming;

public class SplitingString {

	public static void main(String[] args) {
		String s1 = "Automation Testing is trending now";
		System.out.println("Enter the string to Split: ");
		// create string array
		String ar[] = s1.split(" "); // split method is used for spliting we can split with the help of spaces and
										// characters
		for (String Ar1 : ar) {  
			System.out.println(Ar1);
		}
	}

}
