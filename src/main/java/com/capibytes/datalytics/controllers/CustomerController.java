package com.capibytes.datalytics.controllers;

import com.capibytes.datalytics.domain.services.CustomerService;
import com.capibytes.datalytics.dtos.request.CustomerRequestDTO;
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
@RequestMapping(value = "/api/customer")
public class CustomerController {
    @Autowired
    MapStructMapper mapStructMapper;
    @Autowired
    CustomerService customerService;

    @GetMapping
    @Operation(summary = "Listar todas as conversas", description = "Recupera a lista de todas as conversas cadastrados.")
    @ApiResponse(responseCode = "200", description = "Lista de conversas encontradas com sucesso")
    public ResponseEntity<List<CustomerRequestDTO>> findAll(){
        return new ResponseEntity<>(mapStructMapper.customerRequestDTOAllToCustomer(customerService.findAll()), HttpStatus.OK);
    }
}
