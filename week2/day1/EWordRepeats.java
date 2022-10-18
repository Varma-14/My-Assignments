package week2.day1;

public class EWordRepeats {
public static void main(String[] args) {
	String str= "welcome to chennai";
	char[] charArray=str.toCharArray();
	int count=0;
	int length=charArray.length;
	for (int i = 0; i <length; i++) {
		if (charArray[i]=='e') {
			count++;
			
		}

		}
	System.out.println("count=" + count);

	}
		
	}