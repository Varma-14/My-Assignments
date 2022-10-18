package week2.day1;

public class ChangeOddIndexToUpperCase {
public static void main(String[] args) {
	String test="changeme";
	int length= test.length();
	char[] word= test.toCharArray();
	for (int i = 0; i < word.length; i++) {
		if (i%2 !=0) {
			String strcpy= "";
			strcpy=strcpy+word[i];
			System.out.println(strcpy.toUpperCase());
		}
		else
		{
			System.out.println(word[i]);
		}
		
	}



}
}
