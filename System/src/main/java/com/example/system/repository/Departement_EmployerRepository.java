package com.example.system.repository;

import com.example.system.model.Departement_Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Departement_EmployerRepository extends JpaRepository<Departement_Employer, String> {
    @Query(value = "SELECT * FROM v_deptemp_seq", nativeQuery = true)
    int getNextVal();
    @Query(value = "SELECT * FROM getSequence(:length , :prefix, :sequence)", nativeQuery = true)
    String getSequence(@Param("length") int length, @Param("prefix") String prefix, @Param("sequence") int sequence);
}
