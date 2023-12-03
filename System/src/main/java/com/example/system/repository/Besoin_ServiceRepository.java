package com.example.system.repository;

import com.example.system.model.Besoin;
import com.example.system.model.Besoin_Service;
import com.example.system.view.Groupement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Besoin_ServiceRepository extends JpaRepository<Besoin_Service,String> {
    @Query(value = "SELECT * FROM v_besoin_seq", nativeQuery = true)
    int getNextVal();
    @Query(value = "SELECT * FROM getSequence(:length , :prefix, :sequence)", nativeQuery = true)
    String getSequence(@Param("length") int length, @Param("prefix") String prefix, @Param("sequence") int sequence);
    @Query(value = "SELECT * FROM v_besoin_validee", nativeQuery = true)
    Iterable<Besoin> getBesoinValidee();

    @Query(value = "SELECT * FROM v_besoin_service_validee", nativeQuery = true)
    Iterable<Besoin_Service> getBesoinServiceValidee();

    @Query(value = "SELECT * FROM v_detail_besoin_nature where nature = :nature", nativeQuery = true)
    Iterable<Besoin> getDetailBesoinNonValidee(@Param("nature") String nature);

    @Query(value = "SELECT * FROM v_get_besoin_service_non_validee", nativeQuery = true)
    Iterable<Groupement> getBesoinGroupement();
}
