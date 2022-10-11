package week1.day2;

public class Car {
	public void applyBreak() {
		System.out.println("ApplyBreak");
	}
	public void applyGear() {
		System.out.println("Apply Gear");
	}
	public void switchOnAc() {
		System.out.println("Switch on Ac");
	}
	public void applyAcclerate() {
		System.out.println("Apply Acclerate");
	}
	public static void main(String[] args) {
		Car action=new Car();
		action.applyBreak();
		action.applyGear();
		action.switchOnAc();
		action.applyAcclerate();
	}
	

}
