package com.tinkeraft.memberservice.repository;

import com.tinkeraft.memberservice.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByLicenceNumber(Long licenceNumber);
}
