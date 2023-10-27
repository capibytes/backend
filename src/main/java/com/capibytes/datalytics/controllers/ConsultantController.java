package com.capibytes.datalytics.controllers;

import com.capibytes.datalytics.domain.mappers.MapStructMapper;
import com.capibytes.datalytics.domain.services.ConsultantService;
import com.capibytes.datalytics.dtos.request.ConsultantRequestDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/consultant")
public class ConsultantController {

    @Autowired
    MapStructMapper mapStructMapper;
    @Autowired
    ConsultantService consultantService;

    @PostMapping("/cadastrar")
    public ResponseEntity<Object> creat(@RequestBody ConsultantRequestDTO consultantRequestDTO){
        consultantService.save(mapStructMapper.consultantRequestDTOToConsultant(consultantRequestDTO));
        return ResponseEntity.status(HttpStatus.CREATED).body("Produto cadastrado com sucesso");
    }
}
