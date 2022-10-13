package week1.day4;

public class MissingElementInAnArray {
public static void main(String[] args) {
	int[] array= {1,2,3,4,7,6,8};
	int n= array.length +1;
	int sum= (n * (n+1)/2);
	for (int i = 0; i < array.length; i++) {
		sum= sum - array[i];
	}
	System.out.println("Missing number is" + sum);
		
	}
}

