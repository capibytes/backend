package com.capibytes.datalytics.dtos.request;

import com.capibytes.datalytics.domain.entities.Contact;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.FetchType;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class ConsultantRequestDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String name;
    private String cpf;
    private String email;
    private Set<Integer> profiles = new HashSet<>();
    private List<Contact> contacts = new ArrayList<>();
    private String especializacao;
    private String sobre;
    private Set<String> links = new HashSet<>();
}
