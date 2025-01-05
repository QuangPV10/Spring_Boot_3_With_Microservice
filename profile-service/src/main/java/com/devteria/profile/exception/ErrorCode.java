package com.devteria.profile.exception;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public enum ErrorCode {
    INVALID_KEY(1000, "Invalid message key", HttpStatus.INTERNAL_SERVER_ERROR),
    USER_EXISTED(1001,"User existed", HttpStatus.BAD_REQUEST),
    USER_NOT_FOUND(1002, "User not found", HttpStatus.BAD_REQUEST),
    USERNAME_INVALID(1003, "UserName must be at least {min} character", HttpStatus.BAD_REQUEST),
    PASSWORD_INVALID(1004, "Password must be at least {min} characters", HttpStatus.BAD_REQUEST),
    USER_NOT_EXISTED(1005,"User not existed", HttpStatus.NOT_FOUND),
    UNAUTHENTICATED(1006,"Unauthenticated", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED(1007,"You do not have permission", HttpStatus.FORBIDDEN),
    INVALID_DOB(1008,"Your age must be at least {min}", HttpStatus.BAD_REQUEST),
    ;

    int code;
    String message;
    HttpStatusCode httpStatusCode;

}