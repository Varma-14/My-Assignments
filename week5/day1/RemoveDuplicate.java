package week5.day1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,1,3,6,8,2,5};
		Arrays.sort(num);
		Set<Integer> number= new TreeSet<Integer>();
		for (int i = 0; i < num.length; i++) {
			number.add(num[i]);
			
		}
		System.out.println(number);

	}
	

}
