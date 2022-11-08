package week5.day1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesWord {
	public static void main(String[] args) {
		String name="testleaf";
char[] strname=name.toCharArray();	
Arrays.sort(strname);
Set<Character> nm= new TreeSet<Character>();
for (int i = 0; i < strname.length; i++) {
	nm.add(strname[i]);
	
}
System.out.println(nm);
	}

}
