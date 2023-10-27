package com.capibytes.datalytics.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Consultant extends Person {

    @JsonIgnore
    @OneToMany(mappedBy = "consultant")
    private List<Contact> contacts = new ArrayList<>();

    private String especializacao;
    private String sobre;
    private Set<String> links = new HashSet<>();
}
