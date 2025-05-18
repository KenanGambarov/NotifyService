package com.notifyservice.channel.factory;

import com.notifyservice.channel.NotificationChannel;
import com.notifyservice.dto.request.NotifyRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class EmailChannel implements NotificationChannel {

    private final JavaMailSender javaMailSender;


    private void sendEmail(String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        message.setFrom("testl@test.com");
        javaMailSender.send(message);
    }

    @Override
    public void send(NotifyRequestDto request) {
        sendEmail("kenan.gambarov@gmail.com", request.getSubject(), request.getContent());
    }
}
