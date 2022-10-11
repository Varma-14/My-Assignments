package week1.day2;

public class Calculator1 {
	public int addTwoNumbers(int a, int b) {
		int c=a+b;
		return c;
	
	}
public void subsTwoNumbers(int addTwoNumbers, int b) {
	int e=addTwoNumbers-b;
	System.out.println(e);
}
public static void main(String[] args) {
	Calculator1 cal= new Calculator1();
	int addTwoNumbers= cal.addTwoNumbers(50, 50);
	System.out.println(addTwoNumbers);
	cal.subsTwoNumbers(addTwoNumbers, 50);
}
}
