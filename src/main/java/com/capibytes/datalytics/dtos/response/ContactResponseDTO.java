package com.capibytes.datalytics.dtos.response;

import com.capibytes.datalytics.domain.entities.Consultant;
import com.capibytes.datalytics.domain.entities.Customer;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Data
public class ContactResponseDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private String title;
    private String description;
    private LocalDate dataContact;
    private Consultant consultant;
    private Customer customer;
}
