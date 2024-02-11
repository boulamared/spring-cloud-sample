package com.tinkeraft.referential.repository;

import com.tinkeraft.referential.domain.RefStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefStatusRepository extends JpaRepository<RefStatus,String> {
    RefStatus findByCode(String code);
}
