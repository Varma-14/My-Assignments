package week5.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListElements {
	public static void main(String[] args) {
		List<Integer> number= new ArrayList<> ();
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		number.add(6);
		number.add(7);
		number.add(8);
		number.add(9);
		number.add(10);
		System.out.println(number);
		Collections.sort(number);
		System.out.println(number);
		Collections.reverse(number);
		System.out.println(number);
		number.size();
		System.out.println(number.size());
		
		
	}

}
