package com.notifyservice.channel.factory;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.Notification;
import com.notifyservice.channel.NotificationChannel;
import com.notifyservice.dto.request.NotifyRequestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PushChannel implements NotificationChannel {

    @Override
    public void send(NotifyRequestDto request) {
        try {
            Message message = Message.builder()
                    .setToken((String) request.getMetadata().get("deviceToken"))
                    .setNotification(Notification.builder()
                            .setTitle(request.getSubject())
                            .setBody(request.getContent())
                            .build())
                    .build();

            FirebaseMessaging.getInstance().send(message);
        } catch (Exception e) {
            log.error("PushChannel exception: {}" , e.getMessage());
        }
    }

}
