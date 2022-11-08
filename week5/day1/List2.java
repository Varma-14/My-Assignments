package week5.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List2 {
	public static void main(String[] args) {
		String[] value= {"HCL", "Wipro", "Aspire Systems", "CTS" };
	List<String> companyName= new ArrayList<String>();
	for (String variable : value) {
		//System.out.println(variable);
		companyName.add(variable);
	}
	System.out.println(companyName);

	}
	}



