package week5.day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int[] num= {3,2,11,5,20,30,80};
		Set<Integer> mty=new TreeSet<Integer>();
		for (int i = 0; i < num.length; i++) {
			mty.add(num[i]);
			
		}
		List<Integer> larnum= new ArrayList<Integer>(mty);
		int size= larnum.size();
		//System.out.println(size);
		Integer value= larnum.get(size-2);
				System.out.println(value);

	}

}
