package com.notifyservice.channel.factory;

import com.notifyservice.channel.NotificationChannel;
import com.notifyservice.dto.enums.NotifyType;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class NotificationChannelFactory {

    private final Map<String, NotificationChannel> channels;

    public NotificationChannelFactory(List<NotificationChannel> channelList) {
        channels = new HashMap<>();
        for (NotificationChannel c : channelList) {
            channels.put(c.getClass().getSimpleName().replace("Channel", "").toUpperCase(), c);
        }
    }

    public NotificationChannel getChannel(NotifyType type) {
        return channels.get(type.name());
    }
}

