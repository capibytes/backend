package com.capibytes.datalytics.domain.mappers;

import com.capibytes.datalytics.domain.entities.Consultant;
import com.capibytes.datalytics.domain.entities.Contact;
import com.capibytes.datalytics.domain.entities.Customer;
import com.capibytes.datalytics.domain.entities.Form;
import com.capibytes.datalytics.dtos.request.ConsultantRequestDTO;
import com.capibytes.datalytics.dtos.request.ContactRequestDTO;
import com.capibytes.datalytics.dtos.request.CustomerRequestDTO;
import com.capibytes.datalytics.dtos.request.FormRequestDTO;
import com.capibytes.datalytics.dtos.response.ContactResponseDTO;
import com.capibytes.datalytics.dtos.response.CustomerResponseDTO;
import com.capibytes.datalytics.dtos.response.FormResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "Spring")
public interface MapStructMapper {


    // Instancia para utlizar o MapStruct caso queira
    MapStructMapper INSTANCE = Mappers.getMapper(MapStructMapper.class);


    List<ConsultantRequestDTO> consultantRequestDTOAllToConsultant(List<Consultant> consultant);

    Consultant consultantToConsultantRequestDTO(ConsultantRequestDTO contactRequestDTO);

    ConsultantRequestDTO consultantRequestDTOToConsultant(Consultant consultant);

    List<CustomerRequestDTO> customerRequestDTOAllToCustomer(List<Customer> customer);

    Customer customerToCustomerResponseDTO(CustomerResponseDTO customerResponseDTO);

    CustomerRequestDTO customerRequestDTOToCustomer(Customer customer);


    List<ContactRequestDTO> contactRequestDTOAllToContact(List<Contact> contact);

    Contact contactToContactResponseDTO(ContactResponseDTO contactResponseDTO);

    ContactRequestDTO contactRequestDTOToContact(Contact contact);

    Form formToFormResponseDTO(FormResponseDTO formResponseDTO);

    FormRequestDTO formRequestDTOToForm(Form form);

}
