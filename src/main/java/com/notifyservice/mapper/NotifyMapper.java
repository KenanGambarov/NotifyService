package com.notifyservice.mapper;

import com.notifyservice.dto.request.NotifyRequestDto;
import com.notifyservice.entity.NotifyEntity;

public class NotifyMapper {

    public static NotifyEntity toEntity(NotifyRequestDto requestDto){
        return NotifyEntity.builder()
                .userId(requestDto.getUserId())
                .type(requestDto.getType())
                .content(requestDto.getContent())
                .subject(requestDto.getSubject())
                .build();
    }

}
