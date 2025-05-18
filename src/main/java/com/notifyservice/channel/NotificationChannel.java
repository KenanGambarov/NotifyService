package com.notifyservice.channel;

import com.notifyservice.dto.request.NotifyRequestDto;

public interface NotificationChannel {

    void send(NotifyRequestDto request);

}
