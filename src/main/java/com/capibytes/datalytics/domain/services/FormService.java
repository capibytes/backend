package com.capibytes.datalytics.domain.services;

import com.capibytes.datalytics.domain.entities.Form;
import com.capibytes.datalytics.repositories.FormRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormService {
    @Autowired
    FormRepository formRepository;

    @Transactional
    public List<Form> findAll() {
        return formRepository.findAll();
    }

    @Transactional
    public Form save(Form form){
        return formRepository.save(form);
    }

    @Transactional
    public void delete(Form form){
        formRepository.delete(form);

    }

    public Optional<Form> findById(Long id){
        return formRepository.findById(id);
    }
}
