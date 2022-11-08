package week5.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintOnlyDuplicates {
	public static void main(String[] args) {
		String name="SAVITHRI";
		char[] nam=name.toCharArray();
		Arrays.sort(nam);
		Set<Character> word= new LinkedHashSet<Character>();
		for (int i = 0; i < nam.length; i++) {
			if (!word.add(nam[i])){
				System.out.println(nam[i]);

				
			}
			
			//System.out.println(word);


			
		}
	}
}

