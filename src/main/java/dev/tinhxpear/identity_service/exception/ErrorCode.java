package dev.tinhxpear.identity_service.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error"),
    USER_EXISTED(1001, "User existed!"),
    USERNAME_INVALID(1002, "Username must be at least 3 characters"),
    PASSWORD_INVALID(1003, "Password must be at least 8 characters"),
    INVALID_KEY(1004, "Invalid message key"),
    ;
    private final int code;
    private final String message;


}
