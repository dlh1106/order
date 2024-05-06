package dev.practice.order.infrastructure.notification;

import dev.practice.order.domain.notification.NotificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class NotificationExcutor implements NotificationService {

    @Override
    public void sendEmail(String email, String title, String description) {
        log.info("send email");
    }

    @Override
    public void sendKakao(String phone, String description) {
        log.info("send kakao");
    }

    @Override
    public void sendSms(String phone, String description) {
        log.info("send sms");
    }
}
