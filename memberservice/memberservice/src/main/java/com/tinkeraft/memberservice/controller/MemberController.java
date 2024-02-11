package com.tinkeraft.memberservice.controller;

import com.tinkeraft.memberservice.dto.RefStatusDTO;
import com.tinkeraft.memberservice.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/status/all")
    public ResponseEntity<List<RefStatusDTO>> getAllStatuses() {
        return new ResponseEntity<>(this.memberService.getAllStatuses(), HttpStatus.OK);
    }
}