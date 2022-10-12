package week1.day3;

public class PrimeNumber {
	public static void main(String[] args) {
		int number=13;
		boolean isPrimeNumber= false;
for(int i=2;i<=number/2;i++) 
{
	
	if(number%i==0) {
		isPrimeNumber= false;
		
		break;
	}
}
if(isPrimeNumber)
{
	System.out.println("Is a Prime number"+ number);
}
else
{
	System.out.println("Not a prime number");
}
		
		
	}

	

	
}
		
	
	
	


