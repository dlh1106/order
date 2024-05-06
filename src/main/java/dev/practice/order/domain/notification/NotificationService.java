package dev.practice.order.domain.notification;

public interface NotificationService {
    void sendEmail(String email, String title, String description);
    void sendKakao(String phone, String description);
    void sendSms(String phone, String description);
}
