package week5.day3;


public class PrintUniqueNumber {
	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,6,7,2,4,7};
		int count=0;
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[i]==num[j]) {
					num[j]=1000;
					count++;
					
										
}	
			}
			if (count<=1 || num[i]!=1000) {
			System.out.println(num[i]);
				
			}
			
		}
	}
	

}
