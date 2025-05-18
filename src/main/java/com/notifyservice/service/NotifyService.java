package com.notifyservice.service;

import com.notifyservice.dto.request.NotifyRequestDto;

public interface NotifyService {

    void sendNotification(NotifyRequestDto dto);

}
