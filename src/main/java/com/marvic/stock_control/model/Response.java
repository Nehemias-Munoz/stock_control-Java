package com.marvic.stock_control.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.Map;

@Data
//Ignorar campos con valores nulos
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuperBuilder
public class Response {
    private LocalDateTime timeStamp;
    private HttpStatus status;
    private Integer statusCode;
    private String message;
    private Map<?,?> data;
    private String devMessage;
}
