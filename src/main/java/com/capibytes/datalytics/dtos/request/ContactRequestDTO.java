package com.capibytes.datalytics.dtos.request;

import com.capibytes.datalytics.domain.entities.Consultant;
import com.capibytes.datalytics.domain.entities.Customer;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Data
public class ContactRequestDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String title;
    private String description;
    private LocalDate dataContact;
    private Consultant consultant;
    private Customer customer;
}
