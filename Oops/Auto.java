package Oops;

public class Auto extends Bajaj{
public void handleStarter() {
	System.out.println("handle starter");
}
public static void main(String[] args) {
	Auto auto=new Auto();
	auto.applyBreak();
	auto.soundHorn();
	auto.handleStarter();
}
}
