package com.capibytes.datalytics.dtos.request;

import com.capibytes.datalytics.domain.entities.Contact;
import io.swagger.v3.oas.models.info.Contact;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class CustomerRequestDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String name;
    private String cpf;
    private String email;
    private Set<Integer> profiles = new HashSet<>();
    private List<Contact> contacts = new ArrayList<>();
}
