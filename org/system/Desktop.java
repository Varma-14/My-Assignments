package org.system;

public class Desktop extends Computer {
	public void desktopSize(float dsktpSz) {
		System.out.println("desktopSize"+"="+dsktpSz);
	}
public static void main(String[] args) {
	Desktop details= new Desktop();
	details.computerModel("hp");
	details.desktopSize(15.6F);
}
}
