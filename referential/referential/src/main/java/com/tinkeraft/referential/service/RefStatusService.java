package com.tinkeraft.referential.service;

import com.tinkeraft.referential.domain.RefStatus;
import com.tinkeraft.referential.dto.RefStatusDTO;

import java.util.List;

public interface RefStatusService {

    public List<RefStatusDTO> getAllRefStatuses();

    public RefStatusDTO getRefStatusByCode(String code);
}
