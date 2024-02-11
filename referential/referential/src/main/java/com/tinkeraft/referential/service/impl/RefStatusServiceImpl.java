package com.tinkeraft.referential.service.impl;

import com.tinkeraft.referential.domain.RefStatus;
import com.tinkeraft.referential.dto.RefStatusDTO;
import com.tinkeraft.referential.mapper.RefStatusMapper;
import com.tinkeraft.referential.repository.RefStatusRepository;
import com.tinkeraft.referential.service.RefStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RefStatusServiceImpl implements RefStatusService {

    private final RefStatusMapper refStatusMapper;

    @Autowired
    private RefStatusRepository refStatusRepository;

    public RefStatusServiceImpl(RefStatusMapper refStatusMapper) {
        this.refStatusMapper = refStatusMapper;
    }


    @Override
    public List<RefStatusDTO> getAllRefStatuses() {
        return this.RefStatusesCollectionToRefStatusDTOs(this.refStatusRepository.findAll());
    }

    @Override
    public RefStatusDTO getRefStatusByCode(String code) {
        return refStatusMapper.convertToDTO(this.refStatusRepository.findByCode(code));
    }

    private List<RefStatusDTO> RefStatusesCollectionToRefStatusDTOs(List<RefStatus> refStatuses) {
        return refStatuses.stream().map(refstatus -> this.refStatusMapper.convertToDTO(refstatus)).collect(Collectors.toList());
    }
}
