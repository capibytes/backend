package com.capibytes.datalytics.domain.services;

import com.capibytes.datalytics.domain.entities.Consultant;
import com.capibytes.datalytics.repositories.ConsultantRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultantService {

    @Autowired
    ConsultantRepository consultantRepository;

    @Transactional
    public List<Consultant> findAll() {
        return consultantRepository.findAll();
    }

    @Transactional
    public Consultant save(Consultant consultant){
        return consultantRepository.save(consultant);
    }

    @Transactional
    public void delete(Consultant consultant){
        consultantRepository.delete(consultant);

    }

    public Optional<Consultant> findById(Long id){
        return consultantRepository.findById(id);
    }

}
