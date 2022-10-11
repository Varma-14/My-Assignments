package week1.day2;

public class Calculator2 {
	public void addTwoNumbers(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
public void subTwoNumbers(int a, int b) {
	int c=a-b;
	System.out.println(c);
}
public void multipleTwoNumbers(double a, double b) {
	double c=a*b;
	System.out.println(c);
}
public void divideTwoNumbers(float a, float b) {
	float c=a/b;
	System.out.println(c);
}
public static void main(String[] args) {
	Calculator2 cal=new Calculator2();
	cal.addTwoNumbers(250, 350);
	cal.subTwoNumbers(1000, 550);
	cal.multipleTwoNumbers(121.666, 111.222);
	cal.divideTwoNumbers(12.55F, 11.55F);
	
}
}
