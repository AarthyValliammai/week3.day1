package week3.day1;

public class AndroidPhone extends SmartPhone {
	public void takeVideo() {
		System.out.println(" video paused");
	}

	public static void main(String[] args) {
		AndroidPhone Android =new AndroidPhone();
		Android.makeCall();
		Android.sendMsg();
		Android.saveContact();
		Android.accessWhatsapp();
		Android.takeVideo();
	}

}
