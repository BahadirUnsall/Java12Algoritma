package lesson025.solid.util;

public class Notification {
	public static void sendEmail(String email) {
		System.out.println(email + " emailine g�nderiliyor...");
	}
	public static void sendSms(String phone) {
		System.out.println(phone + " telefonuna sms g�nderiliyor.");
	}
}
