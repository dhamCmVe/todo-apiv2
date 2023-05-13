package com.dhamcam.toDoapiV2.exceptions;

import com.dhamcam.toDoapiV2.enums.InternalErrorCode;

public class NotFoundException extends RuntimeException {
    private InternalErrorCode code;

    public NotFoundException(InternalErrorCode code, String message) {
        super(message);
        this.code = code;
    }

    public InternalErrorCode getCode() {
        return code;
    }
}