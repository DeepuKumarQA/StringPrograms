package stringProgramming;

public class StringTest {

	public static void main(String[] args) {
String s1="AA BB CC AA";
String s2="ABBA";
String rev="";
int count = s1.length();
System.out.println("String count is: "+count);

// now have to find occurrence of A
int count1= count-s1.replace("A", "").length();
System.out.println("The occurrence of A: "+count1);

// now do contains method 

System.out.println(s1.contains("AA"));

//splitting

String [] str2= s1.split(" ");
for(String str3: str2) {
	System.out.println(str3);
}
int count3= s2.length();
for(int i=count3-1; i>=0; i--) {
	rev=rev+s2.charAt(i);
}
System.out.println(rev);

	if(rev==s2) {
		System.out.println("this is palindrome");
	}else {
		System.out.println("this is not palindrome");
	}
	}
}
	
