package com.capibytes.datalytics.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Customer extends Person{

    @JsonIgnore
    @OneToMany(mappedBy = "customer")
    private List<Contact> tickets = new ArrayList<>();

}
