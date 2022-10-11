package week1.day2;

public class Mobile {
	public void sendMessage() {
		System.out.println("Send Message");
	}
	public void shareDocuments() {
		System.out.println("Share Documents");
	}
	public void call() {
		System.out.println("Call");
	}
	public static void main(String[] args) {
		Mobile activity=new Mobile();
		activity.sendMessage();
		activity.shareDocuments();
		activity.call();
	}

}
