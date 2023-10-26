package com.capibytes.datalytics.domain.services;

import com.capibytes.datalytics.domain.entities.Consultant;
import com.capibytes.datalytics.dto.ConsultantResponseDto;
import com.capibytes.datalytics.repositories.ConsultantRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ConsultantService {

    @Autowired
    ConsultantRepository cosnultantRepository;

    @Transactional
    public List<Consultant> findAll() {
        return cosnultantRepository.findAll();
    }


}
