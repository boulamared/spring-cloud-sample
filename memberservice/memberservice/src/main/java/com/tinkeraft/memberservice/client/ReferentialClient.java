package com.tinkeraft.memberservice.client;

import com.tinkeraft.memberservice.dto.RefStatusDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "${service.referential.name}")
public interface ReferentialClient {

    @RequestMapping(method = RequestMethod.GET, value = "/ref-status")
    List<RefStatusDTO> getAllRefStatuses();
}

