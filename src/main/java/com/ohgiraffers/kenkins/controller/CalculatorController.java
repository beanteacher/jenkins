package com.ohgiraffers.kenkins.controller;

import com.ohgiraffers.kenkins.dto.CalculatorDTO;
import com.ohgiraffers.kenkins.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class CalculatorController {

    private final CalculatorService calculatorService;

    @GetMapping("/health")
    public String healthCheck() {
        return "pipeline test check";
    }

    @GetMapping("/plus")
    public ResponseEntity<CalculatorDTO> plusTwoNumbers(CalculatorDTO dto) {
        log.info("dto : {}", dto);

        dto.setSum(calculatorService.plusTwoNumbers(dto));

        return ResponseEntity.ok(dto);
    }
}
