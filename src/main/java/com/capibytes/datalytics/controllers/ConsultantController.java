package com.capibytes.datalytics.controllers;

import com.capibytes.datalytics.domain.mappers.MapStructMapper;
import com.capibytes.datalytics.domain.services.ConsultantService;
import com.capibytes.datalytics.dtos.request.ConsultantRequestDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/consultant")
public class ConsultantController {

    @Autowired
    MapStructMapper mapStructMapper;
    @Autowired
    ConsultantService consultantService;

    @GetMapping
    @Operation(summary = "Listar todos os Consultores", description = "Recupera a lista de todos os consultores cadastrados.")
    @ApiResponse(responseCode = "200", description = "Lista de consultores encontrada com sucesso")
    public ResponseEntity<List<ConsultantRequestDTO>> findAll(){
        return new ResponseEntity<>(mapStructMapper.consultantRequestDTOAllToConsultant(consultantService.findAll()), HttpStatus.OK);
    }

}
