package com.tinkeraft.memberservice.dto;

import lombok.Builder;
import lombok.With;

@Builder
@With
public record RefStatusDTO(String code , String label , String description) {
}
