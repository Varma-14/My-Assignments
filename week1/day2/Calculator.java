package week1.day2;

public class Calculator {
public void addTwoNumbers(int a, int b) {
	int c=a=+b;
	System.out.println(c);
}
public void subTwoNumbers(int a, int b) {
	int c=a-b;
	System.out.println(c);
}
public void multiplyTwoNumbers(int a, int b) {
	int c=a*b;
	System.out.println(c);
}
	public static void main(String[] args) {
		Calculator cal= new Calculator();
		cal.addTwoNumbers(6, 4);
		cal.subTwoNumbers(20, 10);
		cal.multiplyTwoNumbers(2, 3);
	}
	

}
