package com.capibytes.datalytics.domain.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

public class Contact implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String description;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataContact;

    @ManyToOne
    @JoinColumn(name = "consultant-id")
    private  Consultant consultant;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
