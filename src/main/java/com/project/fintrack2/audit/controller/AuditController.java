package com.project.fintrack2.audit.controller;


import com.project.fintrack2.audit.dto.response.AuditResponseDto;
import com.project.fintrack2.utility.response.ResponseWrapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/audit")
public class AuditController {

    @GetMapping
    public ResponseWrapper<AuditResponseDto> getAudit(){
        return null;
    }
}
