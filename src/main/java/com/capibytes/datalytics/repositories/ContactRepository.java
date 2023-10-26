package com.capibytes.datalytics.repositories;

import com.capibytes.datalytics.domain.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository <Contact, Long>{
}
