package com.capibytes.datalytics.controllers;

import com.capibytes.datalytics.domain.mappers.MapStructMapper;
import com.capibytes.datalytics.domain.services.FormService;
import com.capibytes.datalytics.dtos.request.FormRequestDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/form")
public class FormController {

    @Autowired
    MapStructMapper mapStructMapper;
    @Autowired
    FormService formService;

    @GetMapping
    @Operation(summary = "Listar todos os formularios", description = "Recupera a lista de todos os formularios cadastrados.")
    @ApiResponse(responseCode = "200", description = "Lista de formularios encontrada com sucesso")
    public ResponseEntity<List<FormRequestDTO>> findAll(){
        return new ResponseEntity<>(mapStructMapper.formRequestDTOAllToContact(formService.findAll()), HttpStatus.OK);
    }
}
