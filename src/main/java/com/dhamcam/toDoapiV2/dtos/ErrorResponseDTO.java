package com.dhamcam.toDoapiV2.dtos;

import com.dhamcam.toDoapiV2.enums.InternalErrorCode;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class ErrorResponseDTO {
    private InternalErrorCode code;
    private String message;
    private List<String> details;
}