package com.capibytes.datalytics.repositories;

import com.capibytes.datalytics.domain.entities.Consultant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultantRepository extends JpaRepository <Consultant, Long>{

}
