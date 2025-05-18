package com.notifyservice.controller;

import com.notifyservice.dto.request.NotifyRequestDto;
import com.notifyservice.service.NotifyService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1/notify")
@AllArgsConstructor
public class NotifyController {

    private final NotifyService notifyService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public void sendNotification(NotifyRequestDto requestDto){
        notifyService.sendNotification(requestDto);
    }

}
