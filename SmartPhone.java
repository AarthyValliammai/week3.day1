package week3.day1;

public class SmartPhone extends Mobile {

	public static void main(String[] args) {
		SmartPhone smart=new SmartPhone();
		smart.accessWhatsapp();
		smart.takeVideo();
	}
	public void accessWhatsapp() {
		System.out.println("open whatsapp");
	}
	public void takeVideo() {
		System.out.println("record video");
	}
}
