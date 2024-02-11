package com.tinkeraft.referential.mapper;

import com.tinkeraft.referential.domain.RefStatus;
import com.tinkeraft.referential.dto.RefStatusDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface RefStatusMapper {

    RefStatusMapper INSTANCE = Mappers.getMapper( RefStatusMapper.class );

    RefStatusDTO convertToDTO(RefStatus refStatus);

    RefStatus convertToToEntity(RefStatusDTO refStatusDTO);
}
