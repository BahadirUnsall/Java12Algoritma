package lesson025.solid.util.singleResponsibility;

import lesson025.solid.util.Notification;
import lesson025.solid.util.User;

public class Instagram {
	public void sendNotification(User user) {
		sendEmail(user);
		sendSms(user);
	}
	
	public void sendEmail(User user) {
		if (user.getEmail() != null) {
			Notification.sendEmail(user.getEmail());
		}
	}
	public void sendSms(User user) {
		if (user.getEmail() != null) {
			Notification.sendSms(user.getPhone());
		}
	}
}
