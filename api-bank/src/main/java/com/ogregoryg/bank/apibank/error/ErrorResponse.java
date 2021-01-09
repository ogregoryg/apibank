package com.ogregoryg.bank.apibank.error;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.Collections;
import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class ErrorResponse {

    private final int statusCode;
    private final List<String> messages;

    static ErrorResponse of (HttpStatus httpStatus, List<String> errors){
        return new ErrorResponse(httpStatus.value(), errors);
    }
    static ErrorResponse of (HttpStatus httpStatus, String error) {
        return new ErrorResponse(httpStatus.value(), Collections.singletonList(error));
    }


}
