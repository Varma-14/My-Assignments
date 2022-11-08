package week5.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListGoogle {
	public static void main(String[] args) {
		String[] value= {"Google", "Microsoft", "TestLeaf", "Maverick"};
		int length= value.length;
		Arrays.sort(value);
		List<String> company= new ArrayList<String>();
		for (int i = 0; i<length; i++) {
			company.add(value[i]);
		}
		//print the list
		System.out.println(company);
		for (int i = 0; i < company.size(); i++) {
			//System.out.println(company.get(i));
			
		}
		//foreach----> element based iteration
		for (String string : value) {
			System.out.println(string);
		}
	}

}
