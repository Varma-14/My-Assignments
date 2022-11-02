package Oops;

public class AudiMLi extends CarMLi{
	public void openSunRoof() {
		System.out.println("Open sun roof");
	}
	public static void main(String[] args) {
		AudiMLi audi=new AudiMLi();
		audi.applyBreak();
		audi.switchOnAc();
		audi.openSunRoof();
	}

}
