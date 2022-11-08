package week5.day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintDuplicate1 {
	public static void main(String[] args) {
		int[] data={1,2,3,4,5,6,7,5,2,8,7,6};
		List<Integer> num= new ArrayList<Integer>();
		for (int i = 0; i < data.length; i++) {
			for (int j = i+1; j < data.length; j++) {
				if (data[i]==data[j]) {
					num.add(data[i]);
					
					
				}
			}
		}
		System.out.println(num);
	}

}
