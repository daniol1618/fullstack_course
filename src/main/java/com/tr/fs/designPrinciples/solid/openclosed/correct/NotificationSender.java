package com.tr.fs.designPrinciples.solid.openclosed.correct;

interface NotificationSender {
    void send(String message);
}

class EmailNotificationSender implements NotificationSender {
    @Override
    public void send(String message) {
        // Logic to send email notification
    }
}

class SMSNotificationSender implements NotificationSender {
    @Override
    public void send(String message) {
        // Logic to send SMS notification
    }
}

class PushNotificationSender implements NotificationSender {
    @Override
    public void send(String message) {
        // Logic to send push notification
    }
}

class NotificationService {
    public void sendNotification(String message, NotificationSender sender) {
        sender.send(message);
    }
}

