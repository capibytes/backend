package com.capibytes.datalytics.domain.services;

import com.capibytes.datalytics.domain.entities.Contact;
import com.capibytes.datalytics.repositories.ContactRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository;

    @Transactional
    public List<Contact> findAll() {
        return contactRepository.findAll();
    }

    @Transactional
    public Contact save(Contact contact){
        return contactRepository.save(contact);
    }

    @Transactional
    public void delete(Contact contact){
        contactRepository.delete(contact);

    }

    public Optional<Contact> findById(Long id){
        return contactRepository.findById(id);
    }

}
