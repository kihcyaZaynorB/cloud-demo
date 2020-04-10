package com.kihcyaz.aynorb.cloud.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServerResponse<T> {
    private Integer code;

    private String message;

    private T data;

    public ServerResponse(Integer code, String message) {
        this(code, message, null);
    }
}
