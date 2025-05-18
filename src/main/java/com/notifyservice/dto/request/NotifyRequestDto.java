package com.notifyservice.dto.request;

import com.notifyservice.dto.enums.NotifyType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NotifyRequestDto {

    private Long userId;

    private NotifyType type;

    private String subject;

    private String content;

    private Map<String, Object> metadata;


}
