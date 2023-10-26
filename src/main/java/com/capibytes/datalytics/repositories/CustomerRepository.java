package com.capibytes.datalytics.repositories;

import com.capibytes.datalytics.domain.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository <Customer, Long>{
}
