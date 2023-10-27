package com.capibytes.datalytics.dtos.response;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Data
public class FormResponseDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private String title;
    private String description;
}
