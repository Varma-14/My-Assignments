package week2.day1;

public class ReverseString {
public static void main(String[] args) { 
	String name= "sreedhar varma";
	char[] charArray= name.toCharArray();
	for (int i = 0; i < charArray.length; i++) {
		System.out.println(charArray[i]);
		
	}
	for (int i = charArray.length-1; i>=0; i--) {
		System.out.println(charArray[i]);

	}

}
		
	}


