package com.tinkeraft.referential.controller;

import com.tinkeraft.referential.dto.RefStatusDTO;
import com.tinkeraft.referential.service.RefStatusService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/ref-status")
@AllArgsConstructor
public class RefStatusController {

    @Lazy
    private RefStatusService refStatusService;

    @GetMapping
    public ResponseEntity<List<RefStatusDTO>> getAllStatuses() {
        return new ResponseEntity<>(this.refStatusService.getAllRefStatuses(), HttpStatus.OK);
    }
}
