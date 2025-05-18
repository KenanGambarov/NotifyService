package com.notifyservice.channel.factory;

import com.notifyservice.channel.NotificationChannel;
import com.notifyservice.dto.request.NotifyRequestDto;
import org.springframework.stereotype.Component;

@Component
public class SMSChannel implements NotificationChannel {

    @Override
    public void send(NotifyRequestDto request) {

    }

}
