package com.tinkeraft.memberservice.service;

import com.tinkeraft.memberservice.domain.Member;
import com.tinkeraft.memberservice.dto.RefStatusDTO;

import java.util.List;

public interface MemberService {

    public List<Member> getAllMembers();

    public Member createNewMember(Member member);

    public List<RefStatusDTO> getAllStatuses();
}
