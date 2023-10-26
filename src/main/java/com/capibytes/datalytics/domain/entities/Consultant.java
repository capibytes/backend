package com.capibytes.datalytics.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Consultant {

    @JsonIgnore
    @OneToMany(mappedBy = "consultant")
    private List<Contact> contacts = new ArrayList<>();

    private String especializacao;
    private String sobre;

    private Set<String> links = new HashSet<>();
}
