package com.capibytes.datalytics.domain.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;

public class Contact{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataContact;

    @ManyToOne
    @JoinColumn(name = "consultant_id")
    private  Consultant consultant;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}
