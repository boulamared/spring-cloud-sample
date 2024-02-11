package com.tinkeraft.memberservice.service.impl;

import com.tinkeraft.memberservice.client.ReferentialClient;
import com.tinkeraft.memberservice.domain.Member;
import com.tinkeraft.memberservice.dto.RefStatusDTO;
import com.tinkeraft.memberservice.repository.MemberRepository;
import com.tinkeraft.memberservice.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private ReferentialClient refClient;

    @Override
    public List<Member> getAllMembers() {

        return memberRepository.findAll();
    }

    @Override
    public Member createNewMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public List<RefStatusDTO> getAllStatuses() {
        List<RefStatusDTO> allRefStatusDTOS = refClient.getAllRefStatuses();
        return allRefStatusDTOS.stream().map(status -> new RefStatusDTO(status.code(),status.label(),status.description()))
                .map(status -> status.withCode("Default"))
                .toList();
    }
}
