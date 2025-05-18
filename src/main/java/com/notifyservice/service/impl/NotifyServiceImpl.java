package com.notifyservice.service.impl;

import com.notifyservice.dto.request.NotifyRequestDto;
import com.notifyservice.channel.NotificationChannel;
import com.notifyservice.channel.factory.NotificationChannelFactory;
import com.notifyservice.entity.NotifyEntity;
import com.notifyservice.mapper.NotifyMapper;
import com.notifyservice.repository.NotifyRepository;
import com.notifyservice.service.NotifyService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NotifyServiceImpl implements NotifyService {

    private final NotifyRepository notifyRepository;
    private final NotificationChannelFactory channelFactory;

    @Override
    public void sendNotification(NotifyRequestDto dto) {
        NotificationChannel channel = channelFactory.getChannel(dto.getType());
        channel.send(dto);
        NotifyEntity notify = NotifyMapper.toEntity(dto);
        notify.setSent(true);
        notifyRepository.save(notify);
    }

}
