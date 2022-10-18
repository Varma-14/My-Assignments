package week2.day1;

public class UsingCharAt {
	public static void main(String[] args) {
		String test="GoodEvening";
		char[] charArray= test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char charAt= test.charAt(i);
			System.out.println(charAt);
			
		}
	
	}

}
