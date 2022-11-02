package Oops;

public class BmwMLi extends AudiMLi {
public void applyGear() {
	System.out.println("Apply Gear");
}
public static void main(String[] args) {
	BmwMLi bmw=new BmwMLi();
	bmw.applyBreak();
	bmw.switchOnAc();
	bmw.openSunRoof();
	bmw.applyGear();
}
}
