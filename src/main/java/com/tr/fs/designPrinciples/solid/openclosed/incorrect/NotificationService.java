package com.tr.fs.designPrinciples.solid.openclosed.incorrect;

public class NotificationService {
    public void sendNotification(String message, String medium) {
        if (medium.equalsIgnoreCase("email")) {
            // Logic to send email notification
        } else if (medium.equalsIgnoreCase("sms")) {
            // Logic to send SMS notification
        } else if (medium.equalsIgnoreCase("push")) {
            // Logic to send push notification
        }
    }
}
